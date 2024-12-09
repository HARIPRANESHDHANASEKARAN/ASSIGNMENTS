package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("DivyaDharshiniS");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement we = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(we);
		industry.selectByVisibleText("Computer Software");
		WebElement we1 = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(we1);
		owner.selectByVisibleText("S-Corporation");
		WebElement we2 = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(we2);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement we3 = driver.findElement(By.id("marketingCampaignId"));
		Select campaign = new Select(we3);
		campaign.selectByIndex(6);
		WebElement we4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(we4);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
