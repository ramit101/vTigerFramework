package flipkart;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.crm.vTiger.generic_library.RETRYTestListIm;

public class ReteyAnalyserImp implements IRetryAnalyzer {

	@Test()
	public boolean retry(ITestResult result) {
		expectedString exp="abc";
		actualString actual="xyz";
		Assert.assertEquals(expectedString, actualString);
		return false;
	}
	}
