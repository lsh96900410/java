
public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		Employee[] emps= {
				new SalaryEmployee(1, "KIM", 4500000),
				new SalaryEmployee(2, "GIM", 8000000),
				new SalaryEmployee(3, "VIM", 2000000),
				new HourlyEmployee(4,"HOM",100,30000),
				new HourlyEmployee(5,"GON",100,10000)
				
		};
		
		for (Employee emp : emps) {
			emp.CalculatePay();
			System.out.println("---------------" + emp.getName()+"님 급여명세서-------");
			emp.print();
			double incentive=emp.calculateIncentive();
			System.out.println("\t인센티브: " + incentive);
			System.out.println("----------------------------");
		}
		
		
		System.out.println("사원인센티브율 : " + Employee.INCENTIVE_RATE);
		
	}

}
