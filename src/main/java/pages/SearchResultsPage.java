package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//button[@aria-label='Купить']")
    private List<WebElement> addToCartIcons;


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public List<WebElement> getAddToCartIcons() {
        return addToCartIcons;
    }
}
