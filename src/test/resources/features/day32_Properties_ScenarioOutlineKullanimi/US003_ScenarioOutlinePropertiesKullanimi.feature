Feature: US003 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" ile propertiesden aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>"icerdigini test eder
    And sayfayi kapatir
    Examples:
      | aranacakAraclar |
      | arac1           |
      | arac2           |
      | arac3           |
      | arac4           |
      | arac5           |

      #Bu ornekte Scenario Outline yapisi il#https://editor.datatables.net adresine gidiniz
      ##Sayfadaki tabloda new butonuna basalım
      ##Çıkan pencerede verilen bilgileri girelim
      ##Create butonuna basalım
      ##Search bölümüne girdiğimiz firstname bilgisini girelim
      ##Başarılı bir şekilde giriş yapıldığını doğrulayalım
      ##Sayfayı kapatalıme verileri properties dosyasindan cektik