
public class MemberMethodThis {
 /*
  * 멤버필드[속성]
  */
	int memberField1=0;
	char memberField2=0;
	double memberField3=0.0;
	
	
	
		
	
	/*
	 * 매개변수를 받아서 memberField1의 값을 대입하는 메쏘드
	 */
	
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
		/*
		 * this(변수)               :
		 *  - self참조변수
		 *  - setMemberField1()메쏘드가 실행될때 호출주체객체의 주소값을가진 변수
		 *  - this는 대부분 생략이 가능하다.
		 *  - setMemberFiedl1()메쏘드를 멤버로가진객체 주소
		 */
	}

	void setMemberField2(char memberField2) {
				
		this.memberField2=memberField2 ;
	}
	void setMemberField3(double memberField3) {
		this.memberField3 = memberField3;
	}
	
	/*
	 * 1.객체의멤버필드에 데이타를대입
	 */
	
	void setMemberField(int memberField1,char memberField2,double memberField3) 
	{this.memberField1=memberField1;
	 this.memberField2=memberField2;
	 this.memberField3=memberField3;}
	
	/*
	 * 객체의멤버필드내용을 출력하는 메쏘드
	 */
	void print() {
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+memberField3+"\t");
	}
	
	
	
	
	
	
	
}

