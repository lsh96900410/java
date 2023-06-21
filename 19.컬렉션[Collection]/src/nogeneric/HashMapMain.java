package nogeneric;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap=new HashMap();
		System.out.println("#Map size : " + carMap.size());
		System.out.println(carMap);
		System.out.println("*************************** 1.put ****************************");
		Car c1=new Car("1111", 12);
		carMap.put("1111", c1);
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
		
		Set carEntrySet=carMap.entrySet();
		
		Object[] carObjectEntryArray = carEntrySet.toArray();
		for (int i=0;i<carObjectEntryArray.length;i++) {
			Entry carEntry=(Entry)carObjectEntryArray[i];
			String key=(String)carEntry.getKey();
			Car car=(Car)carEntry.getValue();
			car.print();
		}
		System.out.println("---------------------");
		for(Object entryObject :carEntrySet) {
			Entry carEntry=(Entry)entryObject;
			String key=(String)carEntry.getKey();
			Car car=(Car)carEntry.getValue();
			car.print();
		}
		
		/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		System.out.println("%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%");
		Set carEntrySet2=carMap.entrySet();
		Iterator carEntryIterator=carEntrySet2.iterator();
		while(carEntryIterator.hasNext()) {
			Entry carEntry=(Entry)carEntryIterator.next();
			String key = (String)carEntry.getKey();
			Car car=(Car)carEntry.getValue();
			System.out.println("key="+key);
			car.print();
		}
		System.out.println("--------- key set ----------");
		Set keySet=carMap.keySet();
		Iterator keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=(String)keyIterator.next();
			System.out.println("key="+key);
			Car car=(Car)carMap.get(key);
			car.print();
		
		
		
		
		}
	}

}
