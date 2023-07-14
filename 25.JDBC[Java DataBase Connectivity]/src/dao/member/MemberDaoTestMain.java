package dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		
		System.out.println("0.delete   --> "+memberDao.deleteByMId("aaaa"));
		
		System.out.println("1.insert   --> "+memberDao.insertByMID(new Member("추가1", "추가","추가", "추가", 1, 'T', null)));
		
		Member findMember = memberDao.selectByMID("bbbb");
		findMember.setmPassword("업데이트");
		findMember.setmName("업데이트");
		findMember.setmAddress("업데이트");
		findMember.setmAge(8);
		findMember.setmMarried('T');
		
		System.out.println("2.update   --> "+memberDao.updateByMID(findMember));
		
		System.out.println("3.selectById-> "+memberDao.selectByMID("bbbb"));
		
		System.out.println("4.selectAll--> "+memberDao.selectAll());
	
	}

}
