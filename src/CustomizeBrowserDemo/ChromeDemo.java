package CustomizeBrowserDemo;

import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SwatiDocs\\chromedriver-win64\\chromedriver.exe");
		
		Map<String, Object> preferences = new Hashtable<String, Object>();
		preferences.put("download.default_directory", "F:\\");
		
		ChromeOptions options  = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
