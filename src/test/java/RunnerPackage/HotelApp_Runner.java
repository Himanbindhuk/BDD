package RunnerPackage;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinitions")

public class HotelApp_Runner {
	

}
