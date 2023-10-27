package a5pageloadtimeout;

/*
 * Page Load Time Out:
	•The pageLoadTimeout limits the time that the script allots for a web page to be displayed.
	•If the page loads within the time then the script continues.
	•If the page does not load within the timeout the script will be stopped by a TimeoutException.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");

		driver.close();
		
		
	}

}
