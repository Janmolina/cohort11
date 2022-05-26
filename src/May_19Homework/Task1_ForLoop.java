package May_19Homework;

import java.util.Scanner;

public class Task1_ForLoop {

	public static void main(String[] args) {


		/*## Task1
`
Write a program that asks user to enter number for 5 times,
 and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative*/
		
		int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    

		
		    
		}

	}


