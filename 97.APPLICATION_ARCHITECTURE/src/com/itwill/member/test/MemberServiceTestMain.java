package com.itwill.member.test;

import java.util.List;

import javax.swing.JOptionPane;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception{
		MemberService memberService=new MemberService();
		
		System.out.println("1.회원가입");
		
		boolean isSuccess1 =memberService.addMember(new Member("xxxx", "xxxx", "엑스맨", "경기도민", 30, "F", null));
		System.out.println("가입성공여부 : " + isSuccess1);
		boolean isSuccess2 =memberService.addMember(new Member("aaaa", "aaaa", "에어맨", "경기시민", 35, "F", null));
		System.out.println("가입성공여부 : " + isSuccess2);
		
		System.out.println("2.login");
		Member loginMember1 = memberService.login("aaaa", "aaaa");
		if(loginMember1!=null) {
			System.out.println("로그인성공 : " +loginMember1);
		}else {
			JOptionPane.showMessageDialog(null, "아이디,패쓰워드를 확인하세요");
		}
		
		Member loginMember2 = memberService.login("aaa", "aaax");
		if(loginMember2!=null) {
			System.out.println("로그인성공 : " +loginMember2);
		}else {
			JOptionPane.showMessageDialog(null, "아이디,패쓰워드를 확인하세요");
			System.out.println("로그인실패 : " +loginMember2);
		}
		
		System.out.println("3.detail : "+memberService.memberDetail("cccc"));
		Member updateMember = memberService.memberDetail("xxxx");
		updateMember.setMemberAddress("로스엔젤리스");
		
		
		System.out.println("4.update : "+memberService.memberUpdate(updateMember));
		
		System.out.println("5.회원탈퇴");
		int rowCount= memberService.memberDelete("xxxx");
		System.out.println(rowCount+"행 삭제");
		
		System.out.println("6.회원전체보기");
		List<Member> returnMemberList = memberService.memberList();
		System.out.println(returnMemberList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
