package day08_control_flow;

public class CalculatorHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numA = 15;
		double numB= 5;
		
		String Operator = "*";
		double total= 0;
		
		
		if (Operator == "+") {
			total= numA + numB;
		}
		if (Operator == "-") {
			total= numA - numB;		
		}
		if (Operator == "*") {
			total= numA * numB;		
		}	
		if (Operator == "/") {
			total= numA / numB;		
		}
	
		System.out.println(total);
	
		
		//15 * 5 = 75

		
//		System.out.println(numA +" "+Operator);
//		System.out.println(numA +" "+Operator +" ");
//		System.out.println(numA +" "+Operator +" " + numB);
//		System.out.println(numA +" "+Operator +" " + numB+ " = ");
//		System.out.println(numA +" "+Operator +" " + numB+ " = ");
		System.out.println(numA +" "+Operator +" " + numB+ " = "+ total);

	}

}
