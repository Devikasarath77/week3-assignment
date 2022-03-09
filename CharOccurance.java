package week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		int count = 0;

		// convert the string into char array
	char[] array= str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			
			if (array[i] == 'e') {
				count++;

			}
		}

		System.out.println("the count out of the loop" + count);
	}

}
