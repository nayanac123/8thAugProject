package testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener1 implements IRetryAnalyzer {
    int maxCount=3;
	public boolean retry(ITestResult result) {
		
		return false;
	}

}
