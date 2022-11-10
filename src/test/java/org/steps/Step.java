package org.steps;

import org.cucum.Pojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Step extends Pojo{
	


	@Given("open the browser")
	public void open_the_browser() {
browser("https://www.facebook.com/");		

		}
@When("pass username and password")
	public void pass_username_and_password()  {
	search.sendKeys("user");
	
	
		}
	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		
driver.quit();	}}
