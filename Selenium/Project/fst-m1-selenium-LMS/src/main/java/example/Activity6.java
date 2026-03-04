package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement myAcct = driver.findElement(By.xpath("//a[contains(text(), 'My Account')]"));
		myAcct.click();
		String actAcctTitle = driver.getTitle();
		System.out.println(actAcctTitle);
		String expAccTitle = "My Account – Alchemy LMS";
		if (actAcctTitle.equals(expAccTitle)){
			System.out.println("I am on correct Page " + actAcctTitle);
//			driver.quit();
		}
		
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();
		WebElement user = driver.findElement(By.id("user_login"));
		user.sendKeys("root");
		WebElement pass = driver.findElement(By.id("user_pass"));
		pass.sendKeys("pa$$w0rd");
		WebElement submit = driver.findElement(By.id("wp-submit"));
		submit.click();
		
		WebElement elementUser = driver.findElement(By.xpath("/html/body/div[2]/div/ul[2]/li[2]/a/span"));
		String actCheckUser = elementUser.getText();
		if (actCheckUser.equals("root")) {
			System.out.println("User is logged in " + actCheckUser);
			driver.quit();
		}

	}

}
