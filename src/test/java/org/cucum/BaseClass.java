package org.cucum;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.github.dockerjava.api.command.CopyFileFromContainerCmd;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	public static WebDriver driver;
	
	public static void browser(String url) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);	
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Pojo.class);

	}


public static  void scrn(String name) throws IOException {
	TakesScreenshot s = (TakesScreenshot) driver;
	File src = s.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\cucu\\screenshot"+name+".png");
	FileUtils.copyFile(src, des);}

public static void  txtpass(WebElement loc , String logic   ) {
	loc.sendKeys(logic);
}
public static void btn(WebElement btn) {
btn.click();
}
public static  void closedriver() {
driver.quit();

}
}





  