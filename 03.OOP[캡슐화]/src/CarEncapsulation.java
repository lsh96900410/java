
public class CarEncapsulation {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.setIpchaData("1234", 12);

		Car car2=new Car();
		car2.setIpchaData("8890", 13);
		
		car1.setOutTime(16);
		car1.calculateFee();
		car1.print();
		System.out.println();
		car2.setOutTime(16);
		car2.calculateFee();
		car2.print();
	
		/*
		 * car1객체의 주차요금
		 */
		//int car1Fee=car1.fee;
		int car1Fee =car1.getFee();
		System.out.println("car1의 주차요금:" + car1Fee);
		/*
		 * 	car1객체의 주차요금 대입
		 */
	
		//car1.fee=0;
		car1.setFee(0);
		car1.print();
	
	
	}
}
