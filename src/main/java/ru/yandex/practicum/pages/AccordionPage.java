package ru.yandex.practicum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccordionPage {

    private final WebDriver driver;
    private final WebDriverWait wait;


    private final By cookieButton = By.xpath(".//button[text()='да все привыкли']");
    private final By accordionLocator = By.xpath(".//div[@class='accordion']");
    private final By accordionButton0 = By.xpath(".//div[@id='accordion__heading-0' and @class='accordion__button']");
    private final By accordionButton1 = By.xpath(".//div[@id='accordion__heading-1' and @class='accordion__button']");
    private final By accordionButton2 = By.xpath(".//div[@id='accordion__heading-2' and @class='accordion__button']");
    private final By accordionButton3 = By.xpath(".//div[@id='accordion__heading-3' and @class='accordion__button']");
    private final By accordionButton4 = By.xpath(".//div[@id='accordion__heading-4' and @class='accordion__button']");
    private final By accordionButton5 = By.xpath(".//div[@id='accordion__heading-5' and @class='accordion__button']");
    private final By accordionButton6 = By.xpath(".//div[@id='accordion__heading-6' and @class='accordion__button']");
    private final By accordionButton7 = By.xpath(".//div[@id='accordion__heading-7' and @class='accordion__button']");
    private final By accordionPanel0 = By.xpath(".//div[@id='accordion__panel-0']//p");
    private final By accordionPanel1 = By.xpath(".//div[@id='accordion__panel-1']//p");
    private final By accordionPanel2 = By.xpath(".//div[@id='accordion__panel-2']//p");
    private final By accordionPanel3 = By.xpath(".//div[@id='accordion__panel-3']//p");
    private final By accordionPanel4 = By.xpath(".//div[@id='accordion__panel-4']//p");
    private final By accordionPanel5 = By.xpath(".//div[@id='accordion__panel-5']//p");
    private final By accordionPanel6 = By.xpath(".//div[@id='accordion__panel-6']//p");
    private final By accordionPanel7 = By.xpath(".//div[@id='accordion__panel-7']//p");


    private final By[] accordionButtonLocators = {
            accordionButton0, accordionButton1, accordionButton2, accordionButton3,
            accordionButton4, accordionButton5, accordionButton6, accordionButton7
    };

    private final By[] accordionPanelLocators = {
            accordionPanel0, accordionPanel1, accordionPanel2, accordionPanel3,
            accordionPanel4, accordionPanel5, accordionPanel6, accordionPanel7
    };

    public AccordionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void closeCookieBanner() {
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton)).click();
    }

    public void scrollToAccordion() {
        WebElement element = driver.findElement(accordionLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickAccordionItem(int itemIndex) {
        wait.until(ExpectedConditions.elementToBeClickable(accordionButtonLocators[itemIndex])).click();
    }

    public void findAccordionItem(int itemIndex) {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        closeCookieBanner();
        scrollToAccordion();
        clickAccordionItem(itemIndex);
    }

    public String getAccordionItemActualText(int itemIndex) {
        WebElement textElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(accordionPanelLocators[itemIndex])
        );
        return textElement.getText();
    }

    public void verifyAccordionItemText(String expectedText, String actualText) {
        Assert.assertEquals("Неверный текст в аккордеоне", expectedText, actualText);
    }

}