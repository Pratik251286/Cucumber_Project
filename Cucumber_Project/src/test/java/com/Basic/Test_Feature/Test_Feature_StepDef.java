package com.Basic.Test_Feature;

import java.util.List;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Feature_StepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on OrangeHR login page 1\\.$")
	public void user_need_to_be_on_OrangeHR_login_page_1() {
		 driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	 	}

	@When("^User enters Username 1$")
	public void user_enters_Username_1()  {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	    
	}

	@When("^User enters Password 1$")
	public void user_enters_Password_1() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    
	}

	@When("^User click on Login button 1$")
	public void user_click_on_Login_button_1()  {
	    driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^User successfully logged in 1\\.$")
	public void user_successfully_logged_in_1()  {
	   String str = driver.findElement(By.xpath(".//*[@id='welcome']")).getText();;
	   Assert.assertEquals("Welcome Admin", str);
	   
	}
	
	@When("user enters following data 1")
	public void user_enters_following_data_1(DataTable table) {
		
		List<List<String>> data = table.raw();
		
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		
		
	}


}
