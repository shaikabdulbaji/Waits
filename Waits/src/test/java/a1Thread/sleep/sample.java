package a1Thread.sleep;

/*
 * Thread.Sleep:
	•Thread.sleep method is used to pause the execution for defined time. Time is defined in milliseconds for this method.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.get("https://www.google.com/");

		driver.close();

	}

}
