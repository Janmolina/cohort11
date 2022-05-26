package day09_control_flow_loops;

public class SwitchStatetementWithoutBreak {

	public static void main(String[] args) {
// if statement
		
char grade = 'A';
        
        if (grade == 'A') {
            System.out.println("Pass");
        } else if (grade == 'B') {
            System.out.println("Pass");
        } else if (grade == 'C') {
            System.out.println("Pass");
        } else if (grade == 'D') {
            System.out.println("Pass");
        } else if (grade == 'W') {
            System.out.println("Withdraw");
        } else if (grade == 'I') {
            System.out.println("Incomplete");
        }else {
            System.out.println("Failed");
        }
        
  // /switch statement
        // break you can print until break
        switch(grade) {
        case 'A':
        
        case 'B':
        
        case 'C':
            
        case 'D':
            System.out.println("Pass");
            break;
        case 'W':
            System.out.println("Withdraw");
            break;
        case 'I':
            System.out.println("Incomplete");
            break;
        default:
            System.out.println("Failed");
        
        }


		
		
	}

}
