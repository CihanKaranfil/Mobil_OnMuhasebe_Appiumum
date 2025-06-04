package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.BankaSayfasi;
import OnMuhasebe.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BankaStepdefs {

    BankaSayfasi bankasayfasi = new BankaSayfasi();
    @And("Banka olustur butonuna tiklar")
    public void bankaOlusturButonunaTiklar() throws InterruptedException {
        try {
            List<WebElement> buttons = Driver.getDriver().findElements(AppiumBy.className("android.widget.Button"));
            buttons.get(0).click();
        } catch (Exception e) {
            List<WebElement> buttons = Driver.getDriver().findElements(AppiumBy.className("android.widget.Button"));
            buttons.get(1).click();

            Thread.sleep(1000);

            bankasayfasi.yeniBankaButonu.click();
            Thread.sleep(5000);

        }
    }

    @Then("Banka bilgileri girer")
    public void bankaBilgileriGirer() {
    }

    @And("Banka kaydedilir")
    public void bankaKaydedilir() {
    }

    @Then("Olusan Banka silinir")
    public void olusanBankaSilinir() {
    }
}
