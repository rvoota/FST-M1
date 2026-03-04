package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net");
		System.out.println(driver.getTitle());
		
		WebElement button = driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"));
		button.click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
