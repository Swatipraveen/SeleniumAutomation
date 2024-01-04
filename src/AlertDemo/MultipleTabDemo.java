package AlertDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTabDemo {

	ChromeDriver driver = new ChromeDriver();
	String firstwindowID;
	String secondwindowID;

	@BeforeTest
	public void Beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
	}

	@Test
	public void test() {
		// find the login dropdown
		driver.findElement(By.id("login-dropdown")).click();

		// find personal button and click on button
		driver.findElement(By.xpath("//a[@title='Personal ']")).click();

		// find about us link and click on link
		driver.findElement(By.linkText("About Us")).click();
	}

	@Test
	public void test2() {
		// get 1st window Id
		firstwindowID = driver.getWindowHandle();
		System.out.println("First window ID is:" + firstwindowID);

		// switch focus from 1st tab to 2nd tab
		Set<String> allwindowIDs = driver.getWindowHandles();

		for (String s : allwindowIDs) {
			if (!s.equals(firstwindowID)) {
				driver.switchTo().window(s);
			}
		}

		// find history button and click on it
		driver.findElement(By.id("ga-about-us-cta-1")).click();

		// get 2nd window Id
		secondwindowID = driver.getWindowHandle();
		System.out.println("Second window ID is:" + secondwindowID);
	}

	@Test
	public void test3() {
		// switch focus from 2nd tab to 3rd tab
		Set<String> nextallwindowIDs = driver.getWindowHandles();

		for (String s : nextallwindowIDs) {
			if (!s.equals(firstwindowID) && !s.equals(secondwindowID)) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.linkText("Contact Us")).click();
	}

}
