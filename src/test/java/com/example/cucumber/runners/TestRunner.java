package com.example.cucumber.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.cucumber.stepdefinitions", "com.example.cucumber.hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        tags= "@smoketest",
        dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
