package dao.board;

public class BoardDaoTest {

	public static void main(String[] args) throws Exception {
		BoardDao boardDao = new BoardDao();
		
		// boardDao.insert("dao 타이틀1", "dao 내용 1");

		boardDao.deleteByPrimaryKey(8);
		
		boardDao.updateByPrimaryKey("dao 타이틀 1", " dao 내용 1", 7);
		
		//boardDao.selectAll();
		
		boardDao.selectByPrimaryKey(7);
		
		
	}

}
