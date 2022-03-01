import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWatchList extends PageObject{



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

    @FindBy(xpath = "//li[@title='Add to your watchlist']")
    private WebElement addToWatchList;

    public AddToWatchList(WebDriver driver) {
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

    public void addToWatchList() {
        this.addToWatchList.click();
    }

}
