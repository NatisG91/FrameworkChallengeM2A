import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToList extends PageObject{

    private final String MOVIE = "Eternals";
    private final String LIST_NAME = "MoviesT1";

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement mainPage;

    @FindBy(id = "inner_search_v4")
    private WebElement searchMovie;

    @FindBy(xpath = "//input[@value='Search']")
    private WebElement submitSearch;

    @FindBy(xpath = "//h2[text()='"+MOVIE+"']")
    private WebElement selectMovie;

    @FindBy(xpath = "//li[@title='Add to list']")
    private WebElement addToList;

    @FindBy(xpath = "//span[contains(text(),'to one of your lists...')]")
    private WebElement addToOneList;

    @FindBy(xpath = "//li[contains(text(),'"+LIST_NAME+"')]")
    private WebElement selectTheList;

    @FindBy(xpath = "//span[text()='n']")
    private WebElement avatar;

    @FindBy(xpath = "//a[@href='/u/natisg91/lists']")
    private WebElement lists;

    @FindBy(xpath = "//a[text()='"+LIST_NAME+"']")
    private WebElement selectList;

    @FindBy(xpath = "//h2[contains(text(),'Success')]")
    private WebElement alertSuccessAddToList;

    public AddToList(WebDriver driver) {
        super(driver);
    }

    public void mainPage() {
        this.mainPage.click();
    }

    public void searchMovie() {
        this.searchMovie.sendKeys(MOVIE);
    }

    public void submitSearch() {
        this.submitSearch.click();
    }

    public void selectMovie() {
        this.selectMovie.click();
    }

    public void addToList() {
        this.addToList.click();
    }

    public void addToOneList() {
        this.addToOneList.click();
    }

    public void selectTheList() {
        this.selectTheList.click();
    }

    public void avatar() {
        this.avatar.click();
    }

    public void presslist() {
        this.lists.click();
    }

    public void selectList() {
        this.selectList.click();
    }

    public void verifySuccessMovieAddToList() {
        this.alertSuccessAddToList.isDisplayed();
        System.out.println("Test 3. Add Movie to List Successful");
    }
}
