package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		
		WebElement user = driver.findElement(By.id("user_name"));
		user.sendKeys("admin");
		WebElement pass = driver.findElement(By.id("username_password"));
		pass.sendKeys("pa$$w0rd");
		WebElement submit = driver.findElement(By.id("bigbutton"));
		submit.click();
//		Thread.sleep(10);
		List<WebElement> ActivitiesMenu = driver.findElements(By.xpath("//a[contains(text(),'Activities')]"));
	
		if (ActivitiesMenu.size() > 0) {
			System.out.println("Activities menu exists in desktop toolbar");
		} else {
		    System.out.println("Activities menu does NOT exist in desktop toolbar");
		}
		
			driver.quit();
		

	}

}
