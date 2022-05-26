import java.util.Scanner;

public class Ask1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ask user to enter number between 1-100.
	      // if input not in the range, the program should ask again
	      Scanner sc = new Scanner(System.in);
	      int input;
	      while (true) {
	         System.out.print("enter number between 1-100: ");
	         input = sc.nextInt();
	         if (input > 0 && input <= 100) break;
	         System.out.println("Number is not in 1-100 range");
	      }
	      System.out.println(input);
		  
		
	}

}
