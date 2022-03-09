package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text1 = "stops";
		String text2 = "potss"; 
		int text1length = text1.length();
		int text2length = text2.length();
		
		if(text1length==text2length) {
			//1st string length
			char[] arraytext1=text1.toCharArray();
			for (int i = 0; i < text1length; i++) {
				System.out.println(arraytext1[i]);
			}
				//2nd string length

			char[] arraytext2=text2.toCharArray();
			for (int i = 0; i < text1length; i++) {
				System.out.println(arraytext2[i]);
			}
			
			//sort the text 
			Arrays.sort(arraytext1);
			System.out.println(arraytext1);
			Arrays.sort(arraytext2);
			
			System.out.println(arraytext2);
			
//print the data				
			if(Arrays.equals(arraytext1,arraytext2)) {
				System.out.println("Given two strings are Anagram");
			}
			else {
				System.out.println("two strings are NOT Anagram");
			}
			
		}
			 else { System.out.println("both strings are same"); }
		
		
			
	}

}
