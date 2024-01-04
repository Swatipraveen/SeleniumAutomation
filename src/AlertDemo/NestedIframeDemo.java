package AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NestedIframeDemo
{
	ChromeDriver driver = new ChromeDriver();

	@BeforeTest
	public void beforetest() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	}

	@Test
	public void test()
	{
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement text = driver.findElement(By.id("content"));
		String s1 = text.getText();
		System.out.println("The text is:" + s1);
		String s2 = "MIDDL";
		Assert.assertEquals(s2, s1);
	}

	/*
	 * public static void main(String[] args) { //launch the browser
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe"); ChromeDriver driver =
	 * new ChromeDriver();
	 * 
	 * //launch the application
	 * driver.get("https://the-internet.herokuapp.com/nested_frames");
	 * 
	 * //switch from html page to parent frame driver.switchTo().frame("frame-top");
	 * 
	 * //switch from parent frame to child frame driver.switchTo().frame(1);
	 * 
	 * WebElement middleframe = driver.findElement(By.id("content"));
	 * 
	 * //get text from the child frame String text = middleframe.getText();
	 * 
	 * //display text from the child frame
	 * System.out.println("The middle frame is:"+text);
	 * 
	 * boolean test = text.equals("MIDDLE");
	 * System.out.println("Is it middle?:"+test); }
	 */

}
