package day07_2ndReview;

public class Task_G {

	public static void main(String[] args) {

/*## Task G - Weird Number

Given an integer `n` , perform the following conditional actions:

- If `n` is odd, print `Weird`
- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
- If `n` is even and in the inclusive range of `6` to `20` , print `Weird`
- If `n` is even and greater than `20`, print `Not Weird`

### Input Format

A single line containing a positive integer `n` .

### Constraints

- 1 <= `n` <= 100

### Output Format

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

Sample Input 0
> 3

Sample Output 0
> Weird

Sample Input 1
> 24

Sample Output 1
> Not Weird*/
		
		
	// 	Given an integer `n` 
		//- If `n` is odd, print `Weird`
	
		// constraints 1<= n <=100
		int n= 24;
	//	- If `n` is odd, print `Weird`	
		if (n%2 != 0) { // odd number
			System.out.println("weird");
		}else { //- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
			// 2 3 4 5

		if (n>=2 && n<=5)  // even number -->inclusive range of `2` to `5` 
			System.out.println("Not Weird");
		
			else if(n<=20)    // even number -->inclusive range of `6` to `20`
			System.out.println("Weird");			
		
			else  { // even number -->grater than 20
			System.out.println("Not Weird");
		
			/*
			// 2 3 4 5	
			if (n>=2 && n<=5)  ---> n<= 5 == n>=6  ==> is the same statement
				// 6 7 ...20
			else if(n>=6 && n <=20)
				// 21 22...100
			else if(n<=20)
			
		*/
		}		
}
}
}

