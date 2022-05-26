package day14_StringReview;

public class Tak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*## Task1
`write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
Example:
    Input: Welcome To TechCircle
    output: We*/

//		 String str1 = "welcome to techcircle";
//	        
//	        System.out.println(str1.substring(0,2));
//	
		
String input = "Welcome To TechCircle!";
        
        char firstChar = input.charAt(0);
//        char lastChar = input.charAt(21)
        
        System.out.println(input.length());
        
        char lastChar = input.charAt(input.length()-1);
        
        System.out.print(firstChar);
        System.out.print(lastChar);
        System.out.println();
        
        String result = ""+firstChar;
        System.out.println(result);
        result += lastChar;
        System.out.println(result);
        
		
	//	System.out.println(input.charAt(21-1));
		
		
		
		
	}

}
