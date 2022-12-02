package by.itacademy.hannaklimasheuskaya;

import by.itacademy.hannaklimasheuskaya.page.PizzaMarketPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        PizzaMarketPage pizzaMarketPage = new PizzaMarketPage(driver);
        driver.manage()
                .window()
                .maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        pizzaMarketPage.openPizzaMarketPage();
    }

   @AfterEach
    public void closeWebDiver() {
        driver.quit();
    }
}
