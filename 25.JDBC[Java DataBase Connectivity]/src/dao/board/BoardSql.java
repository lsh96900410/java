package dao.board;

public class BoardSql {

	public static final String BOARD_INSERT=
			"insert into board values (board_no_seq.nextval,?,?,sysdate,?)";
	
	public static final String BOARD_UPDATE=
			"update board set board_title=?,board_content=? where board_no=?";
	
	public static final String BOARD_DELETE=
			"delete board where board_no=?";
	
	public static final String BOARD_SELECT_BY_BOARD_NO=
			"select * from board where board_no=?";
	
	public static final String BOARD_SELECT_ALL=
			"select * from board";
	
	
}
