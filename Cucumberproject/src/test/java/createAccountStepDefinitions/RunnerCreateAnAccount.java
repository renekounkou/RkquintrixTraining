package createAccountStepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/CreateanccountFeatures", glue= {"createAccountStepDefinitions"})
public class RunnerCreateAnAccount {
}
