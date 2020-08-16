package step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definations {

	@Given("User is able to acess login page")
	public void user_is_able_to_acess_login_page() {
	   System.out.println("Navigate to website URL..");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("validate login page..");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Enter username and password..");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("click on login button...");
	}

	@When("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("user is on home page..validate home page");
	}

	@When("user access menu test data")
	public void user_access_menu_test_data() {
		System.out.println("access your menu test data..");
	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() {
		System.out.println("User clicks on logout button..");
	}

	@Then("user logged out of application and back to login page")
	public void user_logged_out_of_application_and_back_to_login_page() {
		System.out.println("User logged out successfully..and user is on home page..");
	}

	
}
