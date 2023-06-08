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
	private Book rentBook ;
	//기본생성자
	public BookMember() {
	}
	
	// 책정보 없는 멤버정보 생성자
	public BookMember(int no, String name, String col) {
		super();
		No = no;
		Name = name;
		this.col = col;
	}
	
	//책정보 넣은 생성자
	public BookMember(int no, String name, String col, Book rentBook) {
		super();
		No = no;
		Name = name;
		this.col = col;
		this.rentBook = rentBook;
	}

	/*
	<<기능>>
	  회원정보출력 
	 */
	public void MemberInfoPrint() {
		System.out.println(No+"\t"+Name+"\t"+col);
		if(rentBook!=null) {
			rentBook.printBookInfo();
		}else {
			System.out.println(">> 빌린책 없다.");
		}
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
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	
	
}
