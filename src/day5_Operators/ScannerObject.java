package day5_Operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
	
		
		// create instance of scanner object
		Scanner s= new Scanner(System.in);
		
		
		System.out.println("Please type number A");
		//int a = 10;
		
		int a= s.nextInt();
		System.out.println("Please type number B");
		
		//int b = 20;
		int b= s.nextInt();
		
		
		int result = a + b;
		System.out.println(result);
		
		
//		System.out.println("What's your name?");
//		String name = s.nextLine();
//		
//		System.out.println("Hello "+name);
//		
		
		
		s.close();
		
		

	}

}
