package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companies = {"HCL","Wipro","AspireSystems","CTS"};
		List <String> companyList = new ArrayList<String>();
		for(int i=0;i<companies.length;i++) {
			companyList.add(companies[i]);
		}
		System.out.println(companyList);
		Collections.sort(companyList);
		System.out.println(companyList);
		for (int i=companyList.size()-1; i>=0; i--) {
			System.out.print(companyList.get(i));
			if(i>0) {
				System.out.print(", ");
			}
		}
	}
}
