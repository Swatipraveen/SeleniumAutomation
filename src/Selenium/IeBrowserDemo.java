package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\SwatiDocs\\IEDriverServer.exe" );
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("swatihiremath786@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Lovemocktail2");
		driver.findElement(By.name("login")).click();
	}

}
