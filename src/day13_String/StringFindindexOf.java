package day13_String;

public class StringFindindexOf {

	public static void main(String[] args) {
	
//      012345678910     17
String name = "President George Washington";

System.out.println(name.charAt(8));
System.out.println(name.charAt(9));
System.out.println(name.charAt(10));
System.out.println(name.charAt(17));

System.out.println(name.indexOf('p'));
System.out.println(name.indexOf('P'));

System.out.println(name.indexOf('e'));
System.out.println(name.indexOf('e', 3));
System.out.println(name.indexOf('e', 9));

System.out.println(name.lastIndexOf('e'));


System.out.println(name.indexOf("George"));

System.out.println(name.indexOf("rge"));

System.out.println(name.indexOf("Bob"));


System.out.println(name.indexOf("George") > -1);


System.out.println(name.indexOf("Bob") > -1);


// we use in this statements  overloading method
//https://www.geeksforgeeks.org/different-ways-method-overloading-java/?ref=lbp
//check link to learn more oveloading
	

	}

}
