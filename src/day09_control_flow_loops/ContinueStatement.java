package day09_control_flow_loops;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		
//		while(a<11) {
//			System.out.println(a);
//			a++;
//			
//		}
		
//		while (a <11) {
//			if(a == 5) {
//				
//			}else {
//				System.out.println(a);
//				
//			}
//			a++;
	//	}
//1,2,3,4,5,6,7,8,9,10
		
		while (a<11) {
			if (a==5) {
				continue;
			}System.out.println(a);
			a++;
		}
		// pending irfan explain more about continue statement
		
	}

}
