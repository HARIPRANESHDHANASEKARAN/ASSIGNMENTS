package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		String name = "DivyaDharshini";
		String empty = "";
		char[] ch = name.toCharArray();
		Set<Character> newname = new LinkedHashSet<Character>();
		for(Character c:ch) {
			newname.add(c);
		}
		//System.out.println(newname);
		for(Character s:newname) {
			empty=empty+s;
		}
		System.out.print(empty);
	}

}
