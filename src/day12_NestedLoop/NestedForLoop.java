package day12_NestedLoop;

public class NestedForLoop {

	public static void main(String[] args) {


		// I want to count 1 to 10 five items
		
//		for (int i = 1; i <=10; i++) {
//			System.out.println (i);
//	
		
	// NOTE this loop just print 1 time  1 trough 100
		
			for (int i = 1; i <=10; i++) {
				System.out.println (i); // print 1 to 10
	
		}
			
			
			// I want to count 1 to 10 five items	
	// This loop run 5 times loops inside loop
	
		for (int j = 1; j <6; j++) {
			//System.out.println (j);
			for (int i = 1; i <6; i++) {
				System.out.println (i);
			}
		}		
	}
	
	
	
}
