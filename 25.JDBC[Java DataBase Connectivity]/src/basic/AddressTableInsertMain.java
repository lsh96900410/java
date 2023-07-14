package basic;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		
		
		String insertSql=
				"insert into address values(address_no_seq.nextval,'김경호','123-3456','경기도 포천시')";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(" >>insert row count :" +rowCount);
		
	
	
	
	
	
	
	
	
	
	}

}
