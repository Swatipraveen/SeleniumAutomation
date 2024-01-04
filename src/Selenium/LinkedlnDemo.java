package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedlnDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.linkedin.com");
		
		driver.findElement(By.name("session_key")).sendKeys("swatipraveen22@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Swareen2012");
		driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
		
		driver.findElement(By.xpath("//button[@id='ember14']")).click();
		
	}

}
