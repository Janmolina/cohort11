package day5_Operators;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner irfan = new Scanner(System.in); 
		
		System.out.println("Please type value a");
		//int a = 1;
		int a= irfan.nextInt();
		
		
		System.out.println("Please type value b");
	//	int b = 2;
		
		int b= irfan.nextInt();
		
		
		System.out.println("Please type value c");
		
		//int c = 3;
		
		int c = irfan.nextInt();
		
		System.out.println(a+b>c);
		
		irfan.close();
		

	}

}
