package week3.day2;

import java.util.Arrays;

public class SortingStringArray {

	public static void main(String[] args) {
		String[] s= {"Amazon", "Oracle", "Cognizant", "Microsoft", "Google"};
		int count=s.length;
		String temp;
		for(int i=0; i<count-1;i++) {
			for(int j=i+1; j<count;j++) {
				if(s[i].compareTo(s[j])>0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (String string : s) {
			System.out.println(string);
		}

	}

}
