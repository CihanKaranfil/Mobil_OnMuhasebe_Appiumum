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

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement urunAdi2;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Fiyat & Stok\n" +
            "Sekme 2 / 2\"]")
    public WebElement fiyatStok;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Depo 1\n" +
            "Stok Deposu\n" +
            "Başlangıç Stok Miktarı\n" +
            "Kritik Stok Uyarısı\"]/android.widget.EditText[1]")
    public WebElement baslangicStokMiktar;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Depo 1\n" +
            "Stok Deposu\n" +
            "Başlangıç Stok Miktarı\n" +
            "Kritik Stok Uyarısı\"]/android.widget.EditText[2]")
    public WebElement kiritikStokUyarisi;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    public WebElement alisFiyati;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement alisFiyati2;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement satisFiyati;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Kaydet\"]")
    public WebElement kaydetButton;

}
