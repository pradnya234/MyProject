package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	private static WebDriver driver=new FirefoxDriver();
	@Given("^I am able to acess \"([^\"]*)\"$")

	public void i_am_able_to_acess(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		
		
	//    throw new PendingException();
	}

	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("field-keywords")).sendKeys(arg1);
	//	throw new PendingException();
	    
	}

	@Then("^I should get all my results with \"([^\"]*)\" keyword in it$")
	public void i_should_get_all_my_results_with_keyword_in_it(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}


	
	//Scenario 2 
	
	@Given("^I am on the search page  \"([^\"]*)\"$")
	public void i_am_on_the_search_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		driver.get(arg1);
	}

	@When("^I should be able to add product to basket \"([^\"]*)\"$")
	public void i_should_be_able_to_add_product_to_basket(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		if(arg1=="http://amazon.in")
		{
		 driver.findElement(By.name("field-keywords")).sendKeys(arg1);
		}
		else
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(arg1);
		}
	}

	@Then("^I should see product product in cart page$")
	public void i_should_see_product_product_in_cart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
