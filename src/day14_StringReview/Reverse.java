package day14_StringReview;

public class Reverse {

	
		/*Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.*/
		
		
	  

	public static void main(String[] args) {    
		    
		    String str= "Jesus", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Jesus"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	
		
	

}
