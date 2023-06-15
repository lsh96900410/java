package nogeneric;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap=new HashMap();
		System.out.println("#Map size : " + carMap.size());
		System.out.println(carMap);
		System.out.println("*************************** 1.put ****************************");
		Car c1=new Car("1111", 12);
		carMap.put(c1.getNo(), c1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 14));
		carMap.put("4444", new Car("4444", 15));
		carMap.put("5555", new Car("5555", 16));
		System.out.println("#Map size : " + carMap.size());
		System.out.println(carMap);
		
		/*
		 *    키값은 중복허용안함.
		 */
		
		carMap.put("3333", new Car("삼삼삼삼", 20)) ;
		System.out.println("#Map size : " + carMap.size());
		System.out.println(carMap);
		
		System.out.println("***************************  2.get(key)  ****************************");
		Object getObjectCar =carMap.get("3333");
		Car getCar=(Car)getObjectCar;
		getCar.print();
		
		System.out.println("***************************  3.remove(key)  ****************************");
		Object removeObjectCar = carMap.remove("3333");
		Car removeCar=(Car)removeObjectCar;
		removeCar.print();
		System.out.println("#Map size : " + carMap.size());
		System.out.println(carMap);
		
		/*
		System.out.println("************ 전체차량출력 *************");
		Set carEntrySet=carMap.entrySet();
		Object[] carObjectEntryArray = carEntrySet.toArray();
		
		for (int i = 0; i < carObjectEntryArray.length; i++) {
			Entry carEntry=(Entry) carObjectEntryArray[i];
			
		}
		
		System.out.println("-------------------------------");
		
		for (Object entryObject : carEntrySet) {
			Entry carEntry=(Entry)entryObject;
		}
		*/
		
		
		
		
		
	}

}
