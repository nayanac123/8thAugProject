package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg4 {

	WebDriver driver;

	@Test(groups = "login1", priority = 2)
	public void loginTest() {

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		System.out.println("loginTest...");
                           }

	@Test(groups = "login1", priority = 1)
	public void checkLoginTitle() {
		System.setProperty("webdriver.chorome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
		System.out.println("loginTitle");

	}

	@Test(dependsOnGroups = "login1", groups = "dash")
	public void dashBoardTest() {

		WebElement header = driver.findElement(By.xpath("//h1"));
		Assert.assertTrue(header.getText().contains("Dashboard"));
		System.out.println("dashboard");

	}

	@Test(dependsOnGroups = { "login1", "dash" })
	public void alogout() {
 System.out.println("logout");
	}

}
