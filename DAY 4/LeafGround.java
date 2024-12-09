package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Dash")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		driver.get("https://leafground.com/button.xhtml");
		WebElement confirm = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		if(confirm.isEnabled()) {
			System.out.println("Button enabled");
		}
		else {
			System.out.println("Button disabled");
		}
		WebElement submit = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']"));
		System.out.println(submit.getLocation());
		WebElement save = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
		System.out.println(save.getCssValue("background-color"));
		WebElement height = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));
		System.out.println(height.getSize());
		driver.close();
	}


}
