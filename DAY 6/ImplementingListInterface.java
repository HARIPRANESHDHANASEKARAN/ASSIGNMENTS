package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		search.sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(1500);
		WebElement TotalProducts = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(TotalProducts.getText());
		List<WebElement> Brand = driver.findElements(By.xpath("//div[@class='brand']"));
		int size = Brand.size();
		System.out.println("Size of Brands : " + size);
		Thread.sleep(1600);
		for(int i=0;i<Brand.size();i++) {
			System.out.println(Brand.get(i).getText());
		}
		List<WebElement> BagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size2 = BagNames.size();
		System.out.println("Size of BagNames : " + size2);
		Thread.sleep(1700);
		for(int j=0;j<BagNames.size();j++) {
			System.out.println(BagNames.get(j).getText());
		}
	}

}
