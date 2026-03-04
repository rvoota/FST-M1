package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement element = driver.findElement(By.xpath("//h1"));
		String actHeading = element.getText();
		System.out.println(actHeading);
		String expHeading = "Learn from Industry Experts";
		if (actHeading.equals(expHeading)){
			driver.quit();
		}

	}

}
