package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SwatiDocs\\geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();

		// open chrome browser 
		driver.get("https://www.facebook.com");
		
		//enter username and password
		driver.findElement(By.id("email")).sendKeys("swatihiremath786@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Lovemocktail2");
		
		//allow cookies window
		driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']")).click();
		
		//Next button 
		driver.findElement(By.name("login")).click();
		
		//Remember password
		//List<WebElement> alltextbox = driver.findElements(By.className("x6s0dn4"));
		//alltextbox.get(1).click();
		
	}

}
