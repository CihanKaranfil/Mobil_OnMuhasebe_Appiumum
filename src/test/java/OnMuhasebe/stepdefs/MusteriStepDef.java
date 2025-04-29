package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.MusterilerSayfasi;
import OnMuhasebe.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MusteriStepDef {
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

    @And("Musteri bilgileri girilir")
    public void musteriBilgileriGirilir() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.firmaUnvanı)).click();
        musteriler.firmaUnvanı.sendKeys("TEST MÜŞTERİSİ"+ faker.number().numberBetween(0,100) );
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.firmaKısaAdi)).click();
        musteriler.firmaKısaAdi.sendKeys("TST"+ faker.number().numberBetween(0,100) );
        wait.until(ExpectedConditions.elementToBeClickable(musteriler.telNo)).click();
        musteriler.telNo.sendKeys(faker.phoneNumber().phoneNumber());
        Thread.sleep(3000);
    }

    @Then("Musteri kaydet butonuna tıklar")
    public void musteriKaydetButonunaTıklar() {
    }
}
