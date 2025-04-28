package OnMuhasebe.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:raporlar/CucumberRapor.html",
        features = "src/test/resources/features",
        glue = {"OnMuhasebe/stepdefs", "OnMuhasebe/hooks"},
        tags = "@44",
        dryRun = false,
        monochrome = true
)
public class Runner {


}


