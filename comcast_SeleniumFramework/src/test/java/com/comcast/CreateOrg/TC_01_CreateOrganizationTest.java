package com.comcast.CreateOrg;

import org.testng.annotations.Test;

public class TC_01_CreateOrganizationTest 
{
	@Test(groups="smoke")
	public void createOrganization ()
	{
		System.out.println("execute createOrganization");
	}
	@Test(groups="regression")
	public void createOrganizationWithIndustry()
	{
		System.out.println("execute createOrganizationWithIndustry");
	}
	@Test(groups="regression")
	public void deleteOrganization()
	{
		System.out.println("execute deleteOrganization");
	}
	@Test(groups="regression")
	public void updateOrganization()
	{
		System.out.println("execute updateOrganization");
	}
}
