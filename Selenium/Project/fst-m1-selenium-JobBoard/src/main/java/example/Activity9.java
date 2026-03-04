package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9 {

	
	public static String jobRole = "Data Analyst";
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-login.php");
	
	WebElement user = driver.findElement(By.id("user_login"));
	user.sendKeys("root");
	WebElement pass = driver.findElement(By.id("user_pass"));
	pass.sendKeys("pa$$w0rd");
	WebElement submit = driver.findElement(By.id("wp-submit"));
	submit.click();
	
	WebElement elementUser = driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a/span"));
	String actCheckUser = elementUser.getText();
	if (actCheckUser.equals("root")) {
		System.out.println("User is logged in " + actCheckUser);
		
	WebElement jobListing = driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]"));	
	jobListing.click();
	
	WebElement addNew = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div/a[text()='Add New']"));	
	addNew.click();
	
	WebElement position = driver.findElement(By.xpath("//*[@id=\"post-title-0\"]"));
	position.sendKeys(jobRole);
	
	WebElement companyName = driver.findElement(By.id("_company_name"));
	companyName.sendKeys("IBM");
	
	WebElement publish = driver.findElement(By.xpath("//button[contains(text(),'Publish')]"));	
	publish.click();
	
	Thread.sleep(5);
	publish.click();
	
	WebElement viewJob = driver.findElement(By.xpath("//a[text()='View Job']"));	
	viewJob.click();
	
	WebElement jobs1 = driver.findElement(By.xpath("//a[(text()='Jobs')]"));
	jobs1.click();
	
	WebElement search = driver.findElement(By.id("search_keywords"));
	search.sendKeys(jobRole);
	
	WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit' and @value='Search Jobs']"));
	submit1.click();
	
	WebElement jobId = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]/a"));
	System.out.println(jobId.getText());
	if (jobId.getText().contains(jobRole)) {
		System.out.println("Job: " + jobRole +" was posted successfully in Job Listing page");
	}
	driver.quit();
	
	
	}

}

}
