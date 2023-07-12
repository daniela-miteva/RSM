import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.*;
import org.junit.Assert;
public class TestSuiteAddToBasket extends CommonPageClass {


    @Test
    public void verifyBaseURLTC01() {

        openURL(baseURL);
        Assert.assertEquals(driver.getCurrentUrl(), baseURL);
        Assert.assertEquals(driver.getTitle(), baseURLTitle);

        //search by book
        searchByPhrase(searchPhrase);

        //verify title of first result
        WebElement title = driver.findElement(By.cssSelector(firstResultTitle));
        Assert.assertEquals(title.getText(), titleBook);

        //verify price of first result
        WebElement price = driver.findElement(By.cssSelector(firstResultPrice));
        Assert.assertTrue(price.isDisplayed());

        //verify paperback of first result
        WebElement paperback = driver.findElement(By.linkText("Paperback"));
        Assert.assertTrue(paperback.isDisplayed());

        //click on paperback link
        driver.findElement(By.linkText("Paperback")).click();

        //select checkbox for gift
        driver.findElement(By.id(giftCheckbox)).click();

        //add item to basket
        driver.findElement(By.id(addToBasketBtn)).click();

        //go to basket
        driver.findElement(By.linkText(goToBasketBtn)).click();

        //verify gift checkbox is selected
        WebElement isChecked = driver.findElement(By.cssSelector(giftCheckboxInBasket));

        //verify title in basket has the same title as selected above
        WebElement titleInBasket = driver.findElement(By.cssSelector(titleInBasketSelector));
        Assert.assertEquals(titleInBasket.getText(), titleBookInBasket);

        //verify quantity
        WebElement count = driver.findElement(By.cssSelector(countInBasketSelector));
        Assert.assertEquals(count.getText(), "1");

        //verify paperback is present
        WebElement paperInBasket = driver.findElement(By.cssSelector(paperbackInBasketSelector));
        Assert.assertTrue(paperInBasket.isDisplayed());

        //verify price in basket has the same value as selected above
        WebElement priceInBasket = driver.findElement(By.cssSelector(priceInBasketSelector));
        Assert.assertEquals(price.getText(), "£" + price +".00");

        //verify author
        WebElement author = driver.findElement(By.cssSelector(authorInBasketSelector));
        Assert.assertTrue(author.isDisplayed());
    }


}
