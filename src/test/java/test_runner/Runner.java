package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", //the path of the feature files
		glue={"step_definations"}, //the path of the step definition files
		plugin= {"pretty","html:target/HTMLreports/report.html", "json:target/json_output/cucumber.json", "junit:target/junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true
				
		)
public class Runner {

}
