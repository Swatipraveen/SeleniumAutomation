package MouseHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open webpage
		driver.get("https://www.linkedin.com");
	
		//maximize window
		driver.manage().window().maximize();
		
		//perform right click event
		WebElement RightClick = driver.findElement(By.id("session_key"));		
		Actions action = new Actions(driver);
		
		action.contextClick(RightClick).build().perform();
	}

}
