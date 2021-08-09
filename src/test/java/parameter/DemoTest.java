package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	@Test
	public void loginTest()
	{
		
		System.setProperty("webdriver.chorome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		System.out.println("logintest...DemoTest");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.chorome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		System.out.println("verifytitle...DemoTest");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

}
