package com.itwill07.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BoardDao  {
	
	// 중복되는 부분 메쏘드로 만듬 
		public Connection getConnection() throws Exception{
			String driverClass="oracle.jdbc.OracleDriver";
			String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
			String user="jdeveloper20";
			String password="jdeveloper20";
		
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(url,user,password);
			return con;
		}
		
		public void close(Connection con) throws Exception{
			con.close();
		}
		
		
		
	
	/*
	 기본생성자 : 받는 매개변수가 없기때문에 항상 똑같은 내용 insert  
	public void insert() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		String insertSql =" insert into board(board_no,board_title,board_content) values(board_no_seq.nextval,'책13','내용13')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount +"행 insert");
		
	}
	*/
	
	public void insert(String title,String content) throws Exception{
		String insertSql ="insert into board(board_no,board_title,board_content) values(board_no= board_no_seq.nextval,board_title= ?,board_content =?)"; 
		
		Connection con=this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1,title);
		pstmt.setString(2,content);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+"행 insert");
		pstmt.close();
		this.close(con);
	}
	
	public void updateByPrimaryKey(String title,String content,int no) throws Exception{
		String updateSql = "update board set board_title=?,board_content=? where board_no=?";
		
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setInt(3, no);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount +"행 update");
		pstmt.close();
		this.close(con);
	}
	
	public void deleteByPrimaryKey(int no)  throws Exception{
		String deleteSql ="delete board where board_no=?";
	
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, no);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount + " 행 delete");
		pstmt.close();
		this.close(con);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}