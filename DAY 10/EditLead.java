package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod {

	@Test
	public void editLead(String cName, String fName, String lName) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyadharshinis471@gmail.com");
		WebElement we = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(we);
		state.selectByVisibleText("Indiana");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(" Selenium Automation Testing");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
