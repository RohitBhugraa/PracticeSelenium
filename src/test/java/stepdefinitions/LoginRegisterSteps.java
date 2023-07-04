package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginRegisterSteps {
	
	
	@Given("User launches new loblaws url again")
	public void user_launches_new_loblaws_url_again() {
		System.out.println("User launches new loblaws url again");
		
	}
	
	
	@When("User clicks on Sign In link")
	public void user_clicks_on_sign_in_link() {
		
		System.out.println("User clicks on Sign In link");
	    
	}
	
	@Then("User lands on login page")
	public void user_lands_on_login_page() {
		System.out.println("User lands on login page");

	}
	
	@When("user clicks on Create PC ID link")
	public void user_clicks_on_create_pc_id_link() {
		System.out.println("user clicks on Create PC ID link");
	}
	@Then("user lands on Register page")
	public void user_lands_on_register_page() {
		System.out.println("user lands on Register page");

	}
	
	@Then("user enters Username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters Username and password");
	}
	@Then("user enter confirm password")
	public void user_enter_confirm_password() {
		System.out.println("user enter confirm password");
		
	}
	
	@Then("user clicks on terms chechbox")
	public void user_clicks_on_terms_chechbox() {
		System.out.println("user clicks on terms chechbox");
	}
	
	@Then("user clicks on Create a PCID button")
	public void user_clicks_on_create_a_pcid_button() {
		System.out.println("user clicks on Create a PCID button");
	    
	}
	
	@Then("user logs in to Loblaws website")
	public void user_logs_in_to_loblaws_website() {
		System.out.println("user logs in to Loblaws website");
		
	}
	
	@Then("User prints {string} address")
	public void user_prints_address(String email) {
	    
		System.out.println("user prints " + email);
	}


}
