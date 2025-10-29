package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {

    private final WebDriver driver;
    private final By cookieButton = By.xpath(".//button[text()='да все привыкли']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        closeCookieBanner();
    }

    public void clickOnOrderMainButton(By orderButtonLocator) {
        driver.findElement(orderButtonLocator).click();
    }

    private void closeCookieBanner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton)).click();

    }
}
