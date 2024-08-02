package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String s= "google";
		char[] c = s.toCharArray();
		Set<Character> withoutDuplicates = new TreeSet<Character>();
		for (int i=0;i<c.length; i++) {
			withoutDuplicates.add(c[i]);
		}
		System.out.println(withoutDuplicates);
		

	}

}
