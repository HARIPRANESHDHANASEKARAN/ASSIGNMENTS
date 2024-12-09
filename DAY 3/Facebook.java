package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		driver.findElement(By.name("lastname")).sendKeys("Dharshini");
		driver.findElement(By.name("reg_email__")).sendKeys("divyadharshinis471@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("divya@0215");
		WebElement we = driver.findElement(By.id("day"));
		Select day = new Select(we);
		day.selectByValue("15");
		WebElement we1 = driver.findElement(By.id("month"));
		Select month = new Select(we1);
		month.selectByIndex(4);
		WebElement we2 = driver.findElement(By.id("year"));
		Select year = new Select(we2);
		year.selectByVisibleText("2003");
		driver.findElement(By.name("sex")).click();
	}

}
