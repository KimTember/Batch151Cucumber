package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(plugin={"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},//rerun ile berlittigimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@negatif",
        dryRun = false,//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki çıktılar tek renk olur.

)
/*
@CucumberOptions() notasyonuna parametre olarak
        features-->features package'ının yolunu belirtiriz(Content Root)
        glue-->stepdefinition package(source root)
        tags-->çalıştırmak istediğimiz scenarioları bu parametrede belirtiriz

@CucumberOptions() notasyonu scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı
seçenekleri bu notasyonda belirtiriz

 @CucumberOptions() notasyonu içerisine plugin parametresi ile yukarıdaki gibi almak istediğimiz rapor çeşidini
seçip ekliyoruz.
@CucumberOptions() notasy_nu icerisinde plugin parametresi ile yukaridaki gibi almak istedigimiz
rapor cesidini secip ekliyoruz.

pretty-->konsolda calistirdigimiz scenario ile ilgili ayrintili bilgi verir.
 */


public class Runner2 {

}
