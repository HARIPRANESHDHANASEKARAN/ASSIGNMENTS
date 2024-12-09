package week5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		Thread.sleep(1000);
		WebElement le = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions opt = new Actions(driver);
		opt.moveToElement(le).click().perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]")).click();
		Thread.sleep(2000);
		WebElement ne = driver.findElement(By.xpath("//a[@role='menuitem']"));
		Actions opt1 = new Actions(driver);
		opt1.moveToElement(ne).click().perform();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForce");
		WebElement js = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
		driver.executeScript("arguments[0].click()", js);
//		WebElement none = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]"));
//		Actions opt2 = new Actions(driver);
//		opt2.scrollToElement(none).perform();
//		Thread.sleep(3000);
		//none.click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement alert = driver.findElement(By.xpath("//h2[text()='We hit a snag.']"));
		String text = alert.getText();
		System.out.println(text);
	}

}
