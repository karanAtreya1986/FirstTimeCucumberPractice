package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingStepDef {

	@Given("User selects car type {string} from app")
	public void user_selects_car_type_from_app(String carType) {
		System.out.println("step 1" + carType);
	}

	@When("user selects car as {string} and pick up as {string} and drop as {string}")
	public void user_selects_car_as_and_pick_up_as_and_drop_as(String carType, String pickupLocation,
			String dropLocation) {
		System.out.println("step 2" + carType + " " + pickupLocation + " " + dropLocation);
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3");
	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step 4");
	}

	@Then("user pays {int} us dollars")
	public void user_pays_us_dollars(Integer price) {
		System.out.println("step 5" + " " + price);
	}

}
