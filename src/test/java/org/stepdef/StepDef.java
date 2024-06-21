package org.stepdef;

import org.openqa.selenium.WebDriver;

import com.Assessment.Base;
import com.Assessment.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDef extends Base {
	
	public WebDriver driver;
	public Pom a;
	
	@Given("Launch browser and Url")
	public void launch_browser_and_url() {	
		driver = browserlaunch(url);		   
	}
	 
	@Given("Pass the username")
	public void pass_the_username() {
		a = new Pom(driver);
		sendkeys(a.getUsername(),username);	    
	}
	
	@Given("Pass the password")
	public void pass_the_password() {
		a = new Pom(driver);
		sendkeys(a.getPassword(),password);	
	    
	}
	
	@Then("click the login")
	public void click_the_login() {
		a = new Pom(driver);
	    a.getLogin().click();
	}



}
