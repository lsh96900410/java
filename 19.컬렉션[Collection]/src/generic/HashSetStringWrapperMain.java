package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {

		System.out.println("---------- String --------------");
		HashSet<String> nameSet = new HashSet<String>();
		System.out.println(nameSet);
		System.out.println("# set size :" +nameSet.size());
		System.out.println("------- 1.add -------");
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println("# set size :" +nameSet.size());
		System.out.println(nameSet);
		
		boolean isaAdd=nameSet.add(new String("KIM"));
		System.out.println("추가여부 확인 :" + isaAdd);
		System.out.println("# set size :" +nameSet.size());
		System.out.println(nameSet);
		
		System.out.println("-------- Wrapper (Integer) -----------");
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		while(lottoSet.size()<6) {
			boolean isAdd=lottoSet.add(new Integer((int)(Math.random()*45+1)));
		System.out.println(isaAdd);
		}
		System.out.println(lottoSet);
	}

}
