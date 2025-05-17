package TestCaseClasses;

import LocatorClasses.BaseClass;
import PageLib.PageLibrary;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchOperation extends BaseClass{

    @Test
    public void SearchIphone(){
    getPageLibrary().getIphoneSearchOperation().ClickOnMobilesMenu();
    getPageLibrary().getIphoneSearchOperation().SearchForIphone();
    getPageLibrary().getIphoneSearchOperation().CheckPriceIsDisplayed();
    getPageLibrary().getIphoneSearchOperation().CheckImageDisplayed();
    getPageLibrary().getIphoneSearchOperation().CheckTiitlesDisplayed();
    }

    @Test
    public void TinksOnHomePage(){
       getPageLibrary().getCheckLinksOnHomePage().allLinksOnHomePage();
       System.out.println(getPageLibrary().getCheckLinksOnHomePage().allLinksOnHomePage().size());
       System.out.println(getPageLibrary().getCheckLinksOnHomePage().allLinksOnHomePage());
    }
}
