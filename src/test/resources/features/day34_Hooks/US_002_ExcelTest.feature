Feature: US002 BlueRental Excel Login
  Scenario: Pozitif login testi
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    And kullanici login butonuna tiklar
    And exceldeki "customer_info" sayfasindaki bilgiler ile giris yapildigini test eder
