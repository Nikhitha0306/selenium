import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		
		// chromedriver.exe --> Chrome Browser
		// webdriver.chrome.driver-->value of path
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
	    //Firefox launch
		//GeckoDriver.exe
		System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
				
		//Microsoft Edge launch
		//edgedriver.exe --> key value
		System.setProperty("webdriver.edge.driver", "lib/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	
	
	}

}
