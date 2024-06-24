package demo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgDemo {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = new ChromeDriver();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
         driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testGoogle(){

        driver.get("https://www.google.com/");
        String searchTerm = "coffee mug";
        driver.findElement(By.name("q")).sendKeys(searchTerm, Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains(searchTerm));
    }

    @Test
    public void testGoogle2(){

        driver.get("https://www.google.com/");
        String searchTerm = "tumbler";
        driver.findElement(By.name("q")).sendKeys(searchTerm, Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains(searchTerm));
    }

    @Test
    public void testGoogle3(){

        driver.get("https://www.google.com/");
        String searchTerm = "screen protector";
        driver.findElement(By.name("q")).sendKeys(searchTerm, Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains(searchTerm));
    }

}
