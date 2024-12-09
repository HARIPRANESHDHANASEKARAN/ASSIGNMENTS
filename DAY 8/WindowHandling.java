package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> ParentWindow = driver.getWindowHandles();
		List<String> ChildWindow = new ArrayList<String>(ParentWindow);
		driver.switchTo().window(ChildWindow.get(1));
		driver.findElement(By.xpath("//div[contains(@class,'grid3-col-partyId')]/a")).click();
		driver.switchTo().window(ChildWindow.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> ParentWindow1 = driver.getWindowHandles();
		List<String> ChildWindow1 = new ArrayList<String>(ParentWindow1);
		driver.switchTo().window(ChildWindow1.get(1));
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]/a)[2]")).click();
		driver.switchTo().window(ChildWindow1.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(200);
		String title = driver.getTitle();
		System.out.println(title);
	}
}








