package selectClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelectDemo {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
	}
		


	@Test
	public void test01() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@href='users.html']")).click();
		driver.findElement(By.xpath("//button[text()='Add User']")).click();
		Select s=new Select(driver.findElement(By.tagName("select")));
		s.selectByVisibleText("Delhi");
		driver.findElement(By.id("username")).sendKeys("nayana");
		driver.findElement(By.id("mobile")).sendKeys("3455667");
		driver.findElement(By.id("email")).sendKeys("nayana@gmail.com");
		driver.findElement(By.id("course")).sendKeys("selenium");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("password")).sendKeys("77777");
		driver.findElement(By.id("submit")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
	}
}
