package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(10);
		driver.get("https://alchemy.hguy.co/crm");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "SuiteCRM";
				if (actTitle.equals(expTitle)) {
					driver.quit();
				}
		
	}

}
