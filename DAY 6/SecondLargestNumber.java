package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a[]= {3, 2, 11, 4, 6, 7};
        List<Integer> list = new ArrayList<>();
        int Length = a.length;
        for(int i=0;i<Length;i++) {
        	list.add(a[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int SecondLargest = list.get(Length-2);
        System.out.println(SecondLargest);
	}

}
