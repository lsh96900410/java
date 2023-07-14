package com.itwill07.jdbc.basic;

public class BoardTest {

	public static void main(String[] args) throws Exception {
		BoardDao boardDao = new BoardDao();
		//boardDao.insert("dao 제목1","dao 내용 1");
		
		boardDao.updateByPrimaryKey("up 제목1","up 내용 1", 2);
	
		boardDao.deleteByPrimaryKey(7);
	
	}

}
