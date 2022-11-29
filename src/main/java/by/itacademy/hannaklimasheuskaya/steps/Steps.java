package by.itacademy.hannaklimasheuskaya.steps;

import by.itacademy.hannaklimasheuskaya.page.PizzaMarketPage;
import org.openqa.selenium.WebDriver;

public class Steps {
    WebDriver driver;
    public Steps addPizzaFourSeasonsToBasket() {
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        pizzaMarketPage
                .clickPizzaSectionLocator()
                .clickSelectPizzaFourSeasonsButton()
                .clickSelectPizzaSizeLocator()
                .clickAddPizzaToBasketButton();
        return this;
    }
    public String checkPizzaForSeasonsInBasket(){
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        return pizzaMarketPage.clickBasketPageButton().getNameOfPizzaInBasket();
    }
}
