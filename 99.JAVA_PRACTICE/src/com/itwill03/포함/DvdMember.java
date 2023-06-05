package com.itwill03.포함;

public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	
	private int no;
	private String name;
	private String cal;
	private Dvd rentDvd;//빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */
	public void memberInfoPrint() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.cal+"\t"+this.rentDvd);
	}
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCal() {
		return cal;
	}
	public void setCal(String cal) {
		this.cal = cal;
	}
	public Dvd getRentDvd() {
		return rentDvd;
	}
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	    
}
