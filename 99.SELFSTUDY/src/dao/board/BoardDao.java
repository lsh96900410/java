package dao.board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDao {
	public Connection getConnection() throws Exception {
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		return con;
	}
	
	public void close(Connection con) throws Exception {
		con.close();
	}
	
	
	
	public void insert(String title,String content) throws Exception {
		String insertSql = " insert into board(board_no,board_title,board_content) "
							+ "values(board_no_seq.nextval,'"+ title +"','"+content+"')";
		Connection con =this.getConnection();
		Statement stmt= con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(rowCount+"행 insert");
		stmt.close();
		this.close(con);
	}
	
	public void updateByPrimaryKey(String title, String content,int no) throws Exception {
		String updateSql="update board set board_title=?,board_content=? where board_no=?";
		Connection con =this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setInt(3, no);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+"행 update");
		pstmt.close();
		this.close(con);
	}
	
	public void deleteByPrimaryKey(int no) throws Exception {
		String deleteSql="delete board where board_no=?";
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, no);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+"행 delete");
		pstmt.close();
		this.close(con);
	}
	
	public void selectByPrimaryKey(int no) throws Exception {
		String selectSql = "select * from board where board_no=? ";
		Connection con = this.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		pstmt.setInt(1, no);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int number =rs.getInt("board_no");
			String title = rs.getString("board_title");
			String content = rs.getString("board_content");
			Date wday = rs.getDate("Board_wday");
			int count= rs.getInt("board_read_count");
			System.out.println(number+"\t"+title+"\t"+content+"\t"+wday+"\t"+count);
		}
		rs.close();
		pstmt.close();
		this.close(con);
	}
	
	public void selectAll() throws Exception{
		String selectSql = "select * from board";
		Connection con = this.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		while(rs.next()) {
			int number =rs.getInt("board_no");
			String title = rs.getString("board_title");
			String content = rs.getString("board_content");
			Date wday = rs.getDate("Board_wday");
			int count = rs.getInt("board_read_count");
			System.out.println(number+"\t"+title+"\t"+content+"\t"+wday+"\t"+count);
		}
		rs.close();
		stmt.close();
		this.close(con);
	}
}
