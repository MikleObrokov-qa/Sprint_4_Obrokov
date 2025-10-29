package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {

    private final WebDriver driver;

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By OrderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By RentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By CommentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By OrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private final By YesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");

    public void ChoiceOrderDate(By orderDateLocator) {
        driver.findElement(OrderDateField).click();
        driver.findElement(orderDateLocator).click();
    }

    public void ChoiceRentalPeriod(By rentalPeriodLocator) {
        driver.findElement(RentalPeriodField).click();
        driver.findElement(rentalPeriodLocator).click();
    }

    public void ChoiceColor(By scooterColorLocator) {

        driver.findElement(scooterColorLocator).click();
    }

    public void EnterComment(String comment) {
        driver.findElement(CommentField).clear();
        driver.findElement(CommentField).sendKeys(comment);
    }

    public void clickOnOrderButton() {
        driver.findElement(OrderButton).click();
    }

    public void clickOnYesButton() {
        driver.findElement(YesButton).click();
    }
}
