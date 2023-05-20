import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prsalesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.driver.chromedriver","lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		//salesforce url
		driver.get("https://gmailcomcpq44-dev-ed.develop.my.salesforce.com/");
		System.out.println(driver.getCurrentUrl());
		
		//salesforce login
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tpk.sfdc@gmail.com.cpq");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Brixton69");
		driver.findElement(By.id("Login")).click();
		
		//wait for 3 seconds to load Apps
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//search for sales app and click on sales to open
		//wait for 3 seconds to load Apps
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@='Search apps and items...']")).sendKeys("Sales");
	}

}
