/**
 * 주차장에서 차객체를 생성할 클래스
 * @author itwill
 * @version 0.1
 */

public class Car {
	/*
	 * 클래스의 구성요소
	 * 	1.멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할변수
	 *  2.멤버메쏘드[기능]    : 차객체가 외부에제공하는기능
	 */
	
	/*
	   멤버필드(변수)[속성] 
	 */
	private String no ; //차량번호
	private int inTime ; //입차시간
	private int outTime ; //출차시간
 	private int fee; //주차요금
 	
 	/*
 	 * 멤버메쏘드[기능]
 	 */
 	/*
 	 * 입차시 데이타대입
 	 */
 	/**
 	 * 입차시데이타대입메쏘드
 	 * @param no 차량번호
 	 * @param inTime 입차시간
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

	public void print() {
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s%s%s%s\n","차량번호 ","입차시간 ","출차시간 ","주차요금");
		System.out.printf("-------------------------------------\n");
		System.out.printf("%6s %8d %8d %9d\n ",this.no , this.inTime , this.outTime , this.fee);
	}
	//setter,getter
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
 	
 	//setter
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
	
}
