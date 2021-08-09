package DemoAutoId;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIdDemo {
public static void main(String[] args) throws IOException {
	WebDriver driver=null;
	System.setProperty("webdriver..driver" ,"chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.get("file:///C:/AutoId/upload.html");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@type='file']")).click();
	Runtime.getRuntime().exec("C:\\AutoId\\demo.exe");
}
}
