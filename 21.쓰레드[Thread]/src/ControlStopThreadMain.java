
public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		/*
		ControlStopThread1 cst1 =new ControlStopThread1();
		cst1.setName("download thread");
		cst1.start();
		
		Thread.sleep(1000);
		cst1.stop();
		*/
		
		ControlStopThread2 cst2=new ControlStopThread2();
		cst2.start();
		Thread.sleep(3000);
		/*
		cst2.stop();
		    stop 사용 지양하는 이유
		     	<<  console  >>
		     	----------
 				1.game move 
 				2.game fight   
 				3.game get score! 
 				4.game power up! 
 				5.game score update! 
		     	----------
		     	1.game move 
 				2.game fight 
				9. main thread jvm return end 
		 */
		
		cst2.setPlay(false); 
		
		
		System.out.println("9. main thread jvm return end ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
