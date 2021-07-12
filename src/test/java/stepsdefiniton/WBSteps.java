
package stepsdefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WhiteBackground;
import util.BrowserFactory;

public class WBSteps {

	WebDriver driver;
	WhiteBackground whitebackground;

	@Before
	public void initializeBrowser() {
		driver = BrowserFactory.launchBrowser();
		whitebackground = PageFactory.initElements(driver, WhiteBackground.class);
	}
	
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		whitebackground.enableBlueButton();
	}

	@When("^User click on the button;$")
	public void i_click_on_the_button() throws Throwable {
		whitebackground.backgroundcolor();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	    whitebackground.verifycolor();
	}

	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
