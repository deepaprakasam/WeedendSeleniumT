package UnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronologies {
	@BeforeSuite
	public void suiteFile()
	{
	Reporter.log("Before suite",true);

}
	@BeforeTest
	public void add()
	{
		Reporter.log("add suite",true);
	}
	@Test
	public void suite()
	{
		Reporter.log("Test suite",true);
	}
	@AfterTest
	public void add1()
	{
		Reporter.log("add1",true);
	}

	@AfterSuite
	public void suiteFile1()
	{
	Reporter.log("After suite",true);

}

}