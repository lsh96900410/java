/*
 * 객체간의관계
 * Car has a no(int)
 * Car has a model(String)
 * Car has a engine(Engine)
 */
public class Car {
	private int no;  //차량번호
	private String model; // 차량모델
	private Engine engine;	//차량엔진객체주소를 저장할 멤버필드
	public Car() {
		
	}
	public Car(int no,String model, Engine engine) {
		this.no=no;
		this.model=model;
		this.engine=engine;
	}
	
	public void print() {
		System.out.print(no+"\t"+model+"\t");
		//System.out.println(engine.getType()+"\t"+engine.getCc());
		this.engine.print();
	}
	
	
	
	
	
	//getter,setter
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


}	
