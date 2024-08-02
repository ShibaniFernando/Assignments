package week2.day2;

public class CheckNumberPositive {
	public static boolean checkNumber(int i){
		 if(i==0 || i<0) {
			 return false;
		 }
		 
		 return true;
	}
	public static void main(String[] args) {
		
		boolean c= checkNumber(29);
		System.out.println(c);
	}

}
