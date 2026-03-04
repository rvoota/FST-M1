package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7 {

	public static String jobRole = "ai expert";
	public static String emailAdd = "jyothi@gmail.com";
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		WebElement jobs = driver.findElement(By.xpath("//a[(text() = 'Post a Job')]"));
		jobs.click();
		
		WebElement email = driver.findElement(By.id("create_account_email"));
		email.sendKeys(emailAdd);
		
		WebElement jobTitle = driver.findElement(By.id("job_title"));
		jobTitle.sendKeys(jobRole);
		
		WebElement jobType = driver.findElement(By.id("job_type"));
		Select select = new Select(jobType);
		select.selectByVisibleText("Full Time");
		
		WebElement desc = driver.findElement(By.id("job_description_ifr"));
		desc.click();
		desc.sendKeys(jobRole);
			
		WebElement app = driver.findElement(By.id("application"));
		app.sendKeys("xyz@gmail.com");
		
		WebElement compName = driver.findElement(By.id("company_name"));
		compName.sendKeys("IBM");
		
		WebElement preview = driver.findElement(By.xpath("//input[@name='submit_job']"));
		preview.click();
		
		WebElement submitListing = driver.findElement(By.id("job_preview_submit_button"));
		submitListing.click();
		
		WebElement jobs1 = driver.findElement(By.xpath("//a[(text()='Jobs')]"));
		jobs1.click();
		
		WebElement search = driver.findElement(By.id("search_keywords"));
		search.sendKeys(jobRole);
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit' and @value='Search Jobs']"));
		submit.click();
		
		WebElement jobId = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
		System.out.println(jobId.getText());
		if (jobId.getText().contains(jobRole)) {
			System.out.println("Job: " + jobRole +" was posted successfully in Job Listing page");
		}
		driver.quit();

	}

}
