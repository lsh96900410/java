
public class MainThreadMain {

	public static void main(String[] args) {
		System.out.println("main thread start");
		/*
		    현재코드를 실행시키는 메인쓰레드의 쓰레드 객체참조얻기
		 */
		Thread mainThread = Thread.currentThread();
		System.out.println("main thread name : " + mainThread.getName());
		MainThreadCalled mainThreadCalled = new MainThreadCalled();
		mainThreadCalled.main_thread_called_method1();
		mainThreadCalled.main_thread_called_method2();
		System.out.println("main thread end return");
		return;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
