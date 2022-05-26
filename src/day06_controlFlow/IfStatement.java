package day06_controlFlow;

public class IfStatement {

	public static void main(String[] args) {
	
		//Decision making statements 
        // if statement And switch case
        
        //Syntax:
        
        /*
         * if (condition){
         *         statement1
         * }else{
         *         statement2
         * }
         * 
         * 
         * */
        
        
        int a = 15;
        int b = 7;
        //  5 > 7
        if (a > b) {
            System.out.println("a is grater");
        }else {
            System.out.println("b is grater");
        }
        
        
        int count = 12;
        int total = 4;
        
        if (count < 3) {
            total = 0;
        }else {
            total = total + count;
        }
        
        System.out.println(total);
        
	}
}
	


