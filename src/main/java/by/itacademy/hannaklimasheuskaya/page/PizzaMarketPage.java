package by.itacademy.hannaklimasheuskaya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PizzaMarketPage {
    public final String URL = "https://pizzamarket.by/";
    public final String RESULT_NAME_OF_PIZZA_IN_BASKET = "4 сезона";
    private final By xPathAtNightButton = By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/button");
    private final By xPathPizzaSectionLocator = By.xpath("//*[@id=\"app\"]/div/section/div[1]/div/div/a[1]/h3");
    private final By xPathPizzaDeliveryLocator = By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div[1]/div[2]/label/div");
    private final By xPathPizzaDeliveryConfirmationLocator = By.xpath("//div[@class=\"vm--modal\"]/button[2]");
    private final By xPathSelectPizzaFourSeasonsButton = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div/div[3]/div/div[2]/div[2]/div/button");
    private final By xPathSelectPizzaSizeLocator = By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div[3]/label/div");
    private final By xPathAddPizzaToBasketButton = By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div/div[2]/div[2]/button");
    private final By xPathBasketPageButton = By.xpath("//*[@id=\"app\"]/div/header/div/div/div[5]/a");
    private final By xPathNameOfPizzaInBasketLocator = By.xpath("//*[@id=\"app\"]/div/main/div/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/h3");
    WebDriver driver;

    public PizzaMarketPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findAtNightButton() {
        By xPathAtNightButton = By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/button");
       try {
           WebElement webElement = driver.findElement(xPathAtNightButton);
           return webElement;
       } catch (Exception ignored) {}
return null;
    }

    public PizzaMarketPage clickAtNightButton() {
        driver.findElement(xPathAtNightButton).click();
        return this;
    }

    public void openPizzaMarketPage() {
        driver.navigate().to(URL);
    }

    public PizzaMarketPage clickPizzaSectionLocator() {
        driver.findElement(xPathPizzaSectionLocator).click();
        return this;
    }

    public PizzaMarketPage clickSelectPizzaFourSeasonsButton() {
        driver.findElement(xPathSelectPizzaFourSeasonsButton).click();
        return this;
    }

    public PizzaMarketPage clickPizzaDeliveryLocator() {
        driver.findElement(xPathPizzaDeliveryLocator).click();
        return this;
    }

    public PizzaMarketPage clickPizzaDeliveryConfirmationLocator() {
        driver.findElement(xPathPizzaDeliveryConfirmationLocator).click();
        return this;
    }

    public PizzaMarketPage clickSelectPizzaSizeLocator() {
        driver.findElement(xPathSelectPizzaSizeLocator).click();
        return this;
    }

    public PizzaMarketPage clickAddPizzaToBasketButton() {
        driver.findElement(xPathAddPizzaToBasketButton).click();
        return this;
    }

    public PizzaMarketPage clickBasketPageButton() {
        driver.findElement(xPathBasketPageButton).click();
        return this;
    }

    public String getNameOfPizzaInBasket() {
        WebElement webElementGetNameOfPizzaInBasket = driver.findElement(xPathNameOfPizzaInBasketLocator);
        return webElementGetNameOfPizzaInBasket.getText();
    }
}
