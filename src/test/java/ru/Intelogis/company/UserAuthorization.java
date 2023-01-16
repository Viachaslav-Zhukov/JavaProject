package ru.Intelogis.company;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.Intelogis.company.Page_Object.HomePageAuthorization;

// Создали тестовый класс, для выполнения тестового сценария
public class UserAuthorization {

    private WebDriver driver;

    @Test
    public void test() {
        //Проинициализируй WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Создай драйвер для браузера Chrome
        driver = new ChromeDriver();
        // перейди на страницу сайта
        driver.get("http://u920152e.beget.tech/#/");
        // создай объект класса страницы авторизации
        HomePageAuthorization homePageAuthorization = new HomePageAuthorization(driver);
        // выполни авторизацию пользователя
        homePageAuthorization.login("slava-slava19@rambler.ru",
                "123456");
    }

    //Закрываем браузер
    @After
    public void teardown() {
        driver.quit();
    }
}
