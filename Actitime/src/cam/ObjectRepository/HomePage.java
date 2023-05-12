package cam.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
			@FindBy(xpath = "//div[.='Tasks']")
			private WebElement tasktb;
			
			@FindBy(xpath = "//div[.='Reports']")
			private WebElement reptb;
			
			@FindBy(xpath = "//div[.='Users']")
			private WebElement usertb;            
			
			@FindBy(id = "logoutLink")
			private WebElement lotb;
			
			//initilization
			public HomePage(WebDriver driver) {
				
				PageFactory.initElements(driver, this);
				
			}
			//utilization
			public WebElement getTasktb() {
				return tasktb;
			}

			public WebElement getReptb() {
				return reptb;
			}

			public WebElement getUsertb() {
				return usertb;
			}

			public WebElement getLotb() {
				return lotb;
			}
}
