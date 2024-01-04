package ExeJavaScriptViaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open appliaction.
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		//find all the elements
		WebElement UN = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//WebElement UN = driver.findElement(By.xpath("//div[input/@name='username']"));
		WebElement PWD = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//convert selenium driver to java script
		JavascriptExecutor js = driver;
		
		//enter the username in username textfield
		js.executeScript("arguments[0].value='Admin'", UN);
		
		
		//enter password in password textfield
		js.executeScript("arguments[0].value='admin123'",PWD);
		
		Thread.sleep(3000);
		
		//click on login button
		//js.executeScript("arguments[0].click()", loginbtn);
		loginbtn.click();
		
	}

}
