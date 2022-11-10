package org.cucum;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\cucu\\src\\test\\resources\\Features" ,glue="org.steps" ,
monochrome = true , dryRun=true,snippets=SnippetType.CAMELCASE , strict= true)
public class New {

}
