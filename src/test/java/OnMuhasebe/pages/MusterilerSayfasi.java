package OnMuhasebe.pages;


import OnMuhasebe.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MusterilerSayfasi {
    public MusterilerSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkeMenusu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Satışlar\"]")
    public WebElement satislarMenusu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Müşteriler\"]")
    public WebElement musterilerMenusu;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]")
    public WebElement musteriOlustur;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement firmaUnvanı;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement firmaKısaAdi;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    public WebElement telNo;

    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Seçiniz\"])[1]")
    public WebElement musteriKategorisi;

    @AndroidFindBy(xpath = "(//android.widget.Button)[2]")
    public WebElement kategoriSec;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Fatura Bilgileri\n" +
            "Sekme 2 / 2\"]")
    public WebElement faturaBilgileri;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    public WebElement email;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement adres;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    public WebElement postaKodu;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.Button[1]")
    public WebElement ilDdm;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Adana\"]")
    public WebElement ilSecim;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.Button[2]")
    public WebElement ilceDdm;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ALADAĞ\"]")
    public WebElement ilceSecim;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[4]")
    public WebElement vknTckn2;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    public WebElement vknTckn;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[3]")
    public WebElement vergiDairesi;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Kaydet\"]")
    public WebElement kaydetButton;

}
