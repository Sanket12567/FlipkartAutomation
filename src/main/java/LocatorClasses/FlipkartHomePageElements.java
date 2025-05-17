package LocatorClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlipkartHomePageElements extends BaseClass {
    WebDriver driver;
    @FindBy(partialLinkText = "Mobiles")
    public WebElement MobilesMenu;
    @FindBy(css = "input.zDPmFV")
    public WebElement SearchBox;
    @FindBy(css = "button.MJG8Up")
    public WebElement SearchBtn;
    @FindBy(xpath = "//div[@class=\"DOjaWF gdgoEp\"]//img[@class=\"DByuf4\"]")
    public List<WebElement> IphoneImages;
    @FindBy(xpath = "//div[@class=\"DOjaWF gdgoEp\"]//div[@class=\"KzDlHZ\"]")
    public List<WebElement> IphoneTitles;
    @FindBy(xpath = "//div[@class=\"DOjaWF gdgoEp\"]//div[@class=\"Nx9bqj _4b5DiR\"]")
    public List<WebElement> IphonePrice;
    @FindBy(tagName = "img")
    public List<WebElement> SrcLinks;
    @FindBy(tagName = "source")
    public List<WebElement> SourceLinks;
    @FindBy(tagName = "a")
    public List<WebElement> ATagLinks;



    public FlipkartHomePageElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
