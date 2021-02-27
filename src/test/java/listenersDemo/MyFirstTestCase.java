package listenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenersDemo.TestNGListeners1_may6.class)
public class MyFirstTestCase
{
	
	
	@Test
	public void GoogleTitleVerify()
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./src/test/utilities/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
	
	@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
	@Test
	public void TitleMatch1()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
	
}
