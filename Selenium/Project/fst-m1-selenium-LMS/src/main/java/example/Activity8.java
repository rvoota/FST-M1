package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
		contact.click();
	
		
		WebElement fName = driver.findElement(By.xpath("//label[contains(text(),'Full Name')]/parent::*//input"));
		fName.sendKeys("prasad vasala");
		WebElement email = driver.findElement(By.xpath("//label[contains(text(),'Email')]/parent::*//input"));
		email.sendKeys("abc@gmail.com");
		WebElement message = driver.findElement(By.xpath("//label[contains(text(),'Comment or Message')]/parent::*//textarea"));
		message.sendKeys("hello we are from ibm");
		WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Send Message')]"));
		submit.click();
		
		WebElement afterSend = driver.findElement(By.id("wpforms-confirmation-8"));
		String afterSendMessage = afterSend.getText();
			System.out.println("User sent the message: " + afterSendMessage);
			driver.quit();
		

	}

}
