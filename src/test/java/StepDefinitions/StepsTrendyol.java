package StepDefinitions;

import Pages.TrendyolPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepsTrendyol {
    WebDriver driver = DriverFactory.getDriver();
    TrendyolPages trendyolPages = new TrendyolPages(driver);

    @Given("User is on HomePage")
    public void userIsOnHomePage() { trendyolPages.HomePage(); }

    @When("Click accept Cookies")
    public void clickAcceptCookies() throws InterruptedException { trendyolPages.acceptCookies(); }

    @When("Click the electronics categories")
    public void clickTheElectronicsCategories() throws InterruptedException { trendyolPages.clickCategories(); }

    @When("Click smart phones card")
    public void clickSmartPhonesCard() throws InterruptedException { trendyolPages.clickPhones(); }

    @When("Filter for apple")
    public void filterForApple() throws InterruptedException { trendyolPages.filterApple(); }

    @When("Filter today is on cargo")
    public void filterTodayIsOnCargo() throws InterruptedException { trendyolPages.filterCargo(); }

    @When("filter highest price")
    public void filterHighestPrice() throws InterruptedException { trendyolPages.filterPrice(); }

    @When("Click the fourth product")
    public void clickTheFourthProduct() throws InterruptedException { trendyolPages.clickProduct(); }

    @When("Click to gb storage")
    public void clickToGbStorage() throws InterruptedException { TrendyolPages.clickStorage(); }

    @When("Add to cart")
    public void addToCart() throws InterruptedException { trendyolPages.addCart(); }

    @When("Check at the cart page")
    public void checkAtTheCartPage() throws InterruptedException { trendyolPages.checkOrderPage(); }


}
