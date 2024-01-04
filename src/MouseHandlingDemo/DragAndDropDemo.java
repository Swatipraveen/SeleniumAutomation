package MouseHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// open webpage
		driver.get("https://jqueryui.com/droppable/");

		// maximize window
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement SmallBox = driver.findElement(By.id("draggable"));
		WebElement BigBox = driver.findElement(By.id("droppable"));
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDrop(SmallBox, BigBox).build().perform();
	}

}
