package com.comcast.CreateOrganizationTest;

import org.testng.annotations.Test;

public class TC_01_CreateContactTest 
{
	@Test
	public void data()
	{
		String URL = System.getProperty("url");
		System.out.println(URL);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
	@Test(groups="regression")
	public void createContactTest()
	{
		System.out.println("execute createContactTest");
	}
	@Test(groups="regression")
	public void createContactWithOrganizationTest()
	{
		System.out.println("execute createContactWithOrganization");
	}
	@Test(groups="smoke")
	public void deleteContactTest()
	{
		System.out.println("execute deleteContactTest");
	}
}
