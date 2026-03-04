package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity5 {

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
		WebElement elementUser = driver.findElement(By.xpath("//*[@id='with-label']"));
		String actCheckUser = elementUser.getText();
		if (actCheckUser.equals("admin")) {
			System.out.println("User is logged in " + actCheckUser);
//			driver.quit();
		}
		Color HeaderColor = Color.fromString(driver.findElement(By.xpath("//div[@class='desktop-toolbar']")).getCssValue("color"));
        System.out.println("Color as RGB: " + HeaderColor.asRgb());
        System.out.println("Color as hexcode: " + HeaderColor.asHex());
		
			driver.quit();
		

	}

}
