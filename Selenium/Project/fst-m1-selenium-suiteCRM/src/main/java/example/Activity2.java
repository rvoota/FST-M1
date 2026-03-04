package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'companylogo')]//img"));
		String actHeading = element.getAttribute("src");
		System.out.println(actHeading);
		driver.quit();
		

	}

}
