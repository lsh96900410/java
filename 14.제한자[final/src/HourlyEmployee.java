public class HourlyEmployee extends Employee {
	private int worksHour;      //일한시간
	private int payPerHour;		//시급
	
	public HourlyEmployee() {
	}
	
	public HourlyEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour = worksHour;
		this.payPerHour = payPerHour;
	}

	public void print() {
		super.print();
		System.out.print(this.worksHour+"\t"+this.payPerHour+"\n");
	}


	@Override
	public void CalculatePay() {
		int tempPay =this.worksHour*this.payPerHour;
		this.setPay(tempPay);
	}

	
	public int getWorksHour() {
		return worksHour;
	}

	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}
