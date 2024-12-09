package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		WebElement notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notification.click();
		if(notification.isSelected()) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not Selected");
		}
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		WebElement verification = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
		if(verification.isEnabled()) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[1]")).click();
		driver.close();
	}

}
