package com.impactguru.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.impactguru.pageObjects.fisrtPage;



public class TC001_FirstPage  extends BaseClass {
	
	@Test
	public void TC001() throws InterruptedException, IOException {


		fisrtPage fp = new fisrtPage(driver);
		
	
		fp.clickusernameonFirsthit();
		Thread.sleep(2000);
		fp.SendUserName();
		Thread.sleep(2000);
		fp.SendPassword();
		Thread.sleep(2000);
		fp.clicksubmit();
		Thread.sleep(2000);
		fp.clickdonateNow();
		
		
		Thread.sleep(2000);


		if (driver.getTitle().equals("Help testdocumentchecklist raise funds to fight fkeknfek - I")) {
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"TC001_FirstPage");
			Assert.assertTrue(false);
		}
	}
	

}
