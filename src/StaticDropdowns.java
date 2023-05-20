import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		   Thread.sleep(2000L);
		   /*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
		}*/
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
