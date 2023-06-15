package com.itwill06.collection.car;
public class Car {
// alt + shif
	private String no ; //차량번호
	private int inTime ; //입차시간
	private int outTime ; //출차시간
 	private int fee; //주차요금
 	
 	/*
 	 *  생성자메쏘드
 	 */
 	//멤버필드의 기본값을 가진 차객체생성
 	 public Car() {
		
	}
 	/*
 	 * 차량번호,입차시간을 인자로받아서
 	 * 멤버필드의 값을 초기화시키는생성자
 	 */
 	
 	
 	public Car(String no,int inTime) {
 		this.no=no;
 		this.inTime=inTime;
 	}
 	
 	
 	
 	
 	/*
 	 * 입차시 데이타대입메쏘드
 	 */
 	
 	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}

 	/*
 	 * 차량멤버데이타를 인자로받아서
 	 * 멤버필드의값을가진 차객체 생성
 	 */
 
	public void setIpchaData(String no, int inTime) {
 		 this.no = no ;
 		 this.inTime = inTime ;
 	 }
 	
 	/*
 	 *  출차시간대입메쏘드
 	 */ 
 	public void setOutTime(int outTime) {
 		this.outTime=outTime;
 	}
 	
 	/*
 	 * 주차요금계산
 	 */
 	public void calculateFee() {
 		this.fee = (this.outTime -this.inTime)*1000;
 	}

	public void headerPrint() {
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s%s%s%s\n","차량번호 ","입차시간 ","출차시간 ","주차요금");
		System.out.printf("-------------------------------------\n");
	}
 	
 	
 	public void print() {
		
		System.out.printf("%6s %8d %8d %9d\n ",this.no , this.inTime , this.outTime , this.fee);
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public int getInTime() {
		return inTime;
	}


	public void setInTime(int inTime) {
		this.inTime = inTime;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public int getOutTime() {
		return outTime;
	}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
	
}
