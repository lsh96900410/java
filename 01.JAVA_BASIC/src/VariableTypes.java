
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형
		 *   1. 논리형변수타입(boolean)
		 * 		ex) boolean b1 ; 
		 * 			boolean b2 ;
		 * 		-논리형변수 : b1 , b2
		 * 		-논리형리터럴 : true , false (0,1)
		 */
		/*
		 * 형변환
		 * 자동변환 : 크기가 작은 자료형(더 정밀) 이 큰 자료형으로 속함
		 * 강제변환 : 크기가 큰 자료형이 작은 자료형으로 
		 *			: 자료를 동일하게 맞춰줘야함
 		 */
		
		System.out.println("-----------boolean---------");
		boolean bool1 ; 
		boolean bool2 ;
		boolean bool3 ;
		boolean bool4 ;
		bool1 = true ;
		bool2 = false;
		bool3 = true ;
		bool4 = bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
	
		/*	 
		 *   숫자형
		 *   
		 *   1. 정수형 변수타입(byte,short,int,long)
		 *   	- 정수형변수 = kor,~~
		 *   	- 정수형리터럴 : ex) 10,23,-90,234235
		 *   
		 */	
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b0111111;
		// int i = 3;
		/*
		 * << Type mismatch : cannot convert from in to byte >>
		 * byte b5 = i ; //변수는 데이터 X
		 */
		
		System.out.println("-----------byte----------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		System.out.println("--------short---------------");
		short s1 = 734 ;
		short s2 = -32768 ;
		short s3 = 32767 ;		
		short s4 = 0b0111111111111111 ;
		//short s5 = 32768 ;
		
		//i = 734 ;
		//short s6 = i ; //  s6 (short) < i (int) 범위 때문에 불가능 
		//long l = i; // i (int) 범위 < l (long) 범위 때문에 가능
		//System.out.println(l);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("------------int------------");		
		
		
		int i1,i2,i3,i4,i5,i6 ;
		i1 = 88;   
		i2 = 99;   
		i3 = 2147483647;   
		i4 = 0b011111111111111111111111111111111;
		i5 = i1;
		i6 = i2;
		
		System.out.println(i1); 
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		long l1 = 232 ;
		/*
		 *  The literal 2147483648 of type int is out of range
		 */
		long l2 = 31242147483648l ;
		System.out.println("------------long----------");
		System.out.println(l1);
		System.out.println(l2);
		
		
		
		/*	 
		 *   숫자형
		 *   
		 *   1. 실수형 변수타입(float[4byte] , double[8byte]) 
		 *  	float avg;
		 *  	float height;
		 *  	- 실수형 변수 : avg, height
		 *   	- 실수형리터럴 : ex) 1, 23, 78, 25, 100.0 (double)
		 */	
		System.out.println("------------float----------");
	float f1,f2,f3 ;
	f1 = 0.1F ;
	f2 = 3.14F ;
	f3 = 10000.0F;
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println("----------double-----------");
	double d1,d2,d3 ;
	d1 = 3.141592 ;
	d2 = 12345678912345678912345678.0;
	d3 = 1.2345678912345678912345678 ;
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	
	}

}
























