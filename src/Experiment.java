import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    
	    //System.out.println(driver.get());
	    System.out.println(driver.getCurrentUrl());

	}

}
