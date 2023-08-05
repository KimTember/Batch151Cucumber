Feature: US_001 Google Sayfasi Testi
  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider

@arc
  Scenario: TC01 Arama Kutusunda Volvo Aratilir

    And  kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac1" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac1"icerdigini test eder
    And sayfayi kapatir
  @arc
  Scenario: TC02 Arama Kutusunda Ford Aratilir
    And  kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac2" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2"icerdigini test eder
    And sayfayi kapatir
@arc
  Scenario: TC02 Arama Kutusunda Audi Aratilir
    And  kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac3" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac4"icerdigini test eder
    And sayfayi kapatir