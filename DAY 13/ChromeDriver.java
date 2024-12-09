package week7.day1;

public class ChromeDriver {
	int age;
	String name;
	
	public ChromeDriver() {
		System.out.println("I am Default Constructor");
	}
	
	public ChromeDriver(int age,String name) {
		this();
		this.age=age;
		this.name=name;
		System.out.println("My age is : "+age+ "\n" +"My name is : "+name);
	}
	
	public ChromeDriver(int x) {
		this(22,"Divya");
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		ChromeDriver obj1 = new ChromeDriver(70);
	}
	
}
