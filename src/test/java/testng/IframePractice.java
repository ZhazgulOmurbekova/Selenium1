package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {

//    TC	#	:	Iframe	practice
//    1.Create	a	new	class	called:	IframePractice
//    2.Create	new	test	and	make	set	ups
//    3.Go	to	:http://practice.cybertekschool.com/iframe
//     4.Assert:“Your	content	goes	here.”Text	is	displayed.
//     5.Assert:“An	iFrame	containingthe	TinyMCE	WYSIWYG	E

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframeTest() {

        // driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.isDisplayed());


        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed());


    }
}
