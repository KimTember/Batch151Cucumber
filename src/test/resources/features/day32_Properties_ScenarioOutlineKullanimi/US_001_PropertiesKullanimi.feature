Feature: US_001 Google Sayfasi Testi
  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider

  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    And kullanici 2 saniye bekler
    And kullanici cerezleri kapatir
    And  kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac1" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac1"icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici 2 saniye bekler
    * kullanici cerezleri kapatir
    And  kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac2" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2"icerdigini test eder
    And sayfayi kapatir

#Daha önce yazdığınız steplerin methodlarını tekrar kullanmak istediğinizde And,Then ... yerine *(yıldız) kullanabilirsiniz



