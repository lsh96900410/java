
public class SynchronizeUpperThread extends Thread {
	private SynchronizeLowerUpperPrintSharedObject sharedObject;
	public SynchronizeUpperThread(SynchronizeLowerUpperPrintSharedObject sharedObject) {
		this.sharedObject=sharedObject;
	}
	@Override
	public void run() {
		while(true) {
			sharedObject.printUpper();
		}
	  
		
		
	}
}
