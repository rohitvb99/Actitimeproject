package com.Actitime.TestScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FilefLibrary;

import cam.ObjectRepository.HomePage;

public class Task extends Baseclass {

	@Test
	public void CreatCustomer() throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		hp.getTasktb().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcstmr().click();
		
		FilefLibrary f=new FilefLibrary();
    	 String createcustomer = f.readDataFromExcel("Sheet1",1, 1);
  
		tp.getEntercn().sendKeys(createcustomer);
		String description = f.readDataFromExcel("Sheet1", 1, 2);
		tp.getCustdesc().sendKeys(description);
		SoftAssert s=new SoftAssert();
		
	    
		
	}
	
	
}
