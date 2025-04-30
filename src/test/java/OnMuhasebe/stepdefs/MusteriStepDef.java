package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.MusterilerSayfasi;
import OnMuhasebe.utilities.Driver;
import OnMuhasebe.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MusteriStepDef  extends ReusableMethods {
    MusterilerSayfasi musteriler = new MusterilerSayfasi();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Faker faker = new Faker();

    @Then("Satıslar menusune tıklar")
    public void satıslarMenusuneTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.satislarMenusu)).click();
    }

    @And("Musteriler menusune tıklar")
    public void musterilerMenusuneTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.musterilerMenusu)).click();
    }

    @Then("Musteri olustura tıklar")
    public void musteriOlusturaTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.musteriOlustur)).click();
    }

    @And("Musteri firma bilgileri girilir")
    public void musteriFirmaBilgileriGirilir() {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.firmaUnvanı)).click();
        musteriler.firmaUnvanı.sendKeys("TEST MÜŞTERİSİ"+ faker.number().numberBetween(0,100) );
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.firmaKısaAdi)).click();
        musteriler.firmaKısaAdi.sendKeys("TST"+ faker.number().numberBetween(0,100) );
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.telNo)).click();
        musteriler.telNo.sendKeys(faker.phoneNumber().phoneNumber());

        wait.until(ExpectedConditions.elementToBeClickable(musteriler.musteriKategorisi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.kategoriSec)).click();
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.faturaBilgileri)).click();
    }

    @Then("Musteri Fatura bilgileri girilir")
    public void musteriFaturaBilgileriGirilir() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.email)).click();
        musteriler.email.sendKeys(faker.internet().emailAddress());
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.adres)).click();
        musteriler.adres.sendKeys(faker.address().fullAddress());
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.postaKodu)).click();
        musteriler.postaKodu.sendKeys(faker.address().zipCode());

        wait.until(ExpectedConditions.elementToBeClickable(musteriler.ilDdm)).click();
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.ilSecim)).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.ilceDdm)).click();
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.ilceSecim)).click();


      // scrollGesture(Driver.getDriver(), musteriler.vknTckn, "down", 3, 500);


      // wait.until(ExpectedConditions.elementToBeClickable(musteriler.vknTckn)).click();
      // musteriler.vknTckn.sendKeys(faker.number().digits(11));
      // Driver.getDriver().hideKeyboard();
      // wait.until(ExpectedConditions.elementToBeClickable(musteriler.vergiDairesi)).click();

      // musteriler.vergiDairesi.sendKeys("MALATYA");



    }


    @Then("Musteri kaydet butonuna tıklar")
    public void musteriKaydetButonunaTıklar() {

    }


}
