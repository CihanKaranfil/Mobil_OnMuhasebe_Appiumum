package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.KasaSayfasi;
import OnMuhasebe.utilities.Driver;

import OnMuhasebe.utilities.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class KasaStepdefs extends ReusableMethods {

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
    public void kasaOlusturButonunaTiklar() throws InterruptedException {
        try {
            List<WebElement> buttons = Driver.getDriver().findElements(AppiumBy.className("android.widget.Button"));
            buttons.get(1).click();
        } catch (Exception e) {
            List<WebElement> buttons = Driver.getDriver().findElements(AppiumBy.className("android.widget.Button"));
            buttons.get(1).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(kasa.yeniKasa)).click();

    }

    @Then("Kasa bilgileri girer")
    public void kasaBilgileriGirer() {
        wait.until(ExpectedConditions.elementToBeClickable(kasa.kasaIsmi)).click();
        kasa.kasaIsmi.sendKeys("YENİ TEST KASASI MOBİL");
        wait.until(ExpectedConditions.elementToBeClickable(kasa.acilisBakiyesi)).click();
        kasa.acilisBakiyesi.sendKeys("1000");

        Driver.getDriver().hideKeyboard();
    }

    @And("Kasa kaydedilir")
    public void kasaKaydedilir() {
        wait.until(ExpectedConditions.elementToBeClickable(kasa.kaydetButonu)).click();

    }


    @Then("Olusan kasa silinir")
    public void olusanKasaSilinir() {
         scrollendpage();
         wait.until(ExpectedConditions.elementToBeClickable(kasa.kasaHesapList.getLast())).click();
         wait.until(ExpectedConditions.elementToBeClickable(kasa.silMenu)).click();
         wait.until(ExpectedConditions.elementToBeClickable(kasa.hesapSil)).click();

    }
}
