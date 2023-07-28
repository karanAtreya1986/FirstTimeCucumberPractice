package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setUpBrowser(Scenario sc) {
		System.out.println("launching chrome brower");
		System.out.println(sc.getName());
		//int i=9/0;
	}

//	@Before(order = 2)
//	public void setUpURL() {
//		System.out.println("launching url");
//	}

	@After("@Regression")
	public void tearDownClose(Scenario sc) {
		System.out.println("close the browser");
		System.out.println(sc.getName());
	}

//	@After(order = 2)
//	public void tearDownLogout() {
//		System.out.println("logout from the application");
//	}

//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("takes screenshot after every step");
//	}
//
//	@AfterStep
//	public void refreshBrowser() {
//		System.out.println("refresh the browser after every step");
//	}
}
