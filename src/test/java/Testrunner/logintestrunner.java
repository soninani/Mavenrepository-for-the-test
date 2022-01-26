package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@io.cucumber.testng.CucumberOptions(features="featurefiles",glue="Stepdefinitions",dryRun=true)
//@RunWith(Cucumber.class)
//@cucumber.api.CucumberOptions(features="featurefiles",glue="Stepdefinitions",dryRun=true)

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles",glue="Stepdefinitions",dryRun=true)
public class logintestrunner {
	
	

}
