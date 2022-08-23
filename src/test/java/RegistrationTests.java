
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationTests {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void registrationLinkToRegistrationForm() {
        //register link click
        WebElement mainPageRegister = driver.findElement(By.cssSelector("#loginPanel a[href *= 'register']"));
        mainPageRegister.click();
        //if first name label is displayed, link works
        WebElement firstNameLabel = driver.findElement(By.id("customer.firstName"));
        assertTrue(firstNameLabel.isDisplayed());
    }

    @Test
    public void completeRegistrationFormWithUsernameAlreadyUsed() {

        //register link click
        WebElement mainPageRegister = driver.findElement(By.cssSelector("#loginPanel a[href *= 'register']"));
        mainPageRegister.click();
        //if first name label is displayed, link works
        WebElement firstNameLabel = driver.findElement(By.id("customer.firstName"));
        assertTrue(firstNameLabel.isDisplayed());

        WebElement customerFirstName = driver.findElement(By.id("customer.firstName"));
        customerFirstName.sendKeys("John");

        WebElement customerLastName = driver.findElement(By.id("customer.lastName"));
        customerLastName.sendKeys("Doe");

        WebElement customerAddress = driver.findElement(By.id("customer.address.street"));
        customerAddress.sendKeys("Washington 55");

        WebElement customerCity = driver.findElement(By.id("customer.address.city"));
        customerCity.sendKeys("Tokyo");

        WebElement customerState = driver.findElement(By.id("customer.address.state"));
        customerState.sendKeys("Honshu");

        WebElement customerZipCode = driver.findElement(By.id("customer.address.zipCode"));
        customerZipCode.sendKeys("55-555");

        WebElement customerPhoneNr = driver.findElement(By.id("customer.phoneNumber"));
        customerPhoneNr.sendKeys("555 000 555");

        WebElement customerSSN = driver.findElement(By.id("customer.ssn"));
        customerSSN.sendKeys("34534hjjgfd");

        WebElement customerUsername = driver.findElement(By.id("customer.username"));
        customerUsername.sendKeys("Ichigo");

        WebElement customerPassword = driver.findElement(By.id("customer.password"));
        customerPassword.sendKeys("l3j4");

        WebElement customerPasswordConfirm = driver.findElement(By.id("repeatedPassword"));
        customerPasswordConfirm.sendKeys("l3j4");
        sleep();
        WebElement registerBtn = driver.findElement(By.cssSelector("input[value='Register']"));
        registerBtn.click();

        WebElement messageError = driver.findElement(By.id("customer.username.errors"));

        assertEquals(messageError.getText(), "This username already exists.");
//            WebElement messageLabel = driver.findElement(By.xpath("*[@id='rightPanel']/p"));
//
//            assertEquals(messageLabel.getText(),"Your account was created successfully. You are now logged in.");

    }

    @Test
    public void completeRegistrationFormWithCorrectData() {
        //register link click
        WebElement mainPageRegister = driver.findElement(By.cssSelector("#loginPanel a[href *= 'register']"));
        mainPageRegister.click();
        //if first name label is displayed, link works
        WebElement firstNameLabel = driver.findElement(By.id("customer.firstName"));
        assertTrue(firstNameLabel.isDisplayed());

        WebElement customerFirstName = driver.findElement(By.id("customer.firstName"));
        customerFirstName.sendKeys("John");

        WebElement customerLastName = driver.findElement(By.id("customer.lastName"));
        customerLastName.sendKeys("Doe");

        WebElement customerAddress = driver.findElement(By.id("customer.address.street"));
        customerAddress.sendKeys("Washington 55");

        WebElement customerCity = driver.findElement(By.id("customer.address.city"));
        customerCity.sendKeys("Tokyo");

        WebElement customerState = driver.findElement(By.id("customer.address.state"));
        customerState.sendKeys("Honshu");

        WebElement customerZipCode = driver.findElement(By.id("customer.address.zipCode"));
        customerZipCode.sendKeys("55-555");

        WebElement customerPhoneNr = driver.findElement(By.id("customer.phoneNumber"));
        customerPhoneNr.sendKeys("555 000 555");

        WebElement customerSSN = driver.findElement(By.id("customer.ssn"));
        customerSSN.sendKeys("34534hjjgfd");

        WebElement customerUsername = driver.findElement(By.id("customer.username"));
        customerUsername.sendKeys("Ichigo");

        WebElement customerPassword = driver.findElement(By.id("customer.password"));
        customerPassword.sendKeys("l3j4");

        WebElement customerPasswordConfirm = driver.findElement(By.id("repeatedPassword"));
        customerPasswordConfirm.sendKeys("l3j4");
        sleep();
        WebElement registerBtn = driver.findElement(By.cssSelector("input[value='Register']"));
        registerBtn.click();
        WebElement messageLabel = driver.findElement(By.xpath("//*[@id='rightPanel']/p"));

        assertEquals(messageLabel.getText(), "Your account was created successfully. You are now logged in.");

    }

    @Test
    public void completeRegistrationFormWithIncorrectRepetedPassword() {
        //register link click
        WebElement mainPageRegister = driver.findElement(By.cssSelector("#loginPanel a[href *= 'register']"));
        mainPageRegister.click();
        //if first name label is displayed, link works
        WebElement firstNameLabel = driver.findElement(By.id("customer.firstName"));
        assertTrue(firstNameLabel.isDisplayed());

        WebElement customerFirstName = driver.findElement(By.id("customer.firstName"));
        customerFirstName.sendKeys("John");

        WebElement customerLastName = driver.findElement(By.id("customer.lastName"));
        customerLastName.sendKeys("Doe");

        WebElement customerAddress = driver.findElement(By.id("customer.address.street"));
        customerAddress.sendKeys("Washington 55");

        WebElement customerCity = driver.findElement(By.id("customer.address.city"));
        customerCity.sendKeys("Tokyo");

        WebElement customerState = driver.findElement(By.id("customer.address.state"));
        customerState.sendKeys("Honshu");

        WebElement customerZipCode = driver.findElement(By.id("customer.address.zipCode"));
        customerZipCode.sendKeys("55-555");

        WebElement customerPhoneNr = driver.findElement(By.id("customer.phoneNumber"));
        customerPhoneNr.sendKeys("555 000 555");

        WebElement customerSSN = driver.findElement(By.id("customer.ssn"));
        customerSSN.sendKeys("34534hjjgfd");

        WebElement customerUsername = driver.findElement(By.id("customer.username"));
        customerUsername.sendKeys("Ichigo");

        WebElement customerPassword = driver.findElement(By.id("customer.password"));
        customerPassword.sendKeys("l3j4");

        WebElement customerPasswordConfirm = driver.findElement(By.id("repeatedPassword"));
        customerPasswordConfirm.sendKeys("l8j4");

        WebElement registerBtn = driver.findElement(By.cssSelector("input[value='Register']"));
        registerBtn.click();
        WebElement nonRepeatedMessage = driver.findElement(By.id("repeatedPassword.errors"));
sleep();
        assertEquals(nonRepeatedMessage.getText(), "Passwords did not match.");
    }


    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}


