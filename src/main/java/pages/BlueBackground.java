package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BlueBackground {

	WebDriver driver;

	public BlueBackground(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement VERIFY_BLUE_BUTTTON_FILED;

	public void enableBlueButton() {
		boolean verifybutton = VERIFY_BLUE_BUTTTON_FILED.isEnabled();
		Assert.assertTrue(verifybutton);
	}

	public void backgroundcolor() {

		VERIFY_BLUE_BUTTTON_FILED.click();
	}

	public void verifycolor() {

		String text = VERIFY_BLUE_BUTTTON_FILED.getText();
		String color = VERIFY_BLUE_BUTTTON_FILED.getCssValue("background-color");
		Assert.assertEquals("rgba(239, 239, 239, 1)", color);

	}

}
