package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IlkOrnek {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        driver.get("https://www.google.com");
      if( driver.getTitle().contains("Google")){
          System.out.println("Basarili");
      }else {
          System.out.println("Basarisiz");
      }
    }

    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
