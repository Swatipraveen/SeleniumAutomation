package CustomizeBrowserDemo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxSSLDemo {

	public static void main(String[] args) {
		FirefoxOptions Options = new FirefoxOptions();
		Options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.gecko.driver", "C:\\SwatiDocs\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(Options);
		driver.get("https://expired.badssl.com");
	}

}
