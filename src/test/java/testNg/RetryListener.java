package testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

       int mxCount=2;
       int count=1;
	
       public boolean retry(ITestResult result) {
		if(count<=mxCount) {
			count++;
			return true;
			
		}
		
		return false;
	}
	

}
