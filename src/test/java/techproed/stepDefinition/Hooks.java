package techproed.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

public class Hooks {
    /*
    Hooks classinin kullanim amaci scenariolardan önce veya sonra calismasini
    istedigimiz kodlari belirttigimiz class tir.Bunu @Before ve @After notasyonlarina dahil
    methodlar ile yapariz.
    Bu notasyonlarin importu io.cucumber dan olmalidir.
    Bu classin scenariolar tarafindan gorulup burdaki @Before, @After methodlarini
    isleme alabilmesi icin Hooks classini farkli bir package da olusturmak istersek
    Runner classindaki glue parametresine bu package i tanimlamamiz gerekir.Ancak
    Hooks classini direk stepDefinition package i altinda olusturursak Runner classindaki
    glue parametresinde stepDefinition packagei tanimli oldugu icin baska bir
    islem yapmama gerek kalmaz.
    Glue parametresinde stepDefinition packagei tanimli oldugu icin direk Hooks classini da
    kullanabiliriz.

     */
    @Before//import io.cucumber.java.Before;
    public void setUp() throws Exception {

        System.out.println("Scenariolar çalışmaya başladı");


    }

    @Before("@arac2")
    public void setUp2(){

        System.out.println("google da ford aratildi");

    }
    @Before("@arac3")
    public void setUp3(){

        System.out.println("google da audi aratildi");

    }

        @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {//-->Scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
        }
        Driver.closeDriver();

    }
/*
    Scenario'dan once calismasini istedigimiz @Before method'unun notasyonuna parametre olarak scenario'ya tanimladigimiz
    tag'i belirte biliriz. Dolayisiyla sadece paremetre olarak belirttigimiz @Before methodu Scenario'dan once calisaktir

 */

    }//Bu method fail olan scenario'larda fail olan kısmın resmini rapora ekleyecektir.
