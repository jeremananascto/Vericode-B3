package io.cucumber.desafio;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "not @ignore", plugin = {"pretty"})

public class RunCucumberTest {
}
