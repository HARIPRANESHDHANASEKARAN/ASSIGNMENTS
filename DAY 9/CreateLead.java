package week5.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@Test
	public void createLead() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dharshini");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assignment");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}

	}

}
