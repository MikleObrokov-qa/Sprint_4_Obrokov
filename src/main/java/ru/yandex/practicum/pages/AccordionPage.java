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
    private final By cookieButton = By.xpath(".//button[text()='да все привыкли']");


    public AccordionPage(WebDriver driver) {
        this.driver = driver;
    }

    private void closeCookieBanner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(cookieButton)).click();

    }

    public void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        closeCookieBanner();
    }

    public void scrollToAccordion() {
        WebElement element = driver.findElement(By.xpath(".//div[@class='accordion']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    public void clickAccordionItem(By accordionItemLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(accordionItemLocator)).click();
    }

    public void checkAccordionItemText(String expectedText, By actualTextLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement textElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(actualTextLocator)
        );

        String actualText = textElement.getText();
        Assert.assertEquals("Неверный текст в аккордеоне", expectedText, actualText);
    }

    public void endAccordionTest() {
        driver.quit();
    }
}
