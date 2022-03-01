import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.DRIVER_LOCATION);
    }

    @Test(priority = 1)
    public static void Login(){
        driver.get(Utils.URL);
        driver.manage().window().maximize();
        Login login = new Login(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        login.pressLogin();
        login.enterUsername();
        login.enterPassword();
        login.submitLogin();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        login.verifySuccessLogin();
    }

    @Test(priority = 2)
    public static void CreateList(){


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CreateList createList = new CreateList(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createList.pressAvatar();
        createList.pressList();
        createList.createList();
        createList.enterListName();
        createList.enterListDescription();
        createList.submitList();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createList.verifySuccessListCreation();
    }

    @Test(priority = 3)
    public static void AddToList(){


        AddToList addToList = new AddToList(driver);
        addToList.mainPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        addToList.searchMovie();
        addToList.submitSearch();
        addToList.selectMovie();
        addToList.addToList();
        addToList.addToOneList();
        addToList.selectTheList();
        addToList.verifySuccessMovieAddToList();

    }

    @Test(priority = 4)
    public static void AddToFavorites(){


        WebDriverWait wait = new WebDriverWait(driver, 10);
        AddToFavorites addToFavorites = new AddToFavorites(driver);
        addToFavorites.mainPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        addToFavorites.searchMovie();
        addToFavorites.submitSearch();
        addToFavorites.selectMovie();
        addToFavorites.addToFavorites();
        System.out.println("Test 4. Add Movie to Favorites Successful");

    }

    @Test(priority = 5)
    public static void AddToWatchList(){


        WebDriverWait wait = new WebDriverWait(driver, 10);
        AddToWatchList addToWatchList = new AddToWatchList(driver);
        addToWatchList.mainPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        addToWatchList.searchMovie();
        addToWatchList.submitSearch();
        addToWatchList.selectMovie();
        addToWatchList.addToWatchList();
        System.out.println("Test 5. Add Movie to WatchList Successful");

    }



    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
