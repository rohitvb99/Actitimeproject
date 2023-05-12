package com.Actitime.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {


	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcstmr;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercn;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement cretcus;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement canclbtn;
	

	
	//initilization
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	//utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcstmr() {
		return newcstmr;
	}

	public WebElement getEntercn() {
		return entercn;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getCretcus() {
		return cretcus;
	}

	public WebElement getCanclbtn() {
		return canclbtn;
	}
}
