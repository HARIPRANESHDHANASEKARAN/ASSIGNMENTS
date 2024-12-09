package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	@DataProvider(name = "Data")
	public String[][] getValue(){
		String[][] Value = new String[2][4];
		Value[0][0]="TestLeaf";
		Value[0][1]="Divya";
		Value[0][2]="S";
		Value[0][3]="Assignment";
		
		Value[1][0]="TestLeaf";
		Value[1][1]="Hari";
		Value[1][2]="D";
		Value[1][3]="Assignment";
		return Value;
		
	}

	@Test(dataProvider = "Data")
	public void createLead(String cName, String fName, String lName, String jobTitle) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(jobTitle);
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
