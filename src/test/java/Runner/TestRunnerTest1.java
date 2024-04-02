package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/test1.feature",
		glue="stepDefinations/stepDefination",monochrome=true
		)
public class TestRunnerTest1 extends AbstractTestNGCucumberTests{


}
