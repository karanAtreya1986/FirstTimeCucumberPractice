package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingStepDef {
	
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	    
	}

	@When("user enters bill amount {string}")
	public void user_enters_bill_amount(String billingAmount) {
	    this.billingAmount=Double.parseDouble(billingAmount); //convert string to double and give to the numeric guy/girl
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount=Double.parseDouble(taxAmount);
	}

	@When("user clicks calculate button")
	public void user_clicks_calculate_button() {
	   
	}

	@Then("final amount is given {string}")
	public void final_amount_is_given(String finalAmount) {
	   this.finalAmount=this.billingAmount+this.taxAmount; //this.finalAmount is already double as we have declared it.
	   System.out.println("expected final amount is " + " " + Double.parseDouble(finalAmount));
	   System.out.println("Actual final amount is " + " " + this.finalAmount);
	   Assert.assertTrue(this.finalAmount==Double.parseDouble(finalAmount)); // if the condition is true then assertion should be passed
	}

}
