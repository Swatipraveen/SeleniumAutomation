package AlertDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Javascript {
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void beforealertDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	@Test
	public void alertDemo() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert al = driver.switchTo().alert();		
		String text = al.getText();
		Thread.sleep(5000);
		System.out.println("the content of alert window:"+text);
		al.accept();
		//al.dismiss();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open the Application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//find the button : click on JS confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		//switch the focus to next page
		Alert al = driver.switchTo().alert();

		//Get the text from the alert window
		String text = al.getText();
		System.out.println("Text from alert window:+text");
		
		//click on ok button on alert window
		al.accept();
		
		//click on cancel button on alert window
		//al.dismiss();	
	}*/
}
