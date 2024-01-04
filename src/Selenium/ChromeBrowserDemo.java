package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("swatihiremath786@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Lovemocktail2");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']")).click();
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Lovemocktail2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='login']")));
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
		//driver.findElement(By.name("login")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_5_bL"))).click();
		//driver.quit();
	}

}
