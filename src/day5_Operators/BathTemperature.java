package day5_Operators;

import java.util.Scanner;

public class BathTemperature {

	public static void main(String[] args) {


		
		
		// Create instance of Scanner object
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your bath temperature:");
	
		        
		 //       int bathTemperature =106; //  this was hard code after we do scaner
		        
		int bathTemperature = scan.nextInt();
		    
		        if (bathTemperature < 90) {
		            System.out.println("Brrrr!");
		        }
		        
		        if (bathTemperature > 90 && bathTemperature < 95) {
		            System.out.println("That's lukewarm!");
		        }
		        
		        if (bathTemperature >= 95 && bathTemperature <105) {
		            System.out.println("Perfect!");
		        }
		        
		        if (bathTemperature >=105 && bathTemperature <110) {
		            System.out.println("This isn't a hot tub!");
		        }
		        
		        if (bathTemperature >= 110) {
		            System.out.println("Are you trying to boil a lobster?");
		        }
		        
		
		scan.close();
		
		
	}

}
