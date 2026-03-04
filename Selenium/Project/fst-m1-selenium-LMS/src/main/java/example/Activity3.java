package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]/div/div/div/div[2]/h3"));
		String actHeading = element.getText();
		System.out.println(actHeading);
		String expHeading = "Actionable Training";
		if (actHeading.equals(expHeading)){
			driver.quit();
		}

	}

}
