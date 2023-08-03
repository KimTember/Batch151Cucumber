package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//a)[1]")
    public WebElement loginButonu;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement emailBox;


}
