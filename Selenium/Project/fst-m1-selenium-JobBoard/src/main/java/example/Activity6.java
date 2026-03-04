package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement jobs = driver.findElement(By.xpath("//a[(text() = 'Jobs')]"));
		jobs.click();
		
		WebElement search = driver.findElement(By.id("search_keywords"));
		search.sendKeys("Banking");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		WebElement jobId = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
		System.out.println(jobId.getText());
		jobId.click();
		
		
		WebElement apply = driver.findElement(By.xpath("//input[@type='button' and @value='Apply for job']"));
		apply.click();
		
		WebElement email = driver.findElement(By.xpath("//a[@class='job_application_email']"));
		System.out.println("Email to apply for the Job: " + email.getText());
		
		driver.quit();

	}

}
