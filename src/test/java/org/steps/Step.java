package org.steps;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.bouncycastle.asn1.dvcs.Data;
import org.cucum.BaseClass;
import org.cucum.Pojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Step extends Pojo{
	BaseClass b =  new BaseClass();
	
	@Given("open the browser")
	public void open_the_browser() {
		browser("https://www.amazon.in/");
		}
	
	@When("Create account")
	public void createAccount() {
   acctcreation.click();
	   accnt.click();
	   mble.sendKeys("9677139333");
	   password.sendKeys("Qwerty@123");
	   username.sendKeys("am not a user");
	   countinue.click();
	   for (int i = 0; i < 3; i++) {
		   driver.navigate().back();
		
	}
	}
	
	@When("going to search iphone in amazon")
	public void going_to_search_iphone_in_amazon() throws IOException {
		searchbar.sendKeys("iphone 10");
		clicksearchbar.click();
		iphpone.click();
		String parent = driver.getWindowHandle();
		Set<String> chlid = driver.getWindowHandles();
		for (String x : chlid) {
			if (x != parent) {
				driver.switchTo().window(x);
				}
			WebElement txt = iphpone;
			System.out.println(txt.getText());
			}	
	}
	
	@When("going to add cart")
	public void going_to_add_cart() {
		cart.click();
driver.navigate().refresh();
		  
	}
	@When("select payment method and buy")
	public void select_payment_method_and_buy() {
		buy.click();
	accnt.click();
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
	//FaceBook
	@Given("To open chrome")
	public void to_open_chrome() {
	    browser("https://www.facebook.com/login/");
	    }

@When("Vaild username and invalind password")
public void vaildUsernameAndInvalindPassword(io.cucumber.datatable.DataTable d) {
	List<String> s = d.asList();
	
	String name = s.get(0);
  String passwod = s.get(1);
  
  email.sendKeys(name);
  pass.sendKeys(passwod);
  login.click();
  driver.close();
  
}

@When("inVaild username and valind password")
public void invaildUsernameAndValindPassword(io.cucumber.datatable.DataTable d) {
    browser("https://www.facebook.com/login/");
	
List<String> s = d.asList();
	
	String name = s.get(0);
  String passwod = s.get(1);
  
  email.sendKeys(name);
  pass.sendKeys(passwod);
  login.click();
  driver.close();
  
}

@When("Vaild username and valind password")
public void vaildUsernameAndValindPassword(io.cucumber.datatable.DataTable d) {
    browser("https://www.facebook.com/login/");

List<String> s = d.asList();
	
	String name = s.get(0);
  String passwod = s.get(1);
  
  email.sendKeys(name);
  pass.sendKeys(passwod);
  login.click();
driver.close();   
}

@When("inVaild username and invalind password")
public void invaildUsernameAndInvalindPassword(io.cucumber.datatable.DataTable d) {
    browser("https://www.facebook.com/login/");

List<String> s = d.asList();
	
	String name = s.get(0);
  String passwod = s.get(1);
  
  email.sendKeys(name);
  pass.sendKeys(passwod);
  login.click();
  
}

@Then("close")
public void close() {
    driver.close();
}

}
