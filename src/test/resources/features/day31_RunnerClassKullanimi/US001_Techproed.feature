
Feature: US001 TechproEducation Arama Testi
 @g
 Scenario: TC01 Arama Kutusunda Bolum Aratma
    Given kullanici techproEducation sayfasina gider
    Then arama kutusunda qa aratir
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Bolum Aratma
    Given kullanici techproEducation sayfasina gider
    Then arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Arama Kutusunda Bolum Aratma
    Given kullanici techproEducation sayfasina gider
    Then arama kutusunda java aratir
    But cikan dropdown menuden free java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir