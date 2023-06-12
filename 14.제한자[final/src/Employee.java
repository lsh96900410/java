public abstract class Employee {
    
	private int no;			//번호
    private String Name;	//이름
    private int pay;		//급여
    
    public static final double INCENTIVE_RATE=0.1;
    
    public Employee() {
	}
    public Employee(int no, String name) {
		super();
		this.no = no;
		Name = name;
	}

    /*
     *  급여계산
     *    - 실제구현작업 불가능(추상메쏘드) => 재정의(오버라이딩, 구현 )필요
     *    - 자식클래스에서 반드시 재정의해야하는 메쏘드
     *    - 재정의강제(규칙,specification)
     */
	public abstract void CalculatePay();
	/*
	 *  인센티브계산( 급여가 200만원이 넘으면 10% 인센티브)
	 *     - 모든사원들의 인센티브계산방법이 동일함
	 *     - 재정의금지(회장님의 방침)
	 *     
	 */
	public final double calculateIncentive() {
		double incentive=0.0;
		if(this.pay>2000000) {
			incentive = this.pay*INCENTIVE_RATE;
		}
		return incentive;
	}
	
	
	
	public void print() {
		System.out.print(this.no +"\t" + this.Name+"\t"+this.pay+"\t");
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}

	
}
