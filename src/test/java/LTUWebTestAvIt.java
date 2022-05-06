import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LTUWebTestAvIt extends PageObject{

    @FindBy(xpath = "//*[contains(text(),'Kursens innehåll fokuserar på hur en testverksamhet bör planeras, " +
            "genomföras och dokumenteras. Som en introduktion behandlas områden som: vad en test är och " +
            "varför det är viktigt att testa IT-system, allmänna riktlinjer och metoder för test. Kursen " +
            "behandlar även olika testfaser, samt olika typer av tester. Efter denna introduktion till " +
            "området fördjupar sig kursen i testdesign och testfall. Kursen lägger fokus på processen för " +
            "att planera och genomföra tester samt på utformning av rekommendationer för åtgärda de svagheter " +
            "som identifierats.')]")
    private WebElement textTestAvIt;

    public LTUWebTestAvIt(WebDriver driver) {
        super(driver);
    }

    public void scrollDownOnPage() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0, 500)"); // not necessary for the verification
    }                                                                  // but I wanted the whole text to be seen

    public void verifyAlertSearchSuccess() {
        this.textTestAvIt.isDisplayed();
    }
}