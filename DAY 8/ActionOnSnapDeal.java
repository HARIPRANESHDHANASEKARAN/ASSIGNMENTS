package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOnSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		WebElement MensFashion = driver.findElement(By.className("catText"));
		Actions opt = new Actions(driver);
		opt.moveToElement(MensFashion).perform();
		WebElement SportsShoe = driver.findElement(By.className("linkTest"));
		Actions opt1 = new Actions(driver);
		opt1.moveToElement(SportsShoe).click().perform();
		WebElement CountOfShoe = driver.findElement(By.xpath("//div[@class='child-cat-count ']"));
		String ShoeCount = CountOfShoe.getText();
		System.out.println("ShoeCount : " + ShoeCount);
		WebElement TrainingShoe = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		Actions opt2 = new Actions(driver);
		opt2.moveToElement(TrainingShoe).click().perform();
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		WebElement LowToHigh = driver.findElement(By.xpath("//li[@class='search-li']"));
		Actions opt3 = new Actions(driver);
		opt3.moveToElement(LowToHigh).click().perform();
		WebElement FromVal = driver.findElement(By.name("fromVal"));
		FromVal.clear();
		FromVal.sendKeys("500");
		WebElement ToVal = driver.findElement(By.name("toVal"));
		ToVal.clear();
		ToVal.sendKeys("600");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		WebElement Colour = driver.findElement(By.xpath("//input[@id='Color_s-Black']/following-sibling::label[1]"));
		Actions opt4 = new Actions(driver);
		opt4.scrollToElement(Colour).perform();
		Thread.sleep(500);
		Colour.click();
		Thread.sleep(500);
		WebElement FirstImage = driver.findElement(By.xpath("//img[@title='ASIAN Black Training Shoes']"));
		Actions opt5 = new Actions(driver);
		opt5.moveToElement(FirstImage).perform();	
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		WebElement price = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]"));
		String text = price.getText();
		System.out.println(text);
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/SnapDeal.png");
		FileUtils.copyFile(scr,dest);
		driver.close();
		driver.quit();
	}
}
