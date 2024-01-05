//This project explains the testing of Iframe

package AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeDemo
{
	ChromeDriver driver = new ChromeDriver();
	
	/*@BeforeTest
	public void beforeiframeDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://jqueryui.com/dialog/");
	}
	
	@Test
	public void iframeDemo() throws InterruptedException
	{
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Close']")).click();
	}
*/
	public static void main(String[] args) throws InterruptedException
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open the web application using URL
		driver.get("https://jqueryui.com/dialog/");
		
		//switch focus to Iframe window
		driver.switchTo().frame(0);
		
		
		Thread.sleep(5000);
		//find element 'X' to close the window by xpath
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		
	}

}
