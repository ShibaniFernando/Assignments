package week3.day2;

import java.util.Arrays;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 11, 12, 15, 11, 17, 15 };
		Arrays.sort(a);
		int size= a.length;
		int[] temp= new int[size];
		int n=0;
		for (int i=0;i<size-1 ; i++) {
			if(a[i]!= a[i+1]) {
				temp[n]=a[i];
				n++;
			}
		}
		temp[n++]=a[size-1];
		for (int i : temp) {
			System.out.println(i);
		}
		
	}

}
/* for traversing inside a array and removing duplicates in array we are creating an 
empty array and then after comparing within the elements in array we are taking and adding 
unique numbers inside temp array*/