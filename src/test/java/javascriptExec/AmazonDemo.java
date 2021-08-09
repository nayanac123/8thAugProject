package javascriptExec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonDemo {
	WebDriver driver;
	
	@Test
	public void amazonTest() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
	WebElement amazon=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	
		jse.executeScript("arguments[0].scrollIntoView();",amazon);
		
		
		String s=amazon.getText();
		
	 // System.out.println("Text is:"+s);	
	  
	//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'][2]---footer xpath
//List<WebElement >elements =driver.findElements(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'][2]"));
		//System.out.println("size:"+elements.size());
		List<WebElement >elements =		driver.findElements(By.partialLinkText("amazon"));
		System.out.println("size:"+elements.size());
for(WebElement w:elements) {
		System.out.println(	"Country"+w.getText());
			
		}
	
		
		
		
	}
	

}
