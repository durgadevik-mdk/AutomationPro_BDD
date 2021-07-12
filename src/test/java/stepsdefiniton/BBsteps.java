
package stepsdefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BlueBackground;
import util.BrowserFactory;

public class BBsteps {

	WebDriver driver;
	BlueBackground bluebackground;

	@Before
	public void initializeBrowser() {
		driver = BrowserFactory.launchBrowser();
		bluebackground = PageFactory.initElements(driver, BlueBackground.class);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		bluebackground.enableBlueButton();
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {

		bluebackground.backgroundcolor();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		bluebackground.verifycolor();

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
