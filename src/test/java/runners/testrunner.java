package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue = "seleniumgluecode",
tags = "@Smoke",
dryRun = false,
monochrome = true,
plugin = { "pretty", "html:target/htmlreports.html" }
)
public class testrunner {

}
