package week3.day2;

import java.util.Arrays;

public class PrintDuplicatesArray {

	public static void main(String[] args) {
		int[] a= {11,12,11,12,15,16,17,19,19};
		Arrays.sort(a);
		int size=a.length;
		int[] temp= new int[size];
		int j=0;
		
		for(int i=0;i<size-1;i++) {
			if(a[i]==a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		for (int i : temp) {
			System.out.println(i);
		}
	}

}
/*
 * Duplicates in an array, always create a resulting array and add elements
 * after comparing within the elements in the array
 */
