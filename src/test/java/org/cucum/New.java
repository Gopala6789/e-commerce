package org.cucum;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\cucu\\src\\test\\resources" , 
glue="org.steps", 
dryRun = false,
monochrome = false,
strict = false ,
snippets = SnippetType.CAMELCASE ,
tags = {"@qw"} 


)


public class New {

}
//features="src\\test\\resources\\Features\\login.feature" ,glue="org.steps",
//monochrome = false , dryRun=false\,snippets=SnippetType.CAMELCASE , strict= false