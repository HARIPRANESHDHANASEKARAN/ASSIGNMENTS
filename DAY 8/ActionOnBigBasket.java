package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOnBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		Thread.sleep(500);
		WebElement element = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions opt = new Actions(driver);
		opt.moveToElement(element).perform();
		Thread.sleep(500);
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions opt1 = new Actions(driver);
		opt1.moveToElement(element1).perform();
		Thread.sleep(500);
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		Actions opt2 = new Actions(driver);
		opt2.moveToElement(element2).click().perform();
		Thread.sleep(500);
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Brands']"));
		Actions opt3 = new Actions(driver);
		opt3.moveToElement(element3).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Search here']")).sendKeys("bb royal");
		driver.findElement(By.id("i-BBRoyal")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		Set<String> ParentWindow = driver.getWindowHandles();
		List<String> ChildWindow = new ArrayList<String>(ParentWindow);
		driver.switchTo().window(ChildWindow.get(1));
		System.out.println("ChildWindow : " + driver.getTitle());
		WebElement element4 = driver.findElement(By.xpath("//span[text()='5 kg']"));
		Actions opt4 = new Actions(driver);
		opt4.moveToElement(element4).click().perform();
		WebElement element5 = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]"));
		String Price = element5.getText();
		System.out.println("Price : " + Price);
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		WebElement totalprice = driver.findElement(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 StickyPdDetail___StyledLabel-sc-1375rlr-5 gJxZPQ dYFNsp\"]"));
		String TotalPrice = totalprice.getText();
		System.out.println("TotalPrice : " + TotalPrice);
		Thread.sleep(1000);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/img2.png");
		FileUtils.copyFile(scr, dest);
		driver.close();
		driver.quit();
	}

}
