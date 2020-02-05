package review6;

public class ToCharArrayDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday.";
		char[] charArray = longStr.toCharArray();
		for (char c : charArray) {
			System.out.println(c);
		}

		System.out.println("===========================================");

		String anotherStr = "";

		/*
		 * anotherStr=anotherStr += 'A'; anotherStr=anotherStr += 'B';
		 * anotherStr=anotherStr += 'C';
		 * 
		 * System.out.println(anotherStr);
		 */
		for (char c : charArray) {
			if (c == 'a') {
				anotherStr += 'e';

			} else {
				anotherStr += c;

			}

		}
		System.out.println(anotherStr);
	}

}
