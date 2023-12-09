package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {

    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//iframe)[1]")
    public WebElement iframe1Tag;

    @FindBy(xpath = "(//*[@class='external-icon'])[1]")
    public WebElement youtubeResmi;

    @FindBy(name = "search_query")
    public WebElement aramaKutusu;
}
