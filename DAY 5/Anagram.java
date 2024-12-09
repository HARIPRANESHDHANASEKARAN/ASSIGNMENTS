package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String value = "stops";
		String value1 = "posts";
		int length = value.length();
		int length1 = value.length();
		if(length==length1) {
			char[] charArray = value.toCharArray();
			char[] charArray1 = value1.toCharArray();
			Arrays.sort(charArray);
			//System.out.println(charArray);
			Arrays.sort(charArray1);
			//System.out.println(charArray1);
			if(Arrays.equals(charArray,charArray1)) {
				System.out.println("Given Strings are Anagram");
			}
			else {
				System.out.println("Given Strings are not Anagram");
			}	
		}
		else {
			System.out.println("Length mismatches - It cant be a Anagram");
		}
	}
}