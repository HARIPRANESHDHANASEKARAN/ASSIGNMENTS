package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,i,n=8;
		System.out.print(a + " " + b + " ");
		for(i=2;i<n;i++) {
			int next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}
	}
}
