import java.io.IOException;

public class _FirstSecondExceptionThrowMain {

	public static void main(String[] args) throws NullPointerException,IOException{
		System.out.println("1. Main실행흐름 start");
		_First first = new _First();
		System.out.println("2. main실행흐름 first.method1() 호출 ");
		first.method1();
		System.out.println("3. main실행흐름 first.method1() 호출후 반환");
		System.out.println("4. main실행흐름 JVM 반환");
		return;
		
		
		
		
	}

}
