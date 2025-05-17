package MethodsClasses;

import LocatorClasses.BaseClass;
import LocatorClasses.FlipkartHomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckLinksOnHomePage extends BaseClass {
    WebDriver driver;
    FlipkartHomePageElements homePageElements;

    public CheckLinksOnHomePage(WebDriver driver){
        this.driver=driver;
        homePageElements=new FlipkartHomePageElements(driver);
    }
    public List<String> allLinksOnHomePage(){
        List<String> Link=new ArrayList<>();
       for (WebElement x:homePageElements.ATagLinks){
           Link.add(x.getAttribute("href"));
       }
       for (WebElement x:homePageElements.SrcLinks){
           Link.add(x.getAttribute("src"));
       }
       for (WebElement y:homePageElements.SourceLinks){
           Link.add(y.getAttribute("srcset"));
       }
       return Link;
    }
}
