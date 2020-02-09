package pages.smartBearPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class LoginPage {
    //When we are creating a POM page
    //1-create a constructor and call PageFactory method

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //2- @FindBy annotation to locate webElement
    //@FindBy annotation locates the webElement
    // Then we stroe that webElement on the next line
    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordInput;


    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMessage;
}
