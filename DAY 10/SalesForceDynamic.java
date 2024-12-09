package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamic extends ProjectSpecificMethodDynamicAss {
	@DataProvider(name="Value")
	public String[][] getData(){
		String[][] Data = new String[1][1];
		Data[0][0] = "SalesForce Automation by Divya";
		return Data;
		
	}
	@Test(dataProvider="Value")
	public void dynamicParametrizationAss(String Data) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Data);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement verify = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String Text = verify.getText();
		System.out.println(Text);
	}

}
