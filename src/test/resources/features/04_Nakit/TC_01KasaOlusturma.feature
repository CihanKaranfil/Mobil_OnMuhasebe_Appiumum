@ortagtag
Feature: Kasa Olusturma ve silme
  Scenario: Kasa Olusturur ve siler
    Given Kullanici uygulamayı acar
    When Kullanici eposta ve sifre girer
    Then  Giris butonuna tıklar
    And  Menuye tıklar
    And Nakit menusune tiklar
    Then Kasa ve bankalar menusune tiklar
    And Kasa olustur butonuna tiklar
    Then Kasa bilgileri girer
    And Kasa kaydedilir
    Then Olusan kasa silinir