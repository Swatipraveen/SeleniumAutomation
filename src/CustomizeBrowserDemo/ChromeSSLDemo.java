package CustomizeBrowserDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSSLDemo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
	}

}
