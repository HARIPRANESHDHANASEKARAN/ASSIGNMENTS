package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForceStatic extends ProjectSpecificMethodStaticAss{
	@Test
		public void staticParametrizationAss() throws InterruptedException {
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
			driver.findElement(By.xpath("//span[text()='Active']")).click();
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			WebElement alert = driver.findElement(By.xpath("//h2[text()='We hit a snag.']"));
			String text = alert.getText();
			System.out.println(text);
		}
		
	}

