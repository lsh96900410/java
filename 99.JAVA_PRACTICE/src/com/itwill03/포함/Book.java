package com.itwill03.포함;

public class Book {
	/*
	  - 캡슐화하세요
	  - 생성자를 정의하세요
	  <속성>>
	   책번호
	   책제목
	   책분류
	   책설명
	  */
	private int bookNo;
	private String bookTitle;
	private String bookType;
	private String bookExplan;
	
public Book() {
		
	}
	public Book(int bookNo,String bookTitle, String bookType, String bookExplan) {
		this.bookNo=bookNo;
		this.bookTitle=bookTitle;
		this.bookType=bookType;
		this.bookExplan=bookExplan;
	}

	//<<기능>>
	//  책정보출력
	/*
	public static void headerPrint() {
	System.out.print("번호\t"+"제목\t"+"분류\t"+"설명");
	}
	*/
	public void rentBook() {
		
	}
	public void printBookInfo() {
		System.out.print("책 정보 : "+bookNo+"\t"+bookTitle+"\t"+bookType+"\t"+bookExplan);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookExplan() {
		return bookExplan;
	}

	public void setBookExplan(String bookExplan) {
		this.bookExplan = bookExplan;
	}

}
