Feature: US003 BlueRentalCar Login Islemi

  Scenario: TC01BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici login butonuna tiklar
    But kullanici 2 saniye bekler
    And kullanici tabloda verilen bilgileri kullanarak map ile login olur
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi kapatir
