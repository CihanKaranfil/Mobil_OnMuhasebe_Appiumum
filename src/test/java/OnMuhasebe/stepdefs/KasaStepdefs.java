package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.KasaSayfasi;
import OnMuhasebe.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KasaStepdefs {

    KasaSayfasi kasa = new KasaSayfasi();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @And("Nakit menusune tiklar")
    public void nakitMenusuneTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(kasa.nakitMenu)).click();
    }

    @Then("Kasa ve bankalar menusune tiklar")
    public void kasaVeBankalarMenusuneTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(kasa.kasaBankaMenu)).click();
    }

    @And("Kasa olustur butonuna tiklar")
    public void kasaOlusturButonunaTiklar() {
        wait.until(ExpectedConditions.elementToBeClickable(kasa.artiButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(kasa.yeniKasa)).click();
    }

    @Then("Kasa bilgileri girer")
    public void kasaBilgileriGirer() {
    }

    @And("Kasa kaydedilir")
    public void kasaKaydedilir() {
    }
}
