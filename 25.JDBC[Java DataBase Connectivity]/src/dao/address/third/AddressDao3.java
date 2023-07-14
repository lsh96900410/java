package dao.address.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

/*
	Dao(Data Access Object) 클래스
	 - address 테이블에 CRUD(Create,Read,Update,Delete)작업을하는
	   단위메쏘드를 가지고있는 클래스
*/
public class AddressDao3 {
	/*
		데이타베이스 설정정보를 이용해서 Connection객체를 생성해서
		반환하는 역할을하는 메쏘드
	*/
	
	public Connection getConnection() throws Exception {
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		return con;
	}
	/*
		Connection객체를 close하는 메쏘드
	*/
	public void close(Connection con) throws Exception {
		con.close();
	}
	
	
	
	
	
	public int insert(String name,String phone,String address) throws Exception {
		String insertSql=
				"insert into address values(address_no_seq.nextval,'"+name+"','"+phone+"','"+address+"')";
		
		Connection con=this.getConnection();
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		// System.out.println(" >>insert row count :" +rowCount);
		stmt.close();
		this.close(con);
		return rowCount;
	}
	public int insert(Address insertAddress) throws Exception {
		String insertSql = "insert into address values(address_no_seq.nextval,?,?,?)";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1, insertAddress.getName());
		pstmt.setString(2, insertAddress.getPhone());
		pstmt.setString(3, insertAddress.getAddress());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		this.close(con);
		return rowCount;
	}
	
	public int updateByPrimaryKey(int no,String name,String phone,String address) throws Exception {
		String updateSql=
				"update ADDRESS set name=? , phone=? ,address =? where no=?";
		
		Connection con=this.getConnection();
		PreparedStatement pstmt=con.prepareStatement(updateSql);
		pstmt.setString(1, name);
		pstmt.setString(2, phone);
		pstmt.setString(3, address);
		pstmt.setInt(4, no);
		int rowCount = pstmt.executeUpdate();
		// System.out.println(" >>update row count :" +rowCount);
		pstmt.close();
		this.close(con);
		return rowCount;
	}
	
public int updateByPrimaryKey(Address updateAddress) throws Exception {
	String updateSql=
			"update ADDRESS set name=? , phone=? ,address =? where no=?";
	
	Connection con = this.getConnection();
	PreparedStatement pstmt = con.prepareStatement(updateSql);
	pstmt.setString(1, updateAddress.getName());
	pstmt.setString(2, updateAddress.getPhone());
	pstmt.setString(3, updateAddress.getAddress());
	pstmt.setInt(4, updateAddress.getNo());
	
	int rowCount = pstmt.executeUpdate();
	pstmt.close();
	this.close(con);
	return rowCount;
	}
	
	public int deleteByPrimaryKey(int no) throws Exception {
		String deleteSql=
				"delete from address where no=?";
		
		Connection con=this.getConnection();
		PreparedStatement pstmt=con.prepareStatement(deleteSql);
		pstmt.setInt(1, no);
		int rowCount = pstmt.executeUpdate();
		//System.out.println(" >>delete row count :" +rowCount);
		pstmt.close();
		this.close(con);
		return rowCount;
	}
	
	public Address findByPrimaryKey(int no) throws Exception {
		Address findAddress=null;
		String findSql=
				"select no,name,phone,address from address where no=?";
		
		Connection con=this.getConnection();
		PreparedStatement pstmt=con.prepareStatement(findSql);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			int number     = rs.getInt("no");
			String name    = rs.getString("name");
			String phone   = rs.getString("phone");
			String address = rs.getString("address");
			//System.out.println(number+"\t"+name+"\t"+phone+"\t"+address);
			findAddress = new Address(number, name, phone, address);
		}else {
		//System.out.println("친구없다");
	}
		rs.close();
		pstmt.close();
		this.close(con);
		return findAddress;
}
	
	public ArrayList<Address> findAll() throws Exception {
		ArrayList<Address> addressList = new ArrayList<Address>();
		
		String findSql=
				"select no,name,phone,address from address order by no";
		
		Connection con=this.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(findSql);
		
		if(rs.next()) {
			do {
				int no  	   = rs.getInt("no");
				String name    = rs.getString("name");
				String phone   = rs.getString("phone");
				String address = rs.getString("address");
				//System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
				Address tempAddress = new Address(no, name, phone, address);
				addressList.add(tempAddress);
				
			}while(rs.next());
		}
		rs.close();
		stmt.close();
		this.close(con);
		return addressList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
