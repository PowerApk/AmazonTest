package com.amazon.certification.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		monochrome = true,
		features="src/test/resources/features/amazon_add_to_car.feature",
		glue="com.amazon.certification.stepdef",
		snippets = SnippetType.CAMELCASE,
		tags = {"@Amazon"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"}
		)

public class AmazonAddToCarRunner {

}
