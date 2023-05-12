package cam.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(id = "username")
	private WebElement untf;
	
	@FindBy(name = "pwd")
	private WebElement pwtf;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	//initilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getUntf() {
		return untf;
	}

	public WebElement getPwtf() {
		return pwtf;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	
}
