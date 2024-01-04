package MouseHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args)
	{
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open webpage
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
	
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept-choices")).click();
		//perform double click event
		
		driver.switchTo().frame("iframeResult");
		WebElement DblClkBtn = driver.findElement(By.xpath("//button[text()='Double-click me']"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(DblClkBtn).build().perform();
	}

}
