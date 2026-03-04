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

public class Activity9 {

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
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr"));
		int count = 0;
		for (int i = 1; i <= rows.size(); i += 1) {
		    
		    WebElement cell = driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[3]"));
		    String name = cell.getText();
		    System.out.println(name);
		    WebElement cell1 = driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr["+i+"]/td[8]"));
		    String user1 = cell1.getText();
		    System.out.println(user1);
		    count++;

		    if (count == 10) {
		        break;   // stop after first 5 odd names
		        
		    }
		}
		driver.quit();

	}
}
