package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Convert the String to character array
		char[] arraytext = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			System.out.println(arraytext[i]);
			if (Character.isLetter(arraytext[i])) {
				letter++;
			} else if (Character.isDigit(arraytext[i])) {
				num++;
			} else if (Character.isSpaceChar(arraytext[i])) {
				space++;
			} else {
				specialChar++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

}
}
