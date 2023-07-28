package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import amazonImplementation.Product;
import amazonImplementation.Search;

public class SearchFeatureStepDef {

	Product product;
	Search search;

	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("step 1 - i am on search page");
	}

	@When("^I search for product with name \"([^\"]+)\" and price is (\\d+)$")
	public void i_search_for_product_with_name_and_price_is(String productName, Integer price) {
		System.out.println("step 2 - search product with name " + productName + " and price is " + price);

		product = new Product(productName, price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("step 3 - product with " + productName + " : is displayed");
		search = new Search();
		String productNameReturned = search.displayProductName(product);
		System.out.println("returned product is " + productNameReturned);
		Assert.assertEquals(product.getProductName(), productNameReturned);
	}

	@Then("order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer orderId, String userName) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("order id is " + orderId + " " + "and username is " + userName);
	}

}
