@ortagtag1
Feature: Banka Olusturma ve silme
  Scenario: Banka Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    And Nakit menusune tiklar
    Then Kasa ve bankalar menusune tiklar
    And Banka olustur butonuna tiklar
    Then Banka bilgileri girer
    And Banka kaydedilir
    Then Olusan Banka silinir


    # eksikler var