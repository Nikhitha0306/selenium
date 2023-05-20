import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRpractice001 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.driver.chromedriver","lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
		//Open scouts website
		driver.get("https://www.scouts.org.uk/");
		System.out.println(driver.getCurrentUrl());
		
		//Click Accept All Cookies
		Thread.sleep(2000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		//Open menu options Join Scouts
		driver.findElement(By.xpath("Div[@class='//AppNav_nav_aqmUc']")).click();
		
	}

}
