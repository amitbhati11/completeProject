package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
 @CucumberOptions(features="src/test/resources",glue= {"Stepdefination"},
 plugin= {"pretty","json:JSON/target/jsonreport.json","html:HTML/target/htmlreport.html","junit:JUNIT/target/junitreport.xml"},
 
tags="@Smoke or @Sanity or @Regression"		 )
public class Runnercucumber {

}
