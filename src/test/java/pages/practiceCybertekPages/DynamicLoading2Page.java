package pages.practiceCybertekPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

public class DynamicLoading2Page {
    public DynamicLoading2Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement startButton;



    @FindBy(xpath = "//div[@id=‘finish’]/h4")
    public WebElement helloWordTest;
}
