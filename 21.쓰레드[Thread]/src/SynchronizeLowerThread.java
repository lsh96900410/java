
public class SynchronizeLowerThread extends Thread {
	private SynchronizeLowerUpperPrintSharedObject sharedObject;
	
	public SynchronizeLowerThread(SynchronizeLowerUpperPrintSharedObject sharedObject) {
		this.sharedObject=sharedObject;
	
	}

	@Override
	public void run() {
		while(true) {
			
			sharedObject.printLower();
		}
	
	}
}
