package adidas_project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/purchase.feature",
        glue = "adidas_project/step_definitions",
        dryRun = false,
        plugin = {
                "pretty",
                "html:test-out"
        }
)
public class AdidasRunner {

}
