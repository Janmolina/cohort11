package day10_LoopReview;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*Write a program that ask the user to input a positive integer. 
It should then print the multiplication table of that number

input  = 10;
output: 

10 X 1 = 10

10 X 2 = 20
10 X 10= 100
*/
		
		
		
		// one way
	
		int num = 5;
		for (int i=1; i<=10; ++i)
		{
			System.out.printf("%d * %d = %d \n", num, i, num * i);
				
		}
	
		
		// second way 
		 int num1 = 8;
	        /*
	         * 1 X 5 = 5
	         * 2 X 5 = 10 
	         * 
	         * 
	         * 10  X 5 = 50;
	         * */
	        
	        
	        for (int i = 1; i < 11; i++) {
	            int total = i * num1;
//	            System.out.println(total );    
	            System.out.println(i + " X " + num1 + " = "+total);
	            
	        }
	        
	}

}
