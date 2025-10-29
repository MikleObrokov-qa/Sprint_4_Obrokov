package ru.yandex.practicum.pages;

import org.openqa.selenium.By;


public class TestAccordionData {

    public static Object[][] getAccordionData() {
        return new Object[][]{
                {
                        By.xpath(".//div[@id='accordion__heading-0' and @class='accordion__button']"),
                        "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                        By.xpath(".//div[@id='accordion__panel-0']//p")

                },
                {
                        By.xpath(".//div[@id='accordion__heading-1' and @class='accordion__button']"),
                        "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                        By.xpath(".//div[@id='accordion__panel-1']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-2' and @class='accordion__button']"),
                        "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                        By.xpath(".//div[@id='accordion__panel-2']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-3' and @class='accordion__button']"),
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                        By.xpath(".//div[@id='accordion__panel-3']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-4' and @class='accordion__button']"),
                        "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                        By.xpath(".//div[@id='accordion__panel-4']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-5' and @class='accordion__button']"),
                        "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                        By.xpath(".//div[@id='accordion__panel-5']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-6' and @class='accordion__button']"),
                        "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                        By.xpath(".//div[@id='accordion__panel-6']//p")
                },
                {
                        By.xpath(".//div[@id='accordion__heading-7' and @class='accordion__button']"),
                        "Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                        By.xpath(".//div[@id='accordion__panel-7']//p")
                }

        };
    }
}
