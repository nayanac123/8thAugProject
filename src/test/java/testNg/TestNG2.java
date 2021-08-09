package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
	WebDriver driver;
	@Test
	public void verifyTitle() {
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods="verifyTitle",alwaysRun=true)
public void loginTest()
{
	
	System.setProperty("webdriver.chorome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///C:/Offline%20Website/index.html");
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	
	
}
	@Test(dependsOnMethods="loginTest")
	public void DashTest()
	{
	System.out.println("dashboard open...");
	}
	@Test(dependsOnMethods="DashTest")
	public void testUser() {
		System.out.println("user page...");
	}
	
	
	
}
