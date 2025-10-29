package ru.yandex.practicum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOrderPage {

    private final WebDriver driver;

    public CheckOrderPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By TextOrderCreation = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Посмотреть статус']");

    public void checkOrderCreation() {

        Assert.assertTrue(driver.findElement(TextOrderCreation).isDisplayed());
    }

    public void endTest(){
        driver.quit();
    }
}