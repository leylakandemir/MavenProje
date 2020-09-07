package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayedOrnek {

    private static WebDriver driver;

    @BeforeClass
    public static void SetUp(){
        WebDriverManager.chromedriver().setup();

    }
    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://bestbuy.com");
    }
    @Test
    public  void  titleTest(){
        String baslik =driver.getTitle();
        boolean iceriyorMu= baslik.contains("Best");
        Assert.assertTrue(iceriyorMu);
    }
    @Test
    public  void  logoTest(){
        WebElement logo = driver.findElement(By.className("logo"));
        boolean gorunuyorMu = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }
    @Test
    public  void  linkTest(){
        WebElement logo = driver.findElement(By.partialLinkText("Mexico"));
        boolean tiklaniyorMu = logo.isDisplayed();
        Assert.assertTrue(tiklaniyorMu);
    }

    @After
    public void after(){
       driver.quit();
    }




}
