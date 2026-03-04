package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-login.php");
	
	WebElement user = driver.findElement(By.id("user_login"));
	user.sendKeys("root");
	WebElement pass = driver.findElement(By.id("user_pass"));
	pass.sendKeys("pa$$w0rd");
	WebElement submit = driver.findElement(By.id("wp-submit"));
	submit.click();
	
	WebElement elementUser = driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a/span"));
	String actCheckUser = elementUser.getText();
	if (actCheckUser.equals("root")) {
		System.out.println("User is logged in " + actCheckUser);
		driver.quit();
	}

}
}
