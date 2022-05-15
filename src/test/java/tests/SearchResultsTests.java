package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "Samsung";
    private int productCount = 0;

    @Test
    public void checkCartItemsAmount() {
        getHomePage().waitForPageLoadComplete(60);
        getHomePage().waitForAjaxToComplete(60);
        getHomePage().enterTextToSearchField(SEARCH_KEYWORD);
        getHomePage().waitForPageLoadComplete(60);
        getHomePage().waitForAjaxToComplete(60);
        for (WebElement webElement : getSearchResultsPage().getAddToCartIcons()) {
            getSearchResultsPage().waitVisibilityOfElement(60, webElement);
            webElement.click();
            productCount++;
        }
        Assert.assertEquals(getHomePage().getCartItemsCount(), String.valueOf(productCount));
    }
}
