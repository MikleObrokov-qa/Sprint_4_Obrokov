package ru.yandex.practicum.pages;

import org.openqa.selenium.By;

public class TestScooterData {

    public static Object[][] getTestData() {
        return new Object[][] {

                {
                        By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']"),
                        "Иван",
                        "Иванов",
                        "Москва, Ленинский проспект, 35",
                        By.xpath(".//div[text()='Ленинский проспект']"),
                        "89259998877",
                        "Позвонить при доставке",
                        By.xpath(".//div[text()='сутки']"),
                        By.xpath(".//div[@aria-label='Choose суббота, 25-е октября 2025 г.']"),
                        By.xpath(".//input[@id='black']")

                },

                {
                        By.xpath(".//button[@class = 'Button_Button__ra12g Button_UltraBig__UU3Lp']"),
                        "Мария",
                        "Петрова",
                        "Москва, Сокольническая площадь, 9",
                        By.xpath(".//div[text()='Сокольники']"),
                        "89167776655",
                        "Оставить у двери",
                        By.xpath(".//div[text()='трое суток']"),
                        By.xpath(".//div[@aria-label='Choose понедельник, 27-е октября 2025 г.']"),
                        By.xpath(".//input[@id='grey']")

                }
        };
    }
}
