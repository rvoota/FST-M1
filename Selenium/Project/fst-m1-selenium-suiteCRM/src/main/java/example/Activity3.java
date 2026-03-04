package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		WebElement element = driver.findElement(By.id("admin_options"));
		String actHeading = element.getText();
		System.out.println(actHeading);
		
			driver.quit();
	

	}

}
