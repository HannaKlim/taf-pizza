package by.itacademy.hannaklimasheuskaya;

import by.itacademy.hannaklimasheuskaya.page.PizzaMarketPage;
import by.itacademy.hannaklimasheuskaya.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaMarketTest extends BaseTest {
    @Test
    void testAddPizzaFourSeasonToBucketAndCheck() {
        Steps steps = new Steps();
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        String actualResult = steps.addPizzaFourSeasonsToBasket().checkPizzaForSeasonsInBasket();
        String expectedResult = pizzaMarketPage.RESULT_NAME_OF_PIZZA_IN_BASKET;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
