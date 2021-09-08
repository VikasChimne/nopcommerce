package com.nopcommerce.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "classpath:features",
		glue = "com.nopcommerce.stepdef", 
		tags = "",
		plugin = {"pretty", 
			      "html:target/html/htmlreport.html",
			      "json:target/json/file.json",
			     },
		monochrome = true,
dryRun = false

		
		)
public class testRunner {

}
