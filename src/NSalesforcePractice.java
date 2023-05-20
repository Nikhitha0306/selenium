import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NSalesforcePractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");	

		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2));

		driver.get("https://gmailcomcpq44-dev-ed.develop.my.salesforce.com/"); //URL in the browser
		
		//driver.findElement(By.id("username")).sendKeys(" tpk.sfdc@gmail.com.cpq");
		driver.findElement(By.className("username")).sendKeys(" tpk.sfdc@gmail.com.cpq");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys(" tpk.sfdc@gmail.com.cpq");
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys(" tpk.sfdc@gmail.com.cpq");		
		//driver.findElement(By.cssSelector(".username")).sendKeys(" tpk.sfdc@gmail.com.cpq");
		
		driver.findElement(By.id("password")).sendKeys("Brixton69");
		
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		//Assert.assertEquals(driver.findElement(By.id("error")).getText(), "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");		
		//System.out.println(driver.findElement(By.id("error")).getText());
		
		 Thread.sleep(10000L);
		 
		 driver.findElement(By.className("slds-icon-waffle")).click();
		 Thread.sleep(10000L);
		 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("sal");
		 Thread.sleep(3000);
		 List<WebElement> options1 = driver.findElements(By.xpath("//p[@class='slds-truncate']"));
		 

			for(WebElement option :options1)

			{

			if(option.getText().equalsIgnoreCase("Sales"))

			{

			option.click();

			break;

			}

			}
			
			
			
			Actions a = new Actions(driver);
			 
			Thread.sleep(4000);
			a.moveToElement(driver.findElement(By.xpath("//a[@title='Accounts']"))).click().build().perform();
			
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='New']")).click();
			 Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Nikhitha6");
			
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			//Thread.sleep(1);
			//System.out.println(driver.switchTo().alert().getText());
			
			//Alert alert = driver.switchTo().alert(); // switch to alert

			//String alertMessage= driver.switchTo().alert().getText(); // capture alert message

			//System.out.println(alertMessage);
			//setTimeout(()=>{debugger},2000)(In console to pause the page)
			String toastMessage = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']"))).getAttribute("innerText");

			//String toastTitle = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
			System.out.println(toastMessage);
			//System.out.println(driver.findElement(By.xpath("//div[@role='alertdialog']")));
			


	}

}
