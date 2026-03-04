package example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

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
		
		Actions actions = new Actions(driver);
		WebElement salesMenu = driver.findElement(By.xpath("//a[text()='Sales']"));
		actions.moveToElement(salesMenu).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement leadsSubMenu = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Leads']"))
		);
		
		leadsSubMenu.click();
		
		WebElement additionalIcon = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[10]"));
																
		additionalIcon.click();
		
		WebElement popUp = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span"));
		String mobile = popUp.getText();
		System.out.println("User Mobile: " + mobile);
		
//			driver.quit();
		

	}

}
