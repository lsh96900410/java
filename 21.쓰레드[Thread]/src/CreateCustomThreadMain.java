/*
type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
*/
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		CreateCustomThread cct= new CreateCustomThread(); //쓰레드 객체생성
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread CreateCustomThread객체.start() 메쏘드 호출 전");
		cct.start();
		
		System.out.println("3.main thread CreateCustomThread객체.start() 메쏘드 호출 후");
		while(true) {
			System.out.println("4.main thread");
		}
		
		
	
	}

}
