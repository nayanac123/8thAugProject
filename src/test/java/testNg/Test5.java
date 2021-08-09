package testNg;

import org.testng.annotations.Test;

public class Test5 {
	
	@Test(groups="one",priority=0,invocationCount=2)
	public void test1() {
		System.out.println("test1 GROUP 1");
	}
	@Test(groups="one",priority=1)
	public void test2() {
		System.out.println("test2 GROUP 1");
	}
	@Test(groups="two",priority=0)
public void test3() {
		System.out.println("test3 GROUP 2");
	}
	@Test(groups="two",priority=1)
	public void test4() {
		System.out.println("test4 GROUP 2");
	}
	@Test(dependsOnGroups="one")
	public void verifyGroup1() {
		System.out.println("group 1");
		
	}
	@Test(dependsOnGroups="two")
public void verifyGroup2() {
		System.out.println("group 2");
	}
	

}
