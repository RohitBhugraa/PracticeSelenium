package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}, // optional
     //   features = "src/test/resources/features/Login&SignIn.feature",
        features = "src/test/resources/features",
        tags = "@Login", 
        glue = "stepdefinitions"
)

public class LoginRegisterRunner {

}
