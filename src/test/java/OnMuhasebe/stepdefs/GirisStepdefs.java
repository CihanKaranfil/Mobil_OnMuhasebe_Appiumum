package OnMuhasebe.stepdefs;

import OnMuhasebe.pages.GirisSayfasi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GirisStepdefs {
    GirisSayfasi girisSayfasi = new GirisSayfasi();

    @Given("Kullanici eposta ve sifre girer")
    public void kullaniciEpostaVeSifreGirer() {


    }

    @Then("Giris butonuna tıklar")
    public void girisButonunaTıklar() {
        girisSayfasi.girisYapButonu.click();
    }
}
