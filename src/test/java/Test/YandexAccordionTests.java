package Test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.pages.AccordionPage;
import ru.yandex.practicum.pages.TestAccordionData;


@RunWith(Parameterized.class)
public class YandexAccordionTests {

    @Rule
    public DriverFactory factory = new DriverFactory();

    private final By accordionItemLocator;
    private final String expectedText;
    private final By actualTextLocator;

    public YandexAccordionTests(By accordionFieldLocator, String expectedText, By actualTextLocator) {
        this.accordionItemLocator = accordionFieldLocator;
        this.expectedText = expectedText;
        this.actualTextLocator = actualTextLocator;
    }

    @Parameterized.Parameters
    public static Object[][] getAccordionData() {
        return TestAccordionData.getAccordionData();
    }

    @Test
    public void testCheckingAccordionText() {
        WebDriver driver = factory.getDriver();
        var accordionPage = new AccordionPage(driver);

        accordionPage.openMainPage();
        accordionPage.scrollToAccordion();
        accordionPage.clickAccordionItem(accordionItemLocator);
        accordionPage.checkAccordionItemText(expectedText, actualTextLocator);
        accordionPage.endAccordionTest();
    }
}