package testNg;

import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@Test(priority=-1)
	
	public void test01()
	{
		System.out.println("test case 01");
	}
	@Test(priority=2)
	public void test02()
	{
		System.out.println("test case 02");
	}
	@Test
	public void test03()
	{
		System.out.println("test case 03");
	}
	
	

}
