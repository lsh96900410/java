package dao.guest;
/*
	sql을 가지고있는 클래스
*/

public class GuestSql {
	public static final String GUEST_INSERT=
			"insert into guest values (guest_guest_no_seq.nextval,?,sysdate,?,?,?,?)";
	
	public static final String GUEST_UPDATE=
			"update guest set guest_name=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
	
	public static final String GUEST_DELETE=
			"delete from guest where guest_no = ?";
	
	public static final String GUEST_SELECT_BY_NO=
			"select*from guest where guest_no=?";
	
	public static final String GUEST_SELECT_ALL=
			"select*from guest";
	
}
