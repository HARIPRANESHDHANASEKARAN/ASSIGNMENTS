package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] Elements = {1,4,3,2,8,6,7};
		int missing=0;
		Arrays.sort(Elements);
		int length = (Elements.length)+1;
		System.out.println(length);
		for(int i=0;i<length;i++) {
			if(Elements[i]!=i+1) {
				missing = i+1;
				break;
			}
		}
		System.out.println(missing);
	}

}
