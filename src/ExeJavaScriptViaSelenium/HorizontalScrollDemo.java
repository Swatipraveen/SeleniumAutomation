package ExeJavaScriptViaSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrollDemo {

	public static void main(String[] args) {

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://webflow.com/made-in-webflow/website/TRICKS-CMS-Horizontal-Scroll");

	}

}
