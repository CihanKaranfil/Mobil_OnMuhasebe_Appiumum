package OnMuhasebe.hooks;


import OnMuhasebe.utilities.ConfigReader;
import OnMuhasebe.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;


public class Hooks {
    @BeforeAll
    public static void beforeAll() {
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"),
                Integer.parseInt(ConfigReader.getProperty("localPort")));

    }

    @Before
    public void setUp() {
       // Driver.getDriver().activateApp("com.example.ebelge_app");

        Driver.getDriver().activateApp("com.example.on_muhasebe_mobil");
    }
   //@After
   //public void kapatma(){

   //}

  @After
  public void tearDown(Scenario scenario) {

      Driver.uygulamayiKapat();
      if(scenario.isFailed()){
          byte[] screenshotAs = Driver.getDriver().getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshotAs, "image/png", "Hata Resmi");
      }
      //Driver.getDriver().terminateApp("com.example.ebelge_app");
  }

  @AfterAll
  public static void afterAll() {
    // Driver.uygulamayiKapat();
     Driver.serverKapat();
    // raporuAc();
  }
}









