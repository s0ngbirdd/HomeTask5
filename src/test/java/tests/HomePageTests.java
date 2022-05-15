package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    private static final String SEARCH_BUTTON_TEXT1 = "Знайти";
    private static final String SEARCH_BUTTON_TEXT2 = "Найти";

    @Test
    public void checkSearchButtonLanguageChange() {
        getHomePage().waitForPageLoadComplete(60);
        getHomePage().waitForAjaxToComplete(60);
        getHomePage().changeLanguageUA();
        getHomePage().waitForPageLoadComplete(60);
        getHomePage().waitForAjaxToComplete(60);
        Assert.assertEquals(getHomePage().getSearchText(), SEARCH_BUTTON_TEXT1);
        getHomePage().changeLanguageRU();
        getHomePage().waitForPageLoadComplete(60);
        getHomePage().waitForAjaxToComplete(60);
        Assert.assertEquals(getHomePage().getSearchText(), SEARCH_BUTTON_TEXT2);
    }
}
