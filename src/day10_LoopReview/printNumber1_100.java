package day10_LoopReview;

public class printNumber1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a java program to print sum f even number between 1 to 100
		// 2 + 4 + 6 + 8 + ...100

		// one way
		int number=100;  
		System.out.print("List of even numbers from 1 to "+number+": ");  
		for (int i=1; i<=number; i++)   
		{  
			if (i%2==0)   
			{  
			System.out.print(i + " ");  
			
			System.out.println();
			System.out.println("______");	
	
}  
			
		//second way	
			
int sum=0;
for(int j = 0; j<101 ; j = j +=2) {
	System.out.println(j);
}
		
		}

}
}