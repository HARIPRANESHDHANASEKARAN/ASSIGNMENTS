package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		int a[]= {3, 2, 11, 4, 6, 7};
		int length=a.length;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<length;i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		int present,next;
		for(int j=0;j<list.size()-1;j++) {
			present = list.get(j);
			next = list.get(j+1);
			if(present+1 != next) {
				for(int missing=present+1;missing<next;missing++) {
					System.out.println(missing);
				}
			}
		}
	}
}
