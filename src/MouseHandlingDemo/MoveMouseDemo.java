package MouseHandlingDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveMouseDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		// launch chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				// open webpage
				driver.get("https://www.flipkart.com/");

				// maximize window
				driver.manage().window().maximize();
		
				
				//perform mouse move action after finding element
				WebElement groceriesbutton = driver.findElement(By.xpath("//a[@aria-label='Grocery']/div/div/span/span[text()='Grocery']"));
				Actions action = new Actions(driver);
				action.click(groceriesbutton).build().perform();
				
				
				//Implicit wait
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//explicit wait
				/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				//expected condition
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pincode")));
				*/
				
				driver.findElement(By.name("pincode")).sendKeys("585105");
				
				/*WebElement PincodeTxtBox = driver.findElement(By.name("pincode"));
				action.sendKeys(PincodeTxtBox, "585105").build().perform();
				*/
				/*WebElement detectLocation = driver.findElement(By.xpath("//button[@type='button']"));
				action.click(detectLocation).build().perform();		
				*/
				
				
				
				
				
				
				

	}

}
