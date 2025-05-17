package MethodsClasses;

import LocatorClasses.BaseClass;
import LocatorClasses.FlipkartHomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphoneSearchOperation extends BaseClass {
    WebDriver driver;
    FlipkartHomePageElements homePageElements;
    public IphoneSearchOperation(WebDriver driver){
        this.driver=driver;
        homePageElements=new FlipkartHomePageElements(driver);
    }

    public void ClickOnMobilesMenu(){
        WaitCondition(homePageElements.MobilesMenu);
        homePageElements.MobilesMenu.click();
    }
    public void SearchForIphone(){
        WaitCondition(homePageElements.SearchBox);
        WaitCondition(homePageElements.SearchBtn);
        homePageElements.SearchBox.sendKeys("Iphone 16 pro max");
    }
    public boolean CheckImageDisplayed() {
        boolean imagedisplayed = false;

        for (WebElement x : homePageElements.IphoneImages) {
            WaitCondition(x);
            imagedisplayed=x.isDisplayed();
        }
        return  imagedisplayed;
    }
    public boolean CheckTiitlesDisplayed(){
    WaitConditionforList(homePageElements.IphoneTitles);
    boolean titleDisplayed=false;
    for (WebElement x:homePageElements.IphoneTitles){
        titleDisplayed=x.isDisplayed();
    }
    return titleDisplayed;

    }
    public boolean CheckPriceIsDisplayed(){
        WaitConditionforList(homePageElements.IphonePrice);
        boolean priceDisplayed=false;
        for (WebElement y:homePageElements.IphonePrice){
            priceDisplayed=y.isDisplayed();
        }
        return  priceDisplayed;
    }
}

