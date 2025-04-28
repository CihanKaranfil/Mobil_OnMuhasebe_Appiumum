@44
Feature: Urun Olusturma ve silme
  Scenario: Urun Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    Then Stok menusune tıklar
    And Urunlere menusune tıklar
    And Yeni urun ulustra tıklar
    Then Urun bilgileri girilir

