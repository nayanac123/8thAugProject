package actionclass;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JbkAlert {
	WebDriver driver;
	@Test
	public void actionTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://javabykiran.com/playground/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
 List < WebElement >links= driver.findElements(By.xpath("//a[@class='nav-link']"));
 
 for(WebElement link:links) {
	 act.moveToElement(link).pause(600).build().perform();
 }

 driver.findElement(By.linkText("Drag and Drop")).click();
 Thread.sleep(2000);
 
 WebElement src=driver.findElement(By.xpath("//li[@data-name='Home']"));
 WebElement dest=driver.findElement(By.xpath("//li[@data-name='Contact Us']"));
 Thread.sleep(2000);
 act.dragAndDrop(src,dest).perform();
 
 //act.contextClick().perform();
 
/*
 driver.findElement(By.xpath("//a[@href='login']")).click();  
 
 WebElement uname= driver.findElement(By.xpath("//input[@placeholder='Email']"));;
 WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));;
 WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));  

act.click(uname).sendKeys("mangesh@gmail.com").build().perform();
act.click(password).sendKeys("123456").build().perform();
act.click(login).perform();
  */ 
}
	
	

}
