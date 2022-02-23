package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import excel.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature", glue="facebook", dryRun=false, plugin="json:src\\test\\resources\\Report\\facebook.json")
public class TestRunner {
	@AfterClass
	public static void after() {
		JVMReport.generateJvmReport("C:\\Users\\Harish\\Documents\\framework - workspace\\FaceBook\\src\\test\\resources\\Report\\facebook.json");
	}

}
