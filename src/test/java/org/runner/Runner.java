package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\feature\\Login.feature",glue = "org.stepdef",monochrome = true,publish = true,dryRun = false)
public class Runner {

}
