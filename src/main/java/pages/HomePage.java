package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@class='search-form__input ng-untouched ng-pristine ng-valid']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'UA')]")
    private WebElement languageButtonUA;

    @FindBy(xpath = "//a[contains(text(),'RU')]")
    private WebElement languageButtonRU;

    @FindBy(xpath = "//span[@class='counter counter--green ng-star-inserted']")
    private WebElement cartItemsCount;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText, Keys.ENTER);
    }


    public String getSearchText() {
        return searchButton.getText();
    }

    public void changeLanguageUA() {
        languageButtonUA.click();
    }

    public void changeLanguageRU() {
        languageButtonRU.click();
    }

    public String getCartItemsCount() {
        try
        {
            return cartItemsCount.getText().strip();
        } catch (NoSuchElementException e)
        {
            return "0";
        }
    }
}
