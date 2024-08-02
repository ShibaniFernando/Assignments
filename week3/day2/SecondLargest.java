package week3.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		Arrays.sort(a);
		int size=a.length;
		// 2,3,4,6,7,11
		System.out.println(a[size-2]);

	}

}
