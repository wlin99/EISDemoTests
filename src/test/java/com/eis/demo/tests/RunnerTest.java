package com.eis.demo.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
glue = "com.eis.demo.tests",
features = "src/test/resource",
format = { "pretty", "html:reports/html/", "json:reports/json/results.json" },
dryRun = false,
monochrome =true,
tags  = {"@Demo2"}
//tags = {"~@Ignore"}
//tags  = {"@Demo1")
)

public class RunnerTest {

}
