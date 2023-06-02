
public class CarMemberMethod {

	public static void main(String[] args) {
		Car car1= new Car();
		/*
		 *  1.차량번호 1234 차량 12시입차
		 */
		// 입차시데이타(번호,시간)대입메쏘드호출
		car1.setIpchaData("1234", 12);    
		/*
		 * 2.  car1차량 16시출차
		 */
		/*
		 * 2-1. car1 출차시간대입메쏘드호출
		 */
		car1.setOutTime(16);
		/*
		 * 2-2 주차요금계산메쏘드호출
		 */
		car1.calculateFee();
		/*
		 * 2-3.주차요금의 영수증출력
		 */
		car1.print();   
		
		System.out.println("-------------------------");
		Car car2 = new Car();
		car2.setIpchaData("7788" , 17);
		//3시간후
		
		car2.setOutTime(19);
		car2.calculateFee();
		
		car2.print(); 
		
		
	}

}
