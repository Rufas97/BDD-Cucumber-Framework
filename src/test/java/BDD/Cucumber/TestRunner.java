package BDD.Cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"feature"},
                 glue =     {"StepDefinitionspackage"},
                 plugin =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 //tags="@login",
                  monochrome = true )
public class TestRunner extends AbstractTestNGCucumberTests{
	
	}