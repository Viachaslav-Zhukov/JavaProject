package ru.Intelogis.company.Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageAuthorization {
    private WebDriver driver;
    // локатор поля ввода email
    private By emailField = By.name("auth_email");
    // локатор поля ввода пароля
    private By passwordField = By.name("auth_pass");
    // локатор кнопки входа
    private By signInButton = By.name("form_auth_submit");

    // конструктор класса
    public HomePageAuthorization(WebDriver driver) {
        this.driver = driver;
    }

    // метод заполняет поля ввода email
    public void setUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }

    // метод заполняет поля ввода пароля
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // метод клика по кнопке авторизации
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    // метод авторизации : объединяет ввод email, пароля и клик по кнопке
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
