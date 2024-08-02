package week3.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String a= "ama";
		String b= a.toLowerCase();
		char c;
		String temp="";
		
		for (int i = 0;i<b.length();i++) {
			c= b.charAt(i);
			temp= c+temp;
		}
		System.out.println(temp);
		if(b.equals(temp)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		

	}

}
