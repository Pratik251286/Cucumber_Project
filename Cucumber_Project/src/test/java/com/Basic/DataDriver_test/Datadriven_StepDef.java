package com.Basic.DataDriver_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Datadriven_StepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on OrangeHR login page\\.$")
	public void user_need_to_be_on_OrangeHR_login_page() {
		 driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	 	}

	@When("^User enters Username$")
	public void user_enters_Username()  {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	    
	}

	@When("^User enters Password$")
	public void user_enters_Password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button()  {
	    driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^User successfully logged in\\.$")
	public void user_successfully_logged_in()  {
	   String str = driver.findElement(By.xpath(".//*[@id='welcome']")).getText();;
	   Assert.assertEquals("Welcome Admin", str);
	   
	}
	
	@When("user enters following data")
	public void user_enters_following_data(DataTable table) {
		
		List<List<String>> data = table.raw();
		
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	}
	
	@When("User clck on ADD button")
     public void User_clck_on_ADD_button(){
		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b")).click();
		Actions action = new Actions(driver);
		WebElement E1 = driver.findElement(By.id("menu_admin_UserManagement"));
		action.moveToElement(E1);
		WebElement E2 = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		action.moveToElement(E2);
		action.click().build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("btnAdd")).click();
	}
	
	@When("user select user role as Admin")
	public void user_select_user_role_as_Admin(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select d1 = new Select(driver.findElement(By.id("systemUser_userType")));
		d1.selectByValue("1");
		
	}
	
	@When("user enters \"([^\"]*)\" as Employee name")
	public void user_enters_as_Employee_name(String Employeename){
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(Employeename);
	}
	
	@When("user enters \"([^\"]*)\" As Username")
	public void user_enters_As_Username(String UserName){
		driver.findElement(By.id("systemUser_userName")).sendKeys(UserName);
	}

	@When("user select status as Enabled")
	public void user_select_status_as_Enabled(){
		Select d2 = new Select(driver.findElement(By.id("systemUser_status")));
		d2.selectByValue("1");
	}
	
	@When("user enters \"([^\"]*)\" as password")
	public void user_enters_as_password(String Password){
		driver.findElement(By.id("systemUser_password")).sendKeys(Password);
	}
	
	@When("user enters \"([^\"]*)\" as confirm password")
	public void user_enters_as_confirm_password(String Confirmed_Password){
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(Confirmed_Password);
	}
	
	@When("User click on save button")
	public void User_click_on_save_button(){
		driver.findElement(By.id("btnSave")).click();
	}
	
	@Then("Close Firefox")
	public void Close_Firefox(){
		driver.close();
	}
}
