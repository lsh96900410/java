package com.itwill07.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardSelectByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";

		String selectSqlByPk = "select * from board where board_no=3 ";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSqlByPk);
		
		/*
		이름               널?       유형             
		---------------- -------- -------------- 
		BOARD_NO         NOT NULL NUMBER(10)     
		BOARD_TITLE               VARCHAR2(255)  
		BOARD_CONTENT             VARCHAR2(4000) 
		BOARD_WDAY                DATE           
		BOARD_READ_COUNT          NUMBER(10)     

	*/
		
		if(rs.next()) {
			do {
				int no =rs.getInt("board_no");
				String title=rs.getString("board_title");
				String content=rs.getString("board_content");
				System.out.println(no);
			}while(rs.next());
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
