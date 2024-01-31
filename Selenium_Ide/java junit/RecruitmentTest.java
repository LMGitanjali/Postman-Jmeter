// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RecruitmentTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void recruitment() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector(".oxd-button")).click();
    driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(5) .oxd-text")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".active > .oxd-text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
    driver.findElement(By.name("firstName")).click();
    driver.findElement(By.name("firstName")).sendKeys("Neha");
    driver.findElement(By.name("middleName")).click();
    driver.findElement(By.name("middleName")).sendKeys("Shubh");
    driver.findElement(By.name("lastName")).click();
    driver.findElement(By.name("lastName")).sendKeys("Dalvi");
    driver.findElement(By.cssSelector(".oxd-select-text-input")).click();
    driver.findElement(By.cssSelector(".oxd-form-row:nth-child(2) > .oxd-grid-3")).click();
    driver.findElement(By.cssSelector(".oxd-select-text-input")).click();
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("neha3@gmail.com");
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("788993933");
    driver.findElement(By.cssSelector(".bi-check")).click();
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    driver.findElement(By.cssSelector(".oxd-topbar-body-nav > ul")).click();
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    driver.findElement(By.linkText("Cerrar sesión")).click();
  }
}
