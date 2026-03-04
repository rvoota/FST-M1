package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement element = driver.findElement(By.xpath("//*[@id='post-16']/div/h2"));
		String actHeading = element.getText();
		System.out.println(actHeading);
		String expHeading = "Quia quis non";
		if (actHeading.equals(expHeading)){
			driver.quit();
		}

	}

}
