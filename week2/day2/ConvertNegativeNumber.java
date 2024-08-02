package week2.day2;

public class ConvertNegativeNumber {
	public static int convertNegative(int i) {
	if (i<0) {
		i*=-1;
	}
	return i;

	}

	public static void main(String[] args) {

		System.out.println(convertNegative(-89)); 
		
	}

}
