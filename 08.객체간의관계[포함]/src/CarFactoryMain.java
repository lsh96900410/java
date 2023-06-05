
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*Engine porcheEngine =new Engine();
		porcheEngine.type="A";
		porcheEngine.cc=5000;*/
		
		
		/*Car porcheCar=new Car();
		porcheCar.setNo(1234);
		porcheCar.setModel("PORCHE");
		porcheCar.setEngine(porcheEngine);
		*/
		
		//System.out.println(porcheCar.no+"\t"+porcheCar.model+"\t"+porcheCar.engine.type+"\t"+porcheCar.engine.cc);
		
		Engine porscheEngine=new Engine();
		porscheEngine.setType("A");
		porscheEngine.setCc(5000);
		
		Car porcheCar=new Car();
		porcheCar.setNo(1234);
		porcheCar.setModel("PORCHE");
		porcheCar.setEngine(porscheEngine);
		
		porcheCar.print();
		
		System.out.println("------ 차량엔진검사 -------");
		Car gumsaCar = porcheCar;
		Engine returnEngine=gumsaCar.getEngine();
		returnEngine.print();
		
		System.out.println();
		System.out.println();
		Car volvoCar=new Car(5678, "XC90", new Engine("S", 4900));
		volvoCar.print();
		System.out.println("----- 차량엔진검사 -----");
		volvoCar.getEngine().print();
		
		
		
		
		
		
		
		
		
		
	}

}
