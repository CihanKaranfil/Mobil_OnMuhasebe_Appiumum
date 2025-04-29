@44
Feature: Urun Olusturma ve silme
  Scenario: Urun Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    Then Satıslar menusune tıklar
    And Musteriler menusune tıklar
    Then Musteri olustura tıklar
    And Musteri bilgileri girilir
    Then Musteri kaydet butonuna tıklar