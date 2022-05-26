package day13_String;

public class StringConcatenationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// first way to do 
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";
		
		String result = word1+ word2+ word3;
		System.out.println(result); //rethinking 
		
		//second we can do by this other way and print the same
		String result2 =word1.concat(word2).concat(word3);
		System.out.println(result2);  //rethinking
		
		
		// third way to do 
		String result3  = "";
		result3 += word1;
		System.out.println(result3); 
		
		result3 += word2;
		System.out.println(result3); 
		
		result3 += word3;
		System.out.println(result3); 
		
		//concatenation- look in google
		
		
	}

}
