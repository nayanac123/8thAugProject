package javascriptExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jbk {
	WebDriver driver;
	
	@Test
	public void scrolTtest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://javabykiran.com/playground/");
		driver.manage().window().maximize();
		
		JavascriptExecutor sc= (JavascriptExecutor)driver;
		WebElement table=driver.findElement(By.linkText("Tables"));
		Thread.sleep(6000);
		sc.executeScript("arguments[0].scrollIntoView();",table);
		Thread.sleep(5000);
		table.click();
		System.out.println("clicked...");
		Thread.sleep(5000);
		
		
		
	}

}
