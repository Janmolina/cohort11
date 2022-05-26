
public class StringMethodDemo {

	public static void main(String[] args) {


/*## Task - First Half

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

## Task - Middle Two

Given a string of even length, return a string made of the middle two chars, so the string "string"
yields "ri". The string length will be at least 2. (edited)
[1:51 PM]

*
*/	
		
		String woo = "WooHoo";

		System.out.println(woo.substring(0, 3));

		String ri = "String";

		System.out.println(ri.substring(2, 4));
		
	}

}
