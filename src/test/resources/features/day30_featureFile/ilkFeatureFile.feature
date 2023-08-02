Feature:US001 Amazon sayfası testi
  Scenario: TC01 Arama kutusunda ürün aratma
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda ürün aratma
      Given kullanici amazon sayfasina gider
      Then kullanici arama kutusunda samsung aratir
      And sayfayi kapatir


