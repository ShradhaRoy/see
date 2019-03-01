package com.cg.mra.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidMobileNumberException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

import junit.framework.Assert;
public class TestClass {
	public static AccountService services;
	@BeforeClass
	public static void setUpTestEnv() {
		services=new AccountServiceImpl();
			}
	@Test(expected=InvalidMobileNumberException.class)
	public void TestgetRechargeAccountForInvalidMobileNumber() throws InvalidMobileNumberException {
		Account expectedDetails=services.getAccountDetails("9990001230");
	}
	@Test
	public void TestgetRechargeAccountForValidMobileNumber() throws InvalidMobileNumberException {
		Account expectedDetails=services.getAccountDetails("9823920123");
		Account actualDetails= new Account("Prepaid", "Megha",453);
		Assert.assertEquals(expectedDetails, actualDetails);
	}
	@AfterClass
	public static void tearDownTestEnv() {
		services=null;
	}
	
	}

