package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethodStaticAss {

	public RemoteWebDriver driver;
	@Parameters({"url","uname","pwrd","browser"})
	@BeforeMethod
	public void preCondition(String url, String uname, String pwrd, String browser) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		EdgeOptions ep = new EdgeOptions();
		op.addArguments("--disable-notifications");
			if(browser.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver(op);
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver(ep);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pwrd);
			driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
