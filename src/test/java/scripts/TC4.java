package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC4 extends BaseTest
{
	@Test
	public void test2()
	{
		test.info(driver.getTitle());
		//Assert.fail();
	}
}
