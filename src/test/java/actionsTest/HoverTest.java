package actionsTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practiceCybertekPages.HoverLandingPage;
import utilites.Driver;

public class HoverTest {

    @Test
    public void hoversTests() throws InterruptedException {
        //1- get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //2- Create the object of the HoversPage class to be able to reach
        //webelements we locate in that class
        HoverLandingPage hoversPage = new HoverLandingPage();
        //3- Create the object of the Actions class, and pass the driver
        Actions actions = new Actions(Driver.getDriver());
        //4- Using "actions" instance, we move to web elements that are previously
        //located in HoversPage class
        actions.moveToElement(hoversPage.image1).perform();
        //5- assert that the expected text is displayed on the page
        Assert.assertTrue(hoversPage.user1Text.isDisplayed());
        //6- move to 2nd image
        Thread.sleep(1000);
        actions.moveToElement(hoversPage.image2).perform();
        //7- assert user2 text is displayed
        Assert.assertTrue(hoversPage.user2Text.isDisplayed());
        //8- move to 3rd image
        Thread.sleep(1000);
        actions.moveToElement(hoversPage.image3).perform();
        //9- assert user3 text is displayed
        Assert.assertTrue(hoversPage.user3Text.isDisplayed());
    }


    @Test
    public void hoversTest2() throws InterruptedException {
        //TC	#16:	Hover	Test
        //1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
        // 2.Drag	and	drop	the	small	circle	to	bigger	circle.
        // 3.Assert:	-Text	in	big	circle	changedto:	“You	did	great!”

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        HoverLandingPage hoversPage = new HoverLandingPage();
        Actions actions = new Actions(Driver.getDriver());

        Thread.sleep(5000);

        Driver.getDriver().findElement(By.xpath("//button[@class='optanon-allow-all accept-cookies-button']")).click();
        //String text = Driver.getDriver().findElement(By.id( "droptarget")).getText();


        Thread.sleep(5000);
        actions.dragAndDrop(hoversPage.smallCircle, hoversPage.biggerCircle).perform();

        Assert.assertTrue(hoversPage.biggerCircle.isDisplayed(), "not");

    }


@Test
    public void hoverTest3() {
    //TC	#16:	Hover	Test
    //1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    // 2.Switch	to	iframe.
    // 3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
    // 4.Assert:	Text’s	“style”attribute	value	contains	“red”.
    Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
   // Alert alert = Driver.getDriver().switchTo().



}
}














