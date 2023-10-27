package a4Fluentwait;

/*
 * Fluent Wait: 
	•Let’s say you have an element which sometime appears in just 1 second and some time it takes minutes to appear.
	•In that case it is better to use fluent wait, as this will try to find element again and again until it find it 
	 or until the final timer runs out.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

/*
 * Explicit Wait:  

	•There can be instance when a particular element takes more than a minute to load.
	•In that case you definitely not like to set a huge time to Implicit wait, as if you do this your browser will
	 going to wait for the same time for every element.
	•To avoid that situation you can simply put a separate time on the required element only.
	•By following this your browser implicit wait time would be short for every element and it would be large for 
	specific element.
	
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		  // Fluent Wait
		 FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);

		 fluentWait.withTimeout(30, TimeUnit.SECONDS);

		 fluentWait.pollingEvery(1, TimeUnit.SECONDS);

		 fluentWait.ignoring(NoSuchElementException.class);

		 fluentWait.until(ExpectedConditions.visibilityOf(gmail));


		 driver.close();
	}
}
