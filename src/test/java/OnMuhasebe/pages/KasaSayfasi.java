package OnMuhasebe.pages;


import OnMuhasebe.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class KasaSayfasi {
    public KasaSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Nakit\"]")
    public WebElement nakitMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kasa ve Bankalar\"]")
    public WebElement kasaBankaMenu;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
    public WebElement artiButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]")
    public WebElement yeniKasa;


}
