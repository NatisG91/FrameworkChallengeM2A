import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateList extends PageObject{

    private final String LIST_NAME = "MoviesT1";
    private final String LIST_DESCRIPTION = "DescriptionT1";

    @FindBy(xpath = "//span[text()='n']")
    private WebElement avatar;

    @FindBy(xpath = "//a[text()='Lists']")
    private WebElement lists;

    @FindBy(xpath = "//a[text()='Create List']")
    private WebElement createList;

    @FindBy(id = "name")
    private WebElement listName;

    @FindBy(id = "description")
    private WebElement listDescription;

    @FindBy(id = "step_1_submit")
    private WebElement submitList1;

    @FindBy(xpath = "//a[text()='"+LIST_NAME+"']")
    private WebElement alertSuccessListCreation;

    public CreateList(WebDriver driver) {
        super(driver);
    }

    public void pressAvatar(){
        this.avatar.click();
    }

    public void pressList(){
        this.lists.click();
    }

    public void createList(){
        this.createList.click();
    }

    public void enterListName(){
        this.listName.sendKeys(LIST_NAME);
    }

    public void enterListDescription(){
        this.listDescription.sendKeys(LIST_DESCRIPTION);
    }

    public void submitList(){
        this.submitList1.click();
    }

    public void verifySuccessListCreation(){
        this.alertSuccessListCreation.isDisplayed();
        System.out.println("Test 2. List Creation Successful");
    }


}
