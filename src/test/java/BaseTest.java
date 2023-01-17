import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    @AfterTest
    public void tearDown() {
        WebDriver driver = SingletonBrowserClass.getInstanceOfSingletonBrowserClass().getDriver();
        driver.quit();
    }
}
