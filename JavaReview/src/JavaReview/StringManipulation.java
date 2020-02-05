package JavaReview;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello";

		System.out.println(str.length());
		
		System.out.println("============================");

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println("============================");

		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("hello"));

		System.out.println("============================");

		System.out.println(str.contains("ll"));

		System.out.println("============================");

		System.out.println(str.startsWith("H"));// contains a boolean result
		System.out.println(str.startsWith("ll", 2));
		System.out.println("============================");

		String b="llo";
		System.out.println(str.endsWith(b));
				
		System.out.println("============================");
		
		String str2="";
		System.out.println(str2.isEmpty());
		
		System.out.println(str.charAt(0));//returns a char
		
		System.out.println("============================");
		
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("l", 3));
		
		
		
		
		
		
		
		
		
		
		
	}
}
