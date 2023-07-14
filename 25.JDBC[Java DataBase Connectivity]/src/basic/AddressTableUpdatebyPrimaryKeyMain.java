package basic;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressTableUpdatebyPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		String updateSql=
				"update ADDRESS set name='김변경' , phone='888-8888',address ='서울시 강남구'";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(" >>update row count :" +rowCount);
		
		
	}

}
