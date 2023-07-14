package dao.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 	- board(게시판) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */

public class BoardDao {
	private DataSource dataSource;
	
	public BoardDao() throws Exception{
		this.dataSource = new DataSource(); //connection,driver 등 데이타소스 접근객체
	}
	
	// deleteByBoardNo
	public int deleteByBoardNo(int no) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BoardSql.BOARD_DELETE);
		pstmt.setInt(1, no);
		int rowCount = pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	// insert 
	public int insert(Board board) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BoardSql.BOARD_INSERT);
		pstmt.setString(1, board.getBoardTitle());
		pstmt.setString(2, board.getBoardContent());
		pstmt.setInt(3, board.getBoardReadCount());
		int rowCount=pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	//updateByBoardNo
	public int updateByBoardNo(Board board) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BoardSql.BOARD_UPDATE);
		pstmt.setString(1, board.getBoardTitle());
		pstmt.setString(2, board.getBoardContent());
		pstmt.setInt(3, board.getBoardNo());
		int rowCount=pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	//findByBoardNo
	public Board selectByBoardNo(int no) throws Exception{
		Board board=null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt =con.prepareStatement(BoardSql.BOARD_SELECT_BY_BOARD_NO);
		pstmt.setInt(1, no);
		ResultSet rs =pstmt.executeQuery();
		
		while(rs.next()) {
			board =new Board(rs.getInt("board_no"),
					rs.getString("board_title"),
					rs.getString("board_content"),
					rs.getDate("board_wday"),
					rs.getInt("board_read_count"));
		}
		rs.close();
		dataSource.close(con);
		return board;
	}
	
	//selectAll
	public List<Board> selectAll() throws Exception{
		List<Board> boardList=new ArrayList<Board>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BoardSql.BOARD_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			boardList.add(new Board(rs.getInt("board_no"),
									rs.getString("board_title"),
									rs.getString("board_content"),
									rs.getDate("board_wday"),
									rs.getInt("board_read_count")));
		}
		rs.close();
		dataSource.close(con);
		return boardList;
	}
	
	
	
	
	
	
	
	/*
	이름               널?       유형             
	---------------- -------- -------------- 
	BOARD_NO         NOT NULL NUMBER(10)     
	BOARD_TITLE               VARCHAR2(255)  
	BOARD_CONTENT             VARCHAR2(4000) 
	BOARD_WDAY                DATE           
	BOARD_READ_COUNT          NUMBER(10)     
	 */

	


	
}
