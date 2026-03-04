package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement popCourse = driver.findElement(By.xpath("//*[@id='post-71']/div[2]/h3"));
		String actHeading = popCourse.getText();
		System.out.println(actHeading);
		String expHeading = "Email Marketing Strategies";
		if (actHeading.equals(expHeading)){
			driver.quit();
		}

	}

}
