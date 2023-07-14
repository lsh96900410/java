package dao.member;

public class MemberSQL {

	public static final String MEMBER_DELETE_BY_M_ID=
			"delete from member where m_id=?";
	
	public static final String MEMBER_INSERT=
			"insert into member values(?,?,?,?,?,?,sysdate)";
	
	public static final String MEMBER_UPDATE_BY_M_ID=
			"update member set m_password=?,m_name=?,m_address=?,m_age=?,m_married=?,m_regdate=sysdate where m_id=?";
	
	public static final String MEMBER_SELECT_BY_M_ID=
			"select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id=?";
	
	public static final String MEMBER_SELECTALL=
			"select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
	
}
