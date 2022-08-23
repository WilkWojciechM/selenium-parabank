
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CustomerCareTests {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void customerCareBtnTest(){
        WebElement customerCareBtn = driver.findElement(By.cssSelector("#headerPanel a[href *='contact.htm']"));
        customerCareBtn.click();
        WebElement title = driver.findElement(By.className("title"));
        assertTrue(title.isDisplayed());
    }

    @Test
    public void filingMsgFormAndSending(){
        WebElement customerCareBtn = driver.findElement(By.cssSelector("#headerPanel a[href *='contact.htm']"));
        customerCareBtn.click();

        WebElement customerName = driver.findElement(By.id("name"));
        customerName.sendKeys("John");
        String customerNameString = customerName.getAttribute("value");

        WebElement customerEmail = driver.findElement(By.id("email"));
        customerEmail.sendKeys("john123@gmail.com");

        WebElement customerPhone = driver.findElement(By.id("phone"));
        customerPhone.sendKeys("555 000 555");

        WebElement customerMsg = driver.findElement(By.id("message"));
        customerMsg.sendKeys("important problem");

        WebElement sendMessage = driver.findElement(By.cssSelector("input[value='Send to Customer Care']"));
        sendMessage.click();

        WebElement givenMsgWithName = driver.findElement(By.xpath("//*[@id='rightPanel']/p[1]"));

        String msgWithName = "Thank you " + customerNameString;

        assertEquals(givenMsgWithName.getText(), msgWithName);
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
