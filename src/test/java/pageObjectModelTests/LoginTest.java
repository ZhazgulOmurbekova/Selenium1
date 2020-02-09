package pageObjectModelTests;
import org.testng.annotations.Test;
import pages.vytrackPages.VytrackLoginPage;
import utilites.Config;
import utilites.Driver;

public class LoginTest {

    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("storemanagePassword");

        Driver.getDriver().get(Config.getProperty("vytrackUrl"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();
    }

}
