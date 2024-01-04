package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemonstration {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//get cookies
		Set<Cookie> allCookies = driver.manage().getCookies();
		
		for(Cookie ck: allCookies) {
			System.out.println(ck.getName()+"==="+ck.getExpiry()+"==="+ck.getDomain());
		}
		
	}

}
