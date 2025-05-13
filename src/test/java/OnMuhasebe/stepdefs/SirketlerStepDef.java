package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.SirketlerSayfasi;
import OnMuhasebe.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SirketlerStepDef {
    SirketlerSayfasi sirketler = new SirketlerSayfasi();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Faker faker = new Faker();


    @Then("Ayarlar menusune tiklar")
    public void ayarlarMenusuneTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(sirketler.ayarlarMenu)).click();
    }

    @And("Sirketler menusune tiklar")
    public void sirketlerMenusuneTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(sirketler.sirketlerMenu)).click();
    }

    @Then("Yeni sirket olustur butonuna tiklar")
    public void yeniSirketOlusturButonunaTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(sirketler.artiButton)).click();
    }

    @And("Sirket bilgileri girer")
    public void sirketBilgileriGirer() {
        wait.until(ExpectedConditions.elementToBeClickable(sirketler.firmaUnvan)).click();
        sirketler.firmaUnvan.sendKeys("TEST SIRKETI" + faker.number().numberBetween(0, 100));

        wait.until(ExpectedConditions.elementToBeClickable(sirketler.email)).click();
        sirketler.email.sendKeys(faker.internet().emailAddress());

        wait.until(ExpectedConditions.elementToBeClickable(sirketler.vknTckn)).click();
        sirketler.vknTckn.sendKeys(faker.number().digits(10));
        wait.until(ExpectedConditions.elementToBeClickable(sirketler.vergiİletisimMenu)).click();
    }
}
