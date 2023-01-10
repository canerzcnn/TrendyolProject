package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class TrendyolPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    //eleman tanımlama İncele kısmı aracılığıyla
    static By accept = By.id("onetrust-accept-btn-handler");
    static By categories = By.xpath("//a[@href=\"/butik/liste/5/elektronik\"]");
    static By phones = By.xpath("//a[3]//img[1]");
    static By emptyArea = By.xpath("//div[@class=\"overlay\"]");
    static By appleFilter = By.xpath("//div[contains(text(),'Apple')]");
    static By cargoFilter = By.xpath("//a[@class='apply-filter-button']");
    static By priority = By.xpath("//div[@class='sort-fltr-cntnr']//select");
    static By priceHighest = By.xpath("//option[@value=\"PRICE_BY_DESC\"]");
    static By product = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[2]/div[2]");
    static By storage = By.xpath("//a[@href=\"/apple/iphone-14-pro-128gb-derin-mor-p-355707176\"]");
    static By addCart = By.xpath("//div[@class='add-to-basket-button-text']");
    static By orderPage = By.xpath("//p[normalize-space()='Sepetim']");




    public TrendyolPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() { }
    public static void acceptCookies() throws InterruptedException {
        elementHelper.click(accept);
        Thread.sleep(2000);
    }
    public static void clickCategories() throws InterruptedException {
        elementHelper.click(categories);
        Thread.sleep(2000);
    }
    public static void clickPhones() throws InterruptedException {
        elementHelper.click(phones);
        Thread.sleep(2000);
        elementHelper.click(emptyArea);
    }
    public static void filterApple() throws InterruptedException {
        elementHelper.click(appleFilter);
        Thread.sleep(3000);
    }
    public static void filterCargo() throws InterruptedException {
        elementHelper.click(cargoFilter);
        Thread.sleep(6000);
    }
    public static void filterPrice() throws InterruptedException {
        elementHelper.click(priority);
        Thread.sleep(3000);
        elementHelper.click(priceHighest);
        Thread.sleep(3000);
    }
    public static void clickProduct() throws InterruptedException {
        elementHelper.click(product);
        //driver.getCurrentUrl();
        //driver.getWindowHandles();
        String Parent_id = driver.getWindowHandle();
        driver.switchTo().window(Parent_id);
        Thread.sleep(2000);
    }
    public static void clickStorage() throws InterruptedException {
        driver.getWindowHandles();
        elementHelper.click(storage);
        Thread.sleep(4000);
    }
    public static void addCart() throws InterruptedException {
        elementHelper.click(addCart);
        Thread.sleep(4000);
    }
    public static void checkOrderPage() throws InterruptedException {
        elementHelper.click(orderPage);
        Thread.sleep(4000);
    }

}
