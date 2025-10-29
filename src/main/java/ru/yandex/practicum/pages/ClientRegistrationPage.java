package ru.yandex.practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClientRegistrationPage {

    private final WebDriver driver;

    public ClientRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By FirstNameField = By.xpath(".//input[@placeholder='* Имя']");
    private final By LastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By AddressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By MetroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By TelephoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By NextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By MetroDropdown = By.xpath(".//div[@class='select-search__select']");

    public void EnterFirstNameIn(String firstName) {
        driver.findElement(FirstNameField).clear();
        driver.findElement(FirstNameField).sendKeys(firstName);
    }

    public void EnterLastNameIn(String lastName) {
        driver.findElement(LastNameField).clear();
        driver.findElement(LastNameField).sendKeys(lastName);
    }

    public void EnterOrderAddressIn(String address) {
        driver.findElement(AddressField).clear();
        driver.findElement(AddressField).sendKeys(address);
    }

    public void ChoiceMetroStation(By metroStationName) {
        driver.findElement(MetroStationField).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MetroDropdown));

        driver.findElement(metroStationName).click();
    }

    public void EnterTelephoneIn(String telephone) {
        driver.findElement(TelephoneField).clear();
        driver.findElement(TelephoneField).sendKeys(telephone);
    }

    public void clickOnNextButton() {
        driver.findElement(NextButton).click();
    }
}
