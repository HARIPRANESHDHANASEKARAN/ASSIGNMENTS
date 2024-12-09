package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		WebElement Chrome = driver.findElement(By.xpath("//label[text()='Chrome']"));
		Chrome.click();
		if(Chrome.isEnabled()) {
			System.out.println("Not UnSelected");
		}
		else {
			System.out.println("UnSelected");
		}
		WebElement Default = driver.findElement(By.xpath("//label[text()='Safari']"));
		if(Default.isEnabled()) {
			System.out.println(Default.getText());
		}
		else {
			System.out.println("No Default ");
		}
		WebElement Age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(Age.isEnabled()) {
			System.out.println("Already Selected");
		}
		else {
			Age.click();
		}
		driver.close();
	}

}
