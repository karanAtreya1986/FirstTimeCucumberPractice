package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	  System.out.println("user navigates on registration page");
	}

	@When("user enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
	    List<List<String>> userList=dataTable.asLists(String.class);// this step will first take the String input.
	    //as Lists returns List of List of Objects.
	   //this for loop will print row by row data.
	    for(List<String> e:userList) {
	    	System.out.println(e);
	    }
	    
	   
	}

	@Then("user registration is successful")
	public void user_registration_is_successful() {
	    System.out.println("user registration is successful");
	}
	
	@When("user enters the following details with column headers")
	public void user_enters_the_following_details_with_column_headers(DataTable dataTable) {
	   List<Map<String, String>> userMap= dataTable.asMaps(String.class, String.class);
	 //  System.out.println(userMap);
	 //  System.out.println(userMap.get(0).get("firstName")); //get(0) will go to the 0th guy in list of maps. first row of the list.
	   //To retrieve value from map use the get method and pass in the key, get("firstname").
	   
	   //using for loop to print the values of all columns
	   for(Map<String, String> e:userMap) {
		   System.out.println(e.get("firstName"));
		   System.out.println(e.get("lastName"));
		   System.out.println(e.get("email"));
		   System.out.println(e.get("phone"));
		   System.out.println(e.get("location"));
	   }
	}

}
