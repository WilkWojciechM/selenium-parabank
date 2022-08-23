import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LoginTests {
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @Test
    public void loginWithIncorrectLogin(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Merry");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123###");

        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        assertTrue(errorMsg.isEnabled());
    }

    @Test
    public void loginWithCorrectLoginAndIncorrectPassword(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123###");

        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        assertTrue(errorMsg.isEnabled());
    }

    @Test
    public void loginWithCorrectPasswordAndIncorrectLogin(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichig");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        assertTrue(errorMsg.isEnabled());
    }

    @Test
    public void loginWithCorrectData(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Ichigo");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("l3j4");

        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        logInBtn.click();

        WebElement accountTable = driver.findElement(By.id("accountTable"));
        assertTrue(accountTable.isDisplayed());
    }


    @AfterMethod
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
