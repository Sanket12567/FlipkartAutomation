package PageLib;

import LocatorClasses.BaseClass;
import LocatorClasses.FlipkartHomePageElements;
import MethodsClasses.CheckLinksOnHomePage;
import MethodsClasses.IphoneSearchOperation;
import org.openqa.selenium.WebDriver;

public class PageLibrary {
    private WebDriver driver;
    private FlipkartHomePageElements flipkartHomePageElements;
    private IphoneSearchOperation iphoneSearchOperation;
    private CheckLinksOnHomePage checkLinksOnHomePage;

    public PageLibrary(WebDriver driver){
        this.driver=driver;
        flipkartHomePageElements=new FlipkartHomePageElements(this.driver);
        iphoneSearchOperation=new IphoneSearchOperation(this.driver);
        checkLinksOnHomePage=new CheckLinksOnHomePage(driver);
    }

    public FlipkartHomePageElements getFlipkartHomePageElements() {
        return flipkartHomePageElements;
    }

    public IphoneSearchOperation getIphoneSearchOperation() {
        return iphoneSearchOperation;
    }

    public CheckLinksOnHomePage getCheckLinksOnHomePage() {
        return checkLinksOnHomePage;
    }
}
