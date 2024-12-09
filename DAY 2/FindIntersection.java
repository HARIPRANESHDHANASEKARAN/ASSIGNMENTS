package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		int n=a.length;
		int m=b.length;
		int i,j;
		for(i=0;i<n;i++) {
			for(j=i;j<m;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
