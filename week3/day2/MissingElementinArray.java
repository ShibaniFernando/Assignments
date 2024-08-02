package week3.day2;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		int[] a = { 1, 9, 2, 8, 3, 7, 4, 6 };
		Arrays.sort(a);
	
		int total = 0, sum = 0;

		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		for (int j = 0; j < 10; j++) {
			sum = sum + j;
		}
		int diff = sum - total;
		if (diff == 0) {
			System.out.println("No numbers missing");
		} else {
			System.out.println("Mising Number:" + diff);
		}

	}

}
