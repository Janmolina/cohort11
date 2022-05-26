package day13_String;

public class StringSubstringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//			  0123456789
		String str1 ="Television";
		System.out.println(str1.substring(4));
		
		System.out.println(str1.substring(2, 5));
		
		//			   012345678	
		String str2 = "Immutable";
		
		System.out.println(str2.substring(2));
		
		System.out.println(str2.substring(4));
		
		System.out.println(str2.substring(4, 9));
		
		
		String email = "firstName.lastName@domainName.com";
		
		String gmail ="Irfan.techCircle@gmail.com";
		
		System.out.println(gmail.indexOf('g'));
		
		System.out.println(gmail.lastIndexOf('.'));
		String domainName = gmail.substring(17, 22);
		System.out.println(domainName);
		
		System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf('.')));
		
		
		
		
	}

}
