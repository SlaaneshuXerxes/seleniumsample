import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm() throws InterruptedException {

        // lots of waiting included both for loading time and also so one can se what is happening

        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        LTUWebFirstPage ltuWebFirstPage = new LTUWebFirstPage(driver);
        Thread.sleep(1000);
        ltuWebFirstPage.pressSearchButton();
        ltuWebFirstPage.enterTestAvItSystem();
        Thread.sleep(1000);
        ltuWebFirstPage.pressEnterToSearch();
        Thread.sleep(2000);

        LTUWebSearch ltuWebSearch = new LTUWebSearch(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ltuWebSearch.pressSearchResult();
        Thread.sleep(2000);

        LTUWebTestAvIt ltuWebTestAvIt = new LTUWebTestAvIt(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ltuWebTestAvIt.scrollDownOnPage();
        Thread.sleep(1000);
        ltuWebTestAvIt.verifyAlertSearchSuccess();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}