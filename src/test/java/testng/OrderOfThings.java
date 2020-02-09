package testng;

import org.testng.annotations.Test;

public class OrderOfThings {

    @Test
    public void firstTest(){
        System.out.println("Test one is running ");
    }
    @Test(priority = 1)
    public void secondTest(){
        System.out.println("Test two is running ");
    }
    @Test(priority = 0)
    public void thirdTest(){
        System.out.println("Test three is running ");
    }

}
