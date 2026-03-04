package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement jobs = driver.findElement(By.xpath("//a[(text() = 'Jobs')]"));
		jobs.click();
		String actAcctTitle = driver.getTitle();
		System.out.println(actAcctTitle);
		String expAccTitle = "Jobs – Alchemy Jobs";
		if (actAcctTitle.equals(expAccTitle)){
			System.out.println("I am on correct Page: " + actAcctTitle);
			driver.quit();
		}

	}

}
