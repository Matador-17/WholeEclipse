package review6;

public class SplitDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, "
				+ "because today is not Monday.";
		
		
		String[] anotherStr=longStr.split("today");
		for (String string : anotherStr) {
			System.out.println(string);
		}
		for (int i=0;i<anotherStr.length;i++) {
			System.out.println(anotherStr[i]);
		}

	}

}
