package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@erol",
        dryRun = false//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz

)
/*
@CucumberOptions() notasyonuna parametre olarak
        features-->features package'ının yolunu belirtiriz(Content Root)
        glue-->stepdefinition package(source root)
        tags-->çalıştırmak istediğimiz scenarioları bu parametrede belirtiriz

@CucumberOptions() notasyonu scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı
seçenekleri bu notasyonda belirtiriz
 */


public class Runner {
}