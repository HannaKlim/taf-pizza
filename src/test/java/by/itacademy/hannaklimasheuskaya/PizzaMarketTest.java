package by.itacademy.hannaklimasheuskaya;

import by.itacademy.hannaklimasheuskaya.page.PizzaMarketPage;
import by.itacademy.hannaklimasheuskaya.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaMarketTest extends BaseTest {
    @Test
    void testAddPizzaFourSeasonToBucketAndCheck() {
        Steps steps = new Steps(driver);
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        if (pizzaMarketPage.findAtNightButton() != null) {
            String actualResult = steps.addPizzaFourSeasonsToBasketAtNonWorkingHours().checkPizzaForSeasonsInBasket();
            String expectedResult = pizzaMarketPage.RESULT_NAME_OF_PIZZA_IN_BASKET;

            Assertions.assertEquals(expectedResult, actualResult);
        } else {
            String actualResult = steps.addPizzaFourSeasonsToBasketAtWorkingHours().checkPizzaForSeasonsInBasket();
            String expectedResult = pizzaMarketPage.RESULT_NAME_OF_PIZZA_IN_BASKET;

            Assertions.assertEquals(expectedResult, actualResult);
        }
    }
}
