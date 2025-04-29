package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.UrunlerSayfasi;
import OnMuhasebe.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UrunlerStepdefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    UrunlerSayfasi urunler = new UrunlerSayfasi();
    Faker faker = new Faker();

    @Given("Kullanici uygulamayı acar")
    public void kullaniciUygulamayıAcar() {
    }

    @And("Menuye tıklar")
    public void menuyeTıklar() {
      wait.until(ExpectedConditions.elementToBeClickable(urunler.menuButonu)).click();
    }

    @Then("Stok menusune tıklar")
    public void stokMenusuneTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(urunler.stokMenusu)).click();
    }

    @And("Urunlere menusune tıklar")
    public void urunlereMenusuneTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(urunler.urunler)).click();
    }

    @And("Yeni urun ulustra tıklar")
    public void yeniUrunUlustraTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(urunler.urunEkleme)).click();
    }

    @Then("Urun bilgileri girilir")
    public void urunBilgileriGirilir() throws InterruptedException {

        urunler.urunAdi.click();
        urunler.urunAdi2.sendKeys("Test Urun"+faker.number().numberBetween(1,100));

        urunler.stokKodu.click();
        urunler.stokKodu.sendKeys("44");

        urunler.fiyatStok.click();

        wait.until(ExpectedConditions.elementToBeClickable(urunler.baslangicStokMiktar)).click();
        urunler.baslangicStokMiktar.sendKeys("150");

        wait.until(ExpectedConditions.elementToBeClickable(urunler.kiritikStokUyarisi)).click();
        urunler.kiritikStokUyarisi.sendKeys("30");

        Driver.driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(urunler.alisFiyati)).click();
        urunler.alisFiyati2.sendKeys("300");

        urunler.satisFiyati.click(); urunler.satisFiyati.sendKeys("550");
        Driver.driver.hideKeyboard();

        wait.until(ExpectedConditions.elementToBeClickable(urunler.kaydetButton)).click();
        Thread.sleep(2000);
    }
}













