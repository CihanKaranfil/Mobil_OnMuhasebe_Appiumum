package OnMuhasebe.pages;


import OnMuhasebe.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UrunlerSayfasi {
    public UrunlerSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkeMenusu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Menü\"]")
    public WebElement menuButonu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Stok\"]")
    public WebElement stokMenusu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Ürünler\"]")
    public WebElement urunler;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]")
    public WebElement urunEkleme;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    public WebElement urunAdi;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement stokKodu;


}
