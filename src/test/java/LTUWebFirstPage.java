import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LTUWebFirstPage extends PageObject{

    private final String SEARCH_TESTAVITSYSTEM = "Test av IT-system";

    @FindBy(id = "ltu-menu-search")
    private WebElement searchButton;

    @FindBy(id = "cludo-search-bar-input")
    private WebElement searchField;

    public LTUWebFirstPage(WebDriver driver) {
        super(driver);
    }

    public void pressSearchButton(){
        this.searchButton.click();
    }

    public void enterTestAvItSystem(){
        this.searchField.sendKeys(SEARCH_TESTAVITSYSTEM);
    }

    public void pressEnterToSearch() {
        this.searchField.sendKeys(Keys.ENTER);
    }
}