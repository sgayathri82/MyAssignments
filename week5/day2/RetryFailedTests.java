package week5.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	int maxRetry=0;

	public boolean retry(ITestResult result) {
		if (maxRetry<2) {
			maxRetry++;
			return true;//retry will continue
		}
		return false;//->retry will stop
	}

}