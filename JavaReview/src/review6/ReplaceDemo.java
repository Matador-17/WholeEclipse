package review6;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday.";
		String anotherStr=longStr.replace('a','e');
		
		System.out.println(anotherStr);
		
		anotherStr=longStr.replace("today", "tomorrow");
		
		System.out.println(anotherStr);
	
	}

}
