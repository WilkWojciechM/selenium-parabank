import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BillPayTests {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }



    @Test
    public void noPayeeName(){
        //mega powtórzenie testu
//        WebElement username = driver.findElement(By.name("username"));
//        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("12345678");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("22223333344444");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());
    }

    @Test
    public void diffrentPayeeAccount(){

        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("12345678");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("22223333344444");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());

    }

    @Test
    public void noPayeeAccount(){
        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

//        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
//        payeeAccount.sendKeys("12345678");
//
//        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
//        payeeVerifyAccount.sendKeys("22223333344444");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());
    }

    @Test
    public void noValidAccountNumber(){
        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("gr111%%%^^^^");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("gr111%%%^^^^");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());
    }



    @Test
    public void noAmount(){
        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("gr111%%%^^^^");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("gr111%%%^^^^");

//        WebElement amountToSend = driver.findElement(By.name("amount"));
//        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());
    }

    @Test
    public void noValidAmount(){
        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("gr111%%%^^^^");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("gr111%%%^^^^");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("gr");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();

        WebElement errorMissmatchMsg = driver.findElement(By.xpath("//span[.='The account numbers do not match.']"));

        assertTrue(errorMissmatchMsg.isDisplayed());
    }

    @Test
    public void correctPayeeInfo(){
        //mega powtórzenie testu
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement billPayBtn = driver.findElement(By.cssSelector("#leftPanel a[href *= 'billpay.htm']"));
        billPayBtn.click();

// ---------
        WebElement payeeName = driver.findElement(By.name("payee.name"));
        payeeName.sendKeys("JohnMnemonic inc.");

        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
        payeeAddress.sendKeys("Washington DC. 86 avn");

        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
        payeeCity.sendKeys("London");

        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
        payeeState.sendKeys("Brokylion");

        WebElement payeeZipCode = driver.findElement(By.name("payee.address.zipCode"));
        payeeZipCode.sendKeys("123rr");

        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
        payeePhone.sendKeys("12334556");

        WebElement payeeAccount = driver.findElement(By.name("payee.accountNumber"));
        payeeAccount.sendKeys("123456");

        WebElement payeeVerifyAccount = driver.findElement(By.name("verifyAccount"));
        payeeVerifyAccount.sendKeys("123456");

        WebElement amountToSend = driver.findElement(By.name("amount"));
        amountToSend.sendKeys("200");

        WebElement fromAccount = driver.findElement(By.name("fromAccountId"));
        Select accountDropDown = new Select(fromAccount);

        accountDropDown.getFirstSelectedOption();

        WebElement sendPaymentBtn = driver.findElement(By.cssSelector("input[value ='Send Payment']"));
        sendPaymentBtn.click();
            sleep();
        WebElement paymentCompleteMsg = driver.findElement(By.xpath("//h1[@class='title']"));
        assertEquals(paymentCompleteMsg.getText(),"Bill Payment Complete");
    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
