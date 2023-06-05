package com.itwill03.포함;

public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 */ 
	public Dvd() {

	}
	public Dvd(int no,String title,String type) {
		this.no=no;
		this.title=title;
		this.type=type;
	}
	private int no;
	private String title;
	private String type;
	
	 /* <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	public static void headerPrint() {
		System.out.print("번호\t"+"타이틀\t"+"장르");
	}
	public void dvdInfoPrint() {
		System.out.println(no +"\t"+title+"\t"+type);
	}




}


