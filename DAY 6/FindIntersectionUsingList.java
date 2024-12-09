package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		int a[] = {3, 2, 11, 4, 6, 7};
		int b[] = {1, 2, 8, 4, 9, 7};
		int length1 = a.length;
		int length2 = b.length;
		if(length1==length2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		List<Integer> value = new ArrayList<>();
		for(int i=0;i<length1;i++) {
			value.add(a[i]);
		}
		System.out.println(value);
		List<Integer> value1 = new ArrayList<>();
		for(int j=0;j<length2;j++) {
			value1.add(b[j]);
		}
		System.out.println(value1);
		for(int m=0;m<length1;m++) {
			for(int n=0;n<length2;n++) {
				if(value.retainAll(value1)) {
					System.out.println(value);
				}
			}
		}
	}
}
