package org.hegroup.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"usage", //Chuẩn để xuất ra loại file theo format nào: pretty, usage,...
                            "html:target/cucumber-reports/TestCucumberReports.html",
                            "json:target/cucumber-reports/TestCucumberReports.json",
                            "junit:target/cucumber-reports/TestCucumberReports.xml"},
        features = "src/test/resources/features",
        glue = {"org.hegroup.steps"},
        monochrome = false
)
public class TestCucumberRunners {
}
