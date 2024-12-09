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

public class ActionOnAmazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement price = driver.findElement(By.xpath("//span[text()='28,799']"));
		String text = price.getText();
		System.out.println("Rate of mobile : " + text);
		driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-popover\"]")).click();
		WebElement ratings = driver.findElement(By.xpath("//span[text()='27 global ratings']"));
		String text1 = ratings.getText();
		System.out.println("Ratings of people : " + text1);
		WebElement name = driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']"));
		Actions opt = new Actions(driver);
		opt.moveToElement(name).click().perform();
		Set<String> ParentWindow = driver.getWindowHandles();
		List<String> ChildWindow = new ArrayList<String>(ParentWindow);
		driver.switchTo().window(ChildWindow.get(1));
		System.out.println("Child Window : " + driver.getTitle());
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/img.png");
		FileUtils.copyFile(scr, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		WebElement SubTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String text2 = SubTotal.getText();
		System.out.println("SubTotal : " + text2);
		if((price).equals(text2)) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}
}