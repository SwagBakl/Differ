import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{

    @Test
    public void testScript() {
        WebDriver driver = SingletonBrowserClass.getInstanceOfSingletonBrowserClass().getDriver();
        driver.get("https://vk.com/");
        driver.manage().window().maximize();
    }
}
