
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeLowerUpperPrintSharedObject sharedObject=
				new SynchronizeLowerUpperPrintSharedObject();
		
		
		 SynchronizeUpperThread upperThread=new SynchronizeUpperThread(sharedObject);
		SynchronizeLowerThread lowerThread=new SynchronizeLowerThread(sharedObject);
		upperThread.start();
		lowerThread.start();
		
		
		
		
		
		
		
		
		
		
	}

}
