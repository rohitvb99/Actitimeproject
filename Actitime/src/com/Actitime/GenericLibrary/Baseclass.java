package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import cam.ObjectRepository.HomePage;
import cam.ObjectRepository.LoginPage;
/**
 * 
 * @author ROHIT
 *
 */
public class Baseclass {
	public static WebDriver driver;
	FilefLibrary f=new FilefLibrary();
	
	
@BeforeSuite
public void databaseconnection() {
	Reporter.log("database connected successfully",true);
}
@BeforeClass
public void launchbrowser() throws IOException {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String URL = f.readDataFromeProperyFile("url");
	driver.get(URL);
	Reporter.log("browser launched successfully",true);
}
@BeforeMethod
public void login() throws IOException {
	LoginPage lp=new LoginPage(driver);
	lp.getUntf().sendKeys("admin");
	lp.getPwtf().sendKeys("manager");
	lp.getLgbtn().click();
	
	Reporter.log("login successfully",true);
}
@AfterMethod
public void loggedout() {
	HomePage hp=new HomePage(driver);
//	hp.getLotb().click();
Reporter.log("loggedout successfully",true);
}
@AfterClass
public void closedbrowser() {
	driver.close();
	Reporter.log("breowser closed successfully",true);
}
@AfterSuite
public void databasedissconnected() {
	Reporter.log("database disconnected successfully",true);
}
}
