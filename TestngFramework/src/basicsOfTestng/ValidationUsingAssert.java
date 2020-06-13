package basicsOfTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationUsingAssert {
	@Test(retryAnalyzer = basicsOfTestng.RetryAnalyzer.class)
	public void assert1()
	{
		int a= 10;
		int b = 20;
		int c= a+b;
		Assert.assertEquals(c, 30);
		//Assert.assertTrue(true, "it is not equal to 30");
	}

}
