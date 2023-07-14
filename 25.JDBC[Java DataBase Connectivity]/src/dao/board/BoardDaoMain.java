package dao.board;

public class BoardDaoMain {

	public static void main(String[] args) throws Exception{
		BoardDao boardDao = new BoardDao();
		
		//delete
		boardDao.deleteByBoardNo(13);
		
		//insert
		System.out.println(boardDao.insert(new Board(0,"추가1","추가1", null, 1)));;
		
		//update
		Board findBoard = boardDao.selectByBoardNo(2);
		findBoard.setBoardTitle("업데이트1");
		findBoard.setBoardContent("업데이트1");
		System.out.println(boardDao.updateByBoardNo(findBoard));
		
		
		//selectByBoardNo
		boardDao.selectByBoardNo(2);
		
		//selectAll
		boardDao.selectAll();
		
		
		
	}

}
