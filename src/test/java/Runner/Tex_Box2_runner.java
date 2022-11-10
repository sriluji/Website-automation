package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith (Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\hr\\Desktop\\SreelathaNewEclipse\\Test2\\src\\test\\resources\\Test2_Box.feature"},
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:target/HtmlReports"},
		monochrome= true
		)
			

public class Tex_Box2_runner {
	
		


}
