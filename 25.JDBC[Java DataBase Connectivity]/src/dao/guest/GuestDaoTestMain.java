package dao.guest;

import java.sql.Date;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		GuestDao guestDao = new GuestDao();
		
		System.out.println("1.insert");
		System.out.println(">>>"+guestDao.insert(new Guest(0,"고소미",null,"guard@gmail.com","http://www.naver.com","타이틀","컨텐츠")));
		
		System.out.println("2.delete");
		System.out.println(">>>"+guestDao.deleteByGuestNo(1));
		
		System.out.println("3.update");
		Guest findGuest =guestDao.findByGuestNo(2);
		findGuest.setGuestName("게스트");
		findGuest.setGuestEmail("change@change.com");
		findGuest.setGuestHomepage("http://www.gmail.com");
		findGuest.setGuestTitle("변경타이틀");
		findGuest.setGuestContent("변경컨텐츠");
		System.out.println(">>> row count : " +guestDao.updateByGuestNo(findGuest));
		
		System.out.println("4.findByPrimaryKey");
		System.out.println(">>>"+guestDao.findByGuestNo(8));
		
		System.out.println("5.findAll");
		System.out.println(">>>"+guestDao.findByAll());
		
		
	}

}
