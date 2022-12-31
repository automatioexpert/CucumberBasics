package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("user navigates to facebook website")
	public void user_navigates_to_facebook_website() {
		
		System.out.println("user navigates to facebook website");
	}
	

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("user validates the homepage title");
	}

	@Then("user entered the username")
	public void user_entered_the_username() {
		System.out.println("user entered the username");
	}

	@Then("user entered the password")
	public void user_entered_the_password() {
		System.out.println("user entered the password");
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		System.out.println("user should be successfully logged in");
	}

}
