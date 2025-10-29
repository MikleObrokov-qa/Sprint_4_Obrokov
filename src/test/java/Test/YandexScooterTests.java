package Test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.practicum.pages.*;

@RunWith(Parameterized.class)
public class YandexScooterTests {

    @Rule
    public DriverFactory factory = new DriverFactory();

    private final By orderButtonLocator;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final By metroStationName;
    private final String telephone;
    private final String comment;
    private final By rentalPeriodLocator;
    private final By orderDateLocator;
    private final By scooterColorLocator;

    public YandexScooterTests(By orderButtonLocator, String firstName, String lastName, String address,By metroStationName, String telephone, String comment,
                              By rentalPeriodLocator, By orderDateLocator, By scooterColorLocator)  {
        this.orderButtonLocator = orderButtonLocator;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.metroStationName = metroStationName;
        this.telephone = telephone;
        this.comment = comment;
        this.rentalPeriodLocator = rentalPeriodLocator;
        this.orderDateLocator = orderDateLocator;
        this.scooterColorLocator = scooterColorLocator;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return TestScooterData.getTestData();
    }

    @Test
    public void testPositiveScooterOrderingScenario() {

        WebDriver driver = factory.getDriver();
        var orderPage = new OrderPage(driver);
        var clientRegistrationPage = new ClientRegistrationPage(driver);
        var rentPage = new RentPage(driver);
        var checkOrderPage = new CheckOrderPage(driver);

        orderPage.openMainPage();
        orderPage.clickOnOrderMainButton(orderButtonLocator);
        clientRegistrationPage.EnterFirstNameIn(firstName);
        clientRegistrationPage.EnterLastNameIn(lastName);
        clientRegistrationPage.EnterOrderAddressIn(address);
        clientRegistrationPage.ChoiceMetroStation(metroStationName);
        clientRegistrationPage.EnterTelephoneIn(telephone);
        clientRegistrationPage.clickOnNextButton();
        rentPage.ChoiceOrderDate(orderDateLocator);
        rentPage.ChoiceRentalPeriod(rentalPeriodLocator);
        rentPage.ChoiceColor(scooterColorLocator);
        rentPage.EnterComment(comment);
        rentPage.clickOnOrderButton();
        rentPage.clickOnYesButton();
        checkOrderPage.checkOrderCreation();
        checkOrderPage.endTest();
    }
}
