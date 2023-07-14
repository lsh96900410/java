package dao.board;

import java.sql.Date;

/*
VO(Value Object),DTO(Data Transfer Object)
	- board 테이블 1개 row의 데이타의 값을 가지는객체
	- board 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- board 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
이름               널?       유형             
---------------- -------- -------------- 
BOARD_NO         NOT NULL NUMBER(10)     
BOARD_TITLE               VARCHAR2(255)  
BOARD_CONTENT             VARCHAR2(4000) 
BOARD_WDAY                DATE           
BOARD_READ_COUNT          NUMBER(10)     
 */
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private Date boardWday;
	private int boardReadCount;
	
	public Board() {

	}

	
	
	public Board(int boardNo, String boardTitle, String boardContent, Date boardWday, int boardReadCount) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWday = boardWday;
		this.boardReadCount = boardReadCount;
	}

	public void setBoardWday(Date boardWday) {
		this.boardWday = boardWday;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}


	public Date getBoardWday() {
		return boardWday;
	}



	public int getBoardReadCount() {
		return boardReadCount;
	}

	public void setBoardReadCount(int boardReadCount) {
		this.boardReadCount = boardReadCount;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWday=" + boardWday + ", boardReadCount=" + boardReadCount + "]";
	}

	
		
	
	
}
