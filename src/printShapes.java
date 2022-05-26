
public class printShapes {

	public static void main(String[] args) {
		

		// .isEmpty() :boolean => string is empty or not
	      String school = "techcircle school";
	      String emptyString = "";
	      school.isEmpty();

	      // .isBlank() :boolean => string is empty or have white space or not
	      String blankStr = "      ";
	      System.out.println(blankStr.isEmpty());
	      System.out.println(blankStr.isBlank());

	      System.out.println(emptyString.isEmpty());
	      System.out.println(emptyString.isBlank());

	      // .toUpperCase() / .toLowerCase() :string
	      System.out.println(school.toUpperCase());

	      // .startsWith() / .endsWith() (string):boolean
	      System.out.println(school.startsWith("school"));
	      System.out.println(school.startsWith("t"));

	      // .contains() (string):boolean
	      // check if string includes the given String or not
	      System.out.println(school.contains("xo")); // false
	      System.out.println(school.contains("circle")); // true     
	      
	   // .substring() :string - create new string with index given
	      //            01234567890123456
	      String str = "techcircle school";
	      // one parameter (int)
	      System.out.println(str.substring(11));
	      // two parameters (int, int)
	      // first is inclusive, second is exclusive
	      System.out.println(str.substring(11,14)); // sch
	      System.out.println(str.substring(5,16)); // ircle schoo

	      // .replace() (string,string) :string
	      // find the character/string (1st param), then replace them with give character/string(2nd
	      // param)
	      System.out.println(str.replace('o','0'));
	      System.out.println(str.replace("school","high school"));
	      System.out.println(str.replace("c",""));

	      // .trim() :string
	      // remove whitespace from front and back of the string
	      String otherStr = "   Hey, Irfan  ";
	      System.out.println(otherStr.trim());

	      // no matter what you do with the string.
	      // it will be immutable
//	      school = school.replace("c",""); <== this will modify the string then assign value back
//	      to the same string
	      System.out.println(school);
		
		
		
	}
}
	

	


