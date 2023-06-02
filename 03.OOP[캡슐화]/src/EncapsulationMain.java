
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation=
				new Encapsulation();
		/*
		 * encapsulation 객체멤버필드에 데이타대입
		 * The field Encapsulation.memberField1 is not visible
		 */
		/*
		encapsulation.memberField1= 123;
		encapsulation.memberField2=true;
		encapsulation.memberField3='김';
		encapsulation.memberField4=1.3421;
		*/
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('A');
		encapsulation.setMemberField4(1.3421);
		/*
		 * encapsulation 객체멤버필드데이타출력
		 */
		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		int tempMemberField1=
				encapsulation.getMemberField1();
		System.out.println(tempMemberField1);
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
	
	/****************encapsulation객체멤버들출력********************/
	
		encapsulation.print();
	}

}
