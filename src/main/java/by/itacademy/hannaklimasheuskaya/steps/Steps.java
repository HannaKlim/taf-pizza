package by.itacademy.hannaklimasheuskaya.steps;

import by.itacademy.hannaklimasheuskaya.page.PizzaMarketPage;
import org.openqa.selenium.WebDriver;

public class Steps {
    WebDriver driver;

    public Steps(WebDriver driver) {
        this.driver = driver;
    }

    public Steps addPizzaFourSeasonsToBasketAtWorkingHours() {
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        pizzaMarketPage
                .clickPizzaSectionLocator()
                .clickSelectPizzaFourSeasonsButton()
                .clickPizzaDeliveryLocator()
                .clickPizzaDeliveryConfirmationLocator()
                .clickSelectPizzaFourSeasonsButton()
                .clickSelectPizzaSizeLocator()
                .clickAddPizzaToBasketButton();
        return this;
    }
    public Steps addPizzaFourSeasonsToBasketAtNonWorkingHours() {
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        pizzaMarketPage
                .clickPizzaSectionLocator()
                .clickSelectPizzaFourSeasonsButton()
                .clickAtNightButton()
                .clickSelectPizzaFourSeasonsButton()
                .clickSelectPizzaSizeLocator()
                .clickAddPizzaToBasketButton();
        return this;
    }
    public String checkPizzaForSeasonsInBasket() {
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        return pizzaMarketPage.clickBasketPageButton().getNameOfPizzaInBasket();
    }
}
