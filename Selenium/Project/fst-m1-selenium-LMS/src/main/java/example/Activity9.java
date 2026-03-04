package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
		allCourses.click();
	
		
		WebElement course = driver.findElement(By.xpath("//div/h3[contains(text(),'Social Media Marketing')]"));
		course.click();
			driver.quit();
		

	}

}
