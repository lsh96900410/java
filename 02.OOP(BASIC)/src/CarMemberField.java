          
public class CarMemberField {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램시작
		 */
		/*
		 *  1.차량번호 1234 차량 12시입차
		 */
		
		Car car1; 
		//차 객체의 주소값을 저장할 Car클래스타입 참조변수선언
		car1 = new Car() ;
		//Car 클래스를 사용하여 차 객체를 생성한 후 차 객체의 주소값이 car1 참조변수에 대입
		
		car1.no ="1234" ; //차객체(car1)의 멤버변수 no에 "1234" 값 대입
		car1.inTime =12; //차객체(car1)의 멤버변수 inTime에 12 값 대입
		
		
		/*
		 * 2.  car1차량 16시출차
		 */
		/*
		 * 2-1. car1 출차시간대입
		 */
		car1.outTime = 16; //차 객체(car1)의 멤버필드outTime에 16대입
		/*
		 * 2-2 주차요금계산
		 */
		car1.fee = (car1.outTime - car1.inTime)*1000 ;
		//차 객체(car1)의 멤버변수(필드) fee에 
		//차 객체(car1)의 outTime,inTime 멤버변수를 사용해서 주차요금계산 후 대입
		
		/*
		 * 2-3.주차요금의 영수증출력
		 */
		System.out.printf("-------------------------------------\n");
		System.out.printf("%s%s%s%s\n","차량번호 ","입차시간 ","출차시간 ","주차요금");
		System.out.printf("-------------------------------------\n");
		System.out.printf("%6s %8d %8d %9d ",car1.no , car1.inTime , car1.outTime , car1.fee);
	}

}
