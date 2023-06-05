package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int No;
	private String Name;
	private String col;
	private String[] rent ;
	
	
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	public void MemberInfoPrint() {
		System.out.print(No+"\t"+Name+"\t"+col+"\t"+rent);
	}



	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public String[] getRent() {
		return rent;
	}
	public void setRent(String[] rent) {
		this.rent = rent;
	}
	
}
