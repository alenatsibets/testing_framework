package com.stv.framework.core.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/stv/bdd/feature/individual_task",
        glue = "com/stv/bdd/step",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class IndividualFeatureRunner extends AbstractTestNGCucumberTests {
}
