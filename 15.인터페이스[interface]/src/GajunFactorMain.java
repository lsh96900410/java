
public class GajunFactorMain {

	public static void main(String[] args) {
		System.out.println(" ----------- 가전제품공장 ----------");
		GajunTv tv1 = new GajunTv();
		GajunTv tv2 = new GajunTv();
		GajunTv tv3 = new GajunTv();
		
		GajunAudio audio1=new GajunAudio();
		GajunAudio audio2=new GajunAudio();
		
		GajunOnOff gajun1 =tv1;
		
		GajunOnOff[] gajunArray=new GajunOnOff[5];
		gajunArray[0]=tv1; 
		gajunArray[1]=tv2; 
		gajunArray[2]=tv3; 
		gajunArray[3]=audio1; 
		gajunArray[4]=audio2; 
		 
		System.out.println("---------- 가전제품검사소 ----------");
		/*
		 *  난 절대로 자식클래스타입을 사용안할래요
		 *  난 부모타입[GajunOnOff,GajunVolume]만 사용할래요
		 *  그래야 가전제품검사 프로그램을 한번만들어서 변경없이 
		 *  계속사용할수있으니까요
		 */
		GajunOnOff[] receiveGajunArray=gajunArray;
		
		for (int i = 0; i < receiveGajunArray.length; i++) {
			System.out.println("--------------- 검사시작 -----------------");
			 receiveGajunArray[i].on();
			GajunVolume tempGajun=(GajunVolume)receiveGajunArray[i];
			tempGajun.up();
			tempGajun.down();
			
			receiveGajunArray[i].off();
			System.out.println("--------------- 검사끝 출고-----------------");
		}
	}

}
