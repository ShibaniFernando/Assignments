package week3.day2;

import java.util.Arrays;

public class PrintUniqueCharacter {
	public static void uniqueCharacterCheck(String s) {
		char c[]= s.toCharArray();
		
		int size=c.length;
		Arrays.sort(c);
		char[] temp=new char[size];
		int n=0;
		for (int i=0;i<size-1;i++) {
			if (c[i]!=c[i+1]) {
				temp[n]=c[i];
				n++;
			}
		}
		temp[n++]=c[size-1];
		
		for (char d : temp) {
			System.out.println(d);
		}
		
		

	}

	public static void main(String[] args) {
		uniqueCharacterCheck("shibanai");

	}

}
