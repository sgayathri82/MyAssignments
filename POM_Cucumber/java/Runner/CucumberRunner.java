package Runner;

import Steps.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features",
                 glue="Steps",
                 monochrome=true,
                 publish=true
                 //tags="@Regression" //To execute smoke testcase alone//invalid credential
                 // tags="not @Regression"//To execute the testcases other than regression
                  //tags="@Smoke or @Regression or @Sanity"//To execute any  testcases
                 )
public class CucumberRunner extends BaseClass{

}