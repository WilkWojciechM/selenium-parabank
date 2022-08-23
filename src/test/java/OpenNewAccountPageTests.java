import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class OpenNewAccountPageTests {
    private WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }


    @Test
    public void openNewSavingAccountTest(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement openNenAccountLink = driver.findElement(By.cssSelector("#leftPanel a[href *= 'openaccount.htm']"));
        openNenAccountLink.click();

        WebElement typeOfAccountWebElement = driver.findElement(By.id("type"));
        Select typeOfAccountDropDown = new Select(typeOfAccountWebElement);

        typeOfAccountDropDown.selectByVisibleText("SAVINGS");

        WebElement  accountNumber = driver.findElement(By.id("fromAccountId"));
        Select availableAccount = new Select(accountNumber);
        availableAccount.getFirstSelectedOption();

        WebElement openNewAccountBtn = driver.findElement(By.cssSelector("input[value = 'Open New Account']"));
        openNewAccountBtn.click();

        sleep();

        WebElement accountOpenedMsg = driver.findElement(By.cssSelector("#rightPanel h1"));
        assertEquals(accountOpenedMsg.getText(),"Account Opened!");
    }

    @Test
    public void openNewCheckingAccountTest(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement openNenAccountLink = driver.findElement(By.cssSelector("#leftPanel a[href *= 'openaccount.htm']"));
        openNenAccountLink.click();

        WebElement typeOfAccountWebElement = driver.findElement(By.id("type"));
        Select typeOfAccountDropDown = new Select(typeOfAccountWebElement);

        typeOfAccountDropDown.selectByVisibleText("CHECKING");

        WebElement  accountNumber = driver.findElement(By.id("fromAccountId"));
        Select availableAccount = new Select(accountNumber);
        availableAccount.getFirstSelectedOption();

        WebElement openNewAccountBtn = driver.findElement(By.cssSelector("input[value = 'Open New Account']"));
        openNewAccountBtn.click();

        sleep();

        WebElement accountOpenedMsg = driver.findElement(By.cssSelector("#rightPanel h1"));
        assertEquals(accountOpenedMsg.getText(),"Account Opened!");
    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void AfterTest(){
        driver.close();
        driver.quit();
    }
}
