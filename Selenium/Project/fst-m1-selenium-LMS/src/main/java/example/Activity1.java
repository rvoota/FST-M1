package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "Alchemy LMS – An LMS Application";
				if (actTitle.equals(expTitle)) {
					driver.quit();
				}
		
	}

}
