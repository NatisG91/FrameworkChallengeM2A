import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject{

    private final String USERNAME = "natisg91";
    private final String PASSWORD = "Inuyasha91*";


    @FindBy(xpath = "//a[text()='Login']")
    private WebElement Login;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login_button")
    private WebElement login_button;

    @FindBy(xpath = "//a[text()='natisg91']")
    private WebElement alertSuccessLogin;

    public Login(WebDriver driver) {
        super(driver);
    }

    public void pressLogin(){
        this.Login.click();
    }

    public void enterUsername(){
        this.username.sendKeys(USERNAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void submitLogin(){
        this.login_button.click();
    }

    public void verifySuccessLogin(){
        this.alertSuccessLogin.isDisplayed();
        System.out.println("Test 1. Login Successful");
    }



}
