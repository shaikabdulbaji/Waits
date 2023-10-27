package a2Implicitwait;

/*
 * Implicit Wait: 
	•During Implicit wait if the Web Driver cannot find it immediately because of its availability, it will
	 keep polling the DOM to get the element.
	•If the element is not available within the specified Time an NoSuchElementException will be raised.
	•The default setting is zero.
	•Once we set a time, the Web Driver waits for the period of the WebDriver object instance.
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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.close();

	}

}
