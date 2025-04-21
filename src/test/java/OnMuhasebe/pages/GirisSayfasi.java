package OnMuhasebe.pages;


import OnMuhasebe.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GirisSayfasi {
    public GirisSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkeMenusu;



    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Giriş Yap\"]")
    public WebElement girisYapButonu;




}
