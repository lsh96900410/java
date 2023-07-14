package com.itwill07.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BoardUpdateByPrimaryKeyMain {

	public static void main(String[] args) throws Exception{
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		String updateSql=
				"update board set board_title='변경제목',board_content='변경content' where board_no=2";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);

	}

}
