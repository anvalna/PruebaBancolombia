import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features"
        , glue = {"com/bancolombia/test/stepsDefinition"}
        , plugin = {"pretty", "html:target/cucumber", "json:target/cucumberWebCredinetPersonas.json","com.cucumber.listener.ExtentCucumberFormatter:"}
        , tags = {"@Prueba"}
)

public class VirtualInvestmentTestRunner {
}
