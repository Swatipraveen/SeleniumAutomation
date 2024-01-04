package ExeJavaScriptViaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScrollDemo {

	public static void main(String[] args) throws InterruptedException
	{
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open application.
		driver.get("https://webflow.com/made-in-webflow/website/TRICKS-CMS-Horizontal-Scroll");
		
		Thread.sleep(5000);
		//1)scroll down to find locator 
		//WebElement InstaFeedLink = driver.findElement(By.xpath("//a[@aria-label='Instagram-flödet (öppnas i ett nytt fönster)']"));
		
		//convert selenium  driver to java script
		JavascriptExecutor js = driver;
		
		//js.executeScript("arguments[0].scrollintoview(true)", InstaFeedLink);
		
		//2)scroll down till end of the page
		js.executeScript("window.scrollBy(0, 2500)");
		
	}

}
