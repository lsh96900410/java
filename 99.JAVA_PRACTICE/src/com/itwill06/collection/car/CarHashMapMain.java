package com.itwill06.collection.car;
import java.util.HashMap;
import java.util.Iterator;

public class CarHashMapMain {

	public static void main(String[] args) {
			Car c1 = new Car("2344",3 );
			Car c2 = new Car("4566",4 );
			Car c3 = new Car("4567",5 );
			Car c4 = new Car("2389",6 );
			Car c5 = new Car("3908",7 );
			Car c6=  new Car("7891",8 );
			Car c7 = new Car("5656",9 );
			Car c8 = new Car("7789",10 );
			Car c9 = new Car("4690",11 );
			/*
			 * 0.Car HashMap 객체생성 초기화
			 */
			HashMap carMap=new HashMap();		
			System.out.println("1.입차 9대");
			/*
			 * 1.차량객체생성
			 * 2.carMap저장
			 */
			carMap.put(c1.getNo(), c1);
			carMap.put(c2.getNo(), c2);
			carMap.put(c3.getNo(), c3);
			carMap.put(c4.getNo(), c4);
			carMap.put(c5.getNo(), c5);
			carMap.put(c6.getNo(), c6);
			carMap.put(c7.getNo(), c7);
			carMap.put(c8.getNo(), c8);
			carMap.put(c9.getNo(), c9);
			
			System.out.println(carMap);
			System.out.println("2.차량번호 7789번  차한대 정보출력");
			Object getObjectCar = carMap.get("7789");
			Car getCar=(Car)getObjectCar;
			getCar.print();
			
			System.out.println("3.입차시간 8시이후 차량여러대 찾아서 정보출력");
			Object getObjectCar1 =carMap.getOrDefault(getObjectCar, getCar.getInTime()>=8);
			System.out.println("4.2389번차량 12시 출차");
			/*
			 * 1. 2389번차량찾기
			 * 2. 출차
			 * 3. 영수증출력
			 * 4. 2389번차량 주차장에서 차량삭제
			 */
			System.out.println("5. 2389번차량 출차후전체 차량출력");
			
	}

}
