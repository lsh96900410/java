package dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.address.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	/*
	 * Dao 객체는멤버변수로 Connection을 생성하는 DataSource객체를 가짐
	 */
	private DataSource dataSource;
	
	public MemberDao() throws Exception{
		this.dataSource=new DataSource();
	}
	
	//delete
	public int deleteByMId(String mId) throws Exception {
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_DELETE_BY_M_ID);
		pstmt.setString(1,mId);
		int rowCount=pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	//insert
	public int insertByMID(Member member) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_INSERT);
		pstmt.setString(1, member.getmId());
		pstmt.setString(2, member.getmPassword());
		pstmt.setString(3, member.getmName());
		pstmt.setString(4, member.getmAddress());
		pstmt.setInt(5, member.getmAge());
		pstmt.setString(6, String.valueOf(member.getmMarried()));
		int rowCount=pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	
	//update
	public int updateByMID(Member member) throws Exception{
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_UPDATE_BY_M_ID);
		pstmt.setString(1, member.getmPassword());
		pstmt.setString(2, member.getmName());
		pstmt.setString(3, member.getmAddress());
		pstmt.setInt(4, member.getmAge());
		pstmt.setString(5,String.valueOf(member.getmMarried()));
		pstmt.setString(6, member.getmId());
		
		int rowCount =pstmt.executeUpdate();
		dataSource.close(con);
		return rowCount;
	}
	
	//selectByMID
	public Member selectByMID(String id) throws Exception{
		Member member=null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECT_BY_M_ID);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			member = new Member(rs.getString("m_id"),
					  rs.getString("m_password"),
					  rs.getString("m_name"), 
					  rs.getString("m_address"), 
					  rs.getInt("m_age"), 
					  rs.getString("m_married").charAt(0),
					  rs.getDate("m_regdate"));
		}
		return member;
	}
	
	
	
	
	
	//selectAll
	public List<Member> selectAll() throws Exception{
		List<Member> memberList =new ArrayList<Member>();
		
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.MEMBER_SELECTALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			memberList.add(new Member(rs.getString("m_id"),
									  rs.getString("m_password"),
									  rs.getString("m_name"), 
									  rs.getString("m_address"), 
									  rs.getInt("m_age"), 
									  rs.getString("m_married").charAt(0),
									  rs.getDate("m_regdate")));
		}
		rs.close();
		dataSource.close(con);
		return memberList;
	}
	
	
	
}
