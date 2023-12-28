package features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Search {
	
	@Given("^I visit the website as guest user$")
	public void I_visit_the_website_as_guest_user() {
		System.out.println("<<<<I visit the website as guest user>>>>");
	}
	
	@When("^I select the books options from the search fropdown$")
	public void I_select_the_books_options_from_the_search_fropdown() {
		System.out.println(">>>>>I select the books options from the search fropdown<<<<<");
	}
	
	

}
