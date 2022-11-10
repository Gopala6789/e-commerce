package org.cucum;


import org.junit.AfterClass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	//public Pojo() {
	//	PageFactory.initElements(driver, this);
	//}
	
	@FindBy(id="email")
	public static WebElement search;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement sear;
	@FindBy(id="nav-search-submit-button")
	public static WebElement pass;
	@FindBy(name="login")
	public static WebElement btn;
@FindBy(xpath="//span[contains(text(),'Smartphones') ])[3]")
public static WebElement text;

@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
public static WebElement check;

	
@FindBy(xpath="//a[@data-csa-c-id='s1sgqy-2j3zpl-9uckm8-gjw82m']")
public static WebElement tc2;
	
@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_electronics']")
public static WebElement tc4;

@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_bestsellers']")
public static WebElement tc3;




/*public static WebElement getSearch(WebDriver driver) {
		return search;
	}

	public WebElement getClick(WebDriver driver) {
		return click;*/
	}



	
	 
	

