package day14_StringReview;

public class NumberToStringWraperClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
byte age = 60;
        
        String ageAsString = Byte.toString(age);
        
        System.out.println(ageAsString); //60 
        
        System.out.println(ageAsString.charAt(0)); // 6
        
        
        
        int distance = 1000;
        
        String c = Integer.toString(distance);
                
        System.out.println(c);
        
        double price = 9.99;
        
        String p = Double.toString(price);
        
        System.out.println(p.length());  // count  each item of 9.99 means 4
        
        System.out.println(p.charAt(1));  // chart will pirnt the symbol ( .)
        
		
		
		
	}

}
