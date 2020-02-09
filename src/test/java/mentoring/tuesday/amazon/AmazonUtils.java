package mentoring.tuesday.amazon;

import org.openqa.selenium.By;

public class AmazonUtils extends BasePage{

    public void clickCategory(String categorName) {
        driver.findElement(By.xpath("//*[.='" + categorName + "']")).click();
    }


}
