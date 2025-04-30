@44
Feature: Musteri Olusturma ve silme
  Scenario: Musteri Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    Then Satıslar menusune tıklar
    And Musteriler menusune tıklar
    Then Musteri olustura tıklar
    And Musteri firma bilgileri girilir
    Then  Musteri Fatura bilgileri girilir
    Then Musteri kaydet butonuna tıklar