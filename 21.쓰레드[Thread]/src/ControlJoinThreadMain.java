
public class ControlJoinThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println(" 1.main thread start ");
		ConCurrentBeepThread bt= new ConCurrentBeepThread();
		ConCurrentPrintThread pt= new ConCurrentPrintThread();
	
		bt.start();
		/*
		 * bt.join()메쏘드를 호출한 메인쓰레드를 bt쓰레드가 종료할때까지 대기시킨다.
		 */
		bt.join();
		
		System.out.println(" 2.main thread  ");
		pt.start();
		pt.join();
		System.out.println(" 3.main thread ");
		System.out.println(" 9.main thread jvm return ");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
