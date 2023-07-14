package com.itwill07.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BoardDeleteByPrimaryKeyMain {

	public static void main(String[] args) throws Exception{
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		String deleteSql="delete board where board_no=1";
		
		Class.forName(deleteSql);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);

	}

}
