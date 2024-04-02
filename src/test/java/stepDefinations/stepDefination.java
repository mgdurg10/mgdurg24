package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.restApiTests;

public class stepDefination extends restApiTests {
	@Given("user hits url")
	public void user_hits_url() {

		System.out.println("User hits url and getting response");
	    throw new io.cucumber.java.PendingException();
	}
	@When("an event happens")
	public void an_event_happens() {

		System.out.println("User should be able to see status code");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should get <code> as expectedcode")
	public void i_should_get_code_as_expectedcode() {

		String response=verifyresponsecode();
		Assert.assertEquals(response, "200", "StatusCode 200 getting validated");
	    throw new io.cucumber.java.PendingException();
	}
	public void user_hits_url1() {
		System.out.println("User hits url and getting response");
	    throw new io.cucumber.java.PendingException();
	}
	@When("user gets all prices")
	public void user_gets_all_prices() {
		System.out.println("User should be able to see all list of prices with currencies");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should get INT price")
	public void user_should_get_int_price() {
		verifyINRPrice();
		System.out.println("Valid INR Value found");
	    throw new io.cucumber.java.PendingException();
	}

}
