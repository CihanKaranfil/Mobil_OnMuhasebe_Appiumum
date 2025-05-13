@sirket
Feature: Kasa Olusturma ve silme
  Scenario: Kasa Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    Then Ayarlar menusune tiklar
    And Sirketler menusune tiklar
    Then Yeni sirket olustur butonuna tiklar
    And Sirket bilgileri girer



