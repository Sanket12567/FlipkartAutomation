package LocatorClasses;

import PageLib.PageLibrary;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

public class BaseClass {
    WebDriver driver;
    private PageLibrary pageLibrary;
    @BeforeMethod
    public void DrivderSetup(){
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        pageLibrary=new PageLibrary(driver);
    }
    @AfterMethod
    public void CloseDriver(){
        driver.close();
    }

    public PageLibrary getPageLibrary() {
        return pageLibrary;
    }
    public void WaitCondition(WebElement Element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.elementToBeClickable(Element));
    }
    public void ScrollInToView(WebElement Element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("argument[0].scrollInToView()","Element");

    }
    public void WaitConditionforList(List<WebElement> Element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
        for (WebElement c:Element) {
            wait.until(ExpectedConditions.elementToBeClickable(c));
        }

    }
    
}
