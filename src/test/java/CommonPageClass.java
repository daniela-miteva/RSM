/* The purpose of this common class is to describe common selectors and functions */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonPageClass {

    ChromeDriver driver = new ChromeDriver();

    String baseURL = "https://www.amazon.co.uk/";
    String acceptCookies = "sp-cc-accept";
    String baseURLTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
    String searchInputField = "field-keywords";
    String searchPhrase = "\"Harry Potter and the Cursed Child\", 1 & 2";
    String firstResultPrice = ".a-price-whole";
    String titleBook = "Harry Potter and the Cursed Child - Parts One and Two: The Official Playscript of the Original West End Production";
    String firstResultPaperBack = "Paperback";
    String firstResultTitle = ".a-size-mini a";
    String addToBasketBtn = "add-to-cart-button";
    String giftCheckbox = "gift-wrap";
    String goToBasketBtn = "Go to basket";
    String titleInBasketSelector = ".sc-item-content-group ul li a";
    String giftCheckboxInBasket = "input:checked[type='checkbox']";
    String priceInBasketSelector = ".sc-item-content-group ul div div";
    String countInBasketSelector = ".a-dropdown-prompt";
    String paperbackInBasketSelector = ".sc-item-content-group ul li::nth-of-type(2)";
    String authorInBasketSelector = ".a-size-base.sc-product-creator";
    String titleBookInBasket = "Harry Potter and the Cursed Child - Parts One and Two: The Official Pl…";

    public void openURL(String url){

        driver.get(url);
        driver.findElement(By.id(acceptCookies)).click();
    }

    public void searchByPhrase(String searchPhrase){
        WebElement searchField = driver.findElement(By.name(searchInputField));
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }

}
