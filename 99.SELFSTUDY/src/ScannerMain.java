import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
		
		System.out.print("이름을 입력하세요:");
		String nameStr=scanner.next();
		System.out.print("국어점수 : ");
		int kor=scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng=scanner.nextInt();
		System.out.print("수학점수 : ");
		int math=scanner.nextInt();
		
		int tot=kor+eng+math;
		double avg=tot/3;
	
		System.out.println(nameStr +"\t" +kor +"\t" +eng +"\t" + math +"\t"+tot+"\t"+avg  );
	
		System.out.print("계속할까요? ( Y / N )");
		
		String yn=scanner.next();
		if(yn.equalsIgnoreCase("N")) {
			System.out.println("프로그램 종료");
			break;
	  }
    }
  }
}
		


