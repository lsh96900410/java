package basic;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressTableSelectByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
				
		
	
	
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		/*
		 *  1. Driver class loading
		 * 	2. Connection 객체생성
		 * 	3. Statement 객체생성
		 * 	4. SQL문전송(SELECT)
		 * 	5. SQL문전송(Select)결과 ResultSet(결과집합)을 반환
		 * 	6. 연결객체해지(resource해지) close
		 */
				
		String selectSql=
				"select no,name,phone,address from address where no=1";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
		<< Statement >>
		ResultSet executeQuery(String sql) throws SQLException
			- Executes the given SQL statement, which returns a single ResultSet object.

			Parameters:
				sql - an SQL statement to be sent to the database, 
			          typically a static SQL SELECT statement
			Returns:
				a ResultSet object that contains the data produced by the given query; 
				never null
		 */
		ResultSet rs = stmt.executeQuery(selectSql);
		/*
		<<ResultSet>>
		boolean next() throws SQLException
			- Moves the cursor forward one row from its current position.
			- A ResultSet cursor is initially positioned before the first row; 
			  the first call to the method next makes the first row the current row; 
			  the second call makes the second row the current row, and so on.
		    - When a call to the next method returns false, 
		    	the cursor is positioned after the last row.
		*/
		
	/*
		이름      널?       유형           
		------- -------- ------------ 
		NO      NOT NULL 	NUMBER(10)   
		NAME             	VARCHAR2(50) 
		PHONE            	VARCHAR2(50) 
		ADDRESS          	VARCHAR2(60) 
	*/	
		/*
		while(rs.next()) {
			int no  	   = rs.getInt("no");
			String name    = rs.getString("name");
			String phone   = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		}
		*/
		
		if(rs.next()) {
				/* --------------------------------
				 * DB타입 		| 자바타입
				 * --------------------------------
				 * number		| int,double(float)
				 * varchar2,char| String
				 * Date			| Date
				 * --------------------------------
				 */
				
				int no  	   = rs.getInt("no");
				String name    = rs.getString("name");
				String phone   = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		}else {
			System.out.println("친구없다");
		}
		rs.close();
		stmt.close();
		con.close();
	
	
	}
}
