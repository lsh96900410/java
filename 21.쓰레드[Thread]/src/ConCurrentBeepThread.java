import java.awt.Toolkit;

public class ConCurrentBeepThread extends Thread{
	@Override
	public void run() {
		try {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			System.out.println("beep");
			
			 Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			    e.printStackTrace();
			}
		return;
	}
}
