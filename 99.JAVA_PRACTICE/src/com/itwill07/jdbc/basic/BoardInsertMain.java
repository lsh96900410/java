package com.itwill07.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertMain {

	public static void main(String[] args) throws Exception {
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		String insertsql=
				" insert into board(board_no,board_title,board_content)"
				+ "values(board_no_seq.nextval,'책','내용')";
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt= con.createStatement();
		int rowCount = stmt.executeUpdate(insertsql);
		
		
	}

}
