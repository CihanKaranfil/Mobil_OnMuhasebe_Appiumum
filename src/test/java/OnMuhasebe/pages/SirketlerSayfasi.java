package OnMuhasebe.pages;


import OnMuhasebe.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SirketlerSayfasi {
    public SirketlerSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Ayarlar\"]")
    public WebElement ayarlarMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Şirketler\"]")
    public WebElement sirketlerMenu;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]")
    public WebElement artiButton;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement firmaUnvan;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement email;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    public WebElement vknTckn;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Vergi ve İletişim Bilgileri\n" +
            "Sekme 2 / 2\"]")
    public WebElement vergiİletisimMenu;

}
