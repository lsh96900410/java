package prince.korea;

import president.korea.YS;

public class YSChild extends YS{
	
	public void access2() {
		YS ys=new YS();
		this.member1=1;
		this.member2=2;
		// this.member3=3; - default
		// this.member4=4; - private
		
		this.method1();
		this.method2();
	}
	
	
}
