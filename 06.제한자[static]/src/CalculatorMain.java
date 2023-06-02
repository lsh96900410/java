

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("-------- access non static way -------");
		Calculator calculator=new Calculator();
		
		int result=calculator.add(23,34);
		System.out.println(result);
		
		result=calculator.sub(23,34);
		System.out.println(result);
		
		result=calculator.mul(23,34);
		System.out.println(result);
		
		double result1=calculator.div(45435,34);
		System.out.printf("%.1f\n" ,result1);

		System.out.println("-------- access static way -------");
		result = Calculator.add(23, 34);
		System.out.println(result);
		result = Calculator.sub(23, 34);
		System.out.println(result);
		result = Calculator.mul(23, 34);
		System.out.println(result);
		result = Calculator.div(12, 23);
		System.out.println(result);
	
	
		System.out.println(Math.abs(-790));
		System.out.println(Math.sqrt(2));
	
	}

}
