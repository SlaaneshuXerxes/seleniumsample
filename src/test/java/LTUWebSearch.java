import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LTUWebSearch extends PageObject{

    @FindBy(xpath = "//*[contains(text(),'Test av IT-system, 7,5 högskolepoäng')]")
    private WebElement searchResultTestAvIt;

    public LTUWebSearch(WebDriver driver) {
        super(driver);
    }

    public void pressSearchResult() {
        this.searchResultTestAvIt.click();
    }
}