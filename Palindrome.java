package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="madam";
		String strrevrse="";


		int length = str.length();
		for(int i=length-1;i>=0;i--)
		{
			strrevrse=strrevrse+str.charAt(i);

		}
			if(str.equalsIgnoreCase(strrevrse))
			
				System.out.println("palindrome");
			
			else
			
				System.out.println("not palindrome");
			
		}
	}


