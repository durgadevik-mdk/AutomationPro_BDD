package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackground {

	WebDriver driver;

	public WhiteBackground(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS,using = "button[onclick='myFunctionWhite()']")
	WebElement VERIFY_WHITE_BUTTTON_FILED;
	
	public void enableBlueButton() {
		boolean verifybutton = VERIFY_WHITE_BUTTTON_FILED.isEnabled();
		Assert.assertTrue(verifybutton);
		
		
	}
	
	public void backgroundcolor() {
		VERIFY_WHITE_BUTTTON_FILED.click();
	}
	
	public void verifycolor() {

		String text = VERIFY_WHITE_BUTTTON_FILED.getText();
		String color = VERIFY_WHITE_BUTTTON_FILED.getCssValue("background-color");
		
		Assert.assertEquals("rgba(239, 239, 239, 1)", color);

	}

	
	
	
	

}
