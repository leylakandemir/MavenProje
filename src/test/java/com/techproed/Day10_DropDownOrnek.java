package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Day10_DropDownOrnek {
    static WebDriver driver;
    /*1.Amazon a gidelim
    2. Dropdown uzerinde software e git
    3.javayi  arayin
    4.Sonuc syisini ekrana yazdirin
    */
    @BeforeClass
    public static void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void deneme(){
        driver.get("https://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropDown);
        select.selectByVisibleText("Software");
        WebElement ara = driver.findElement(By.id("twotabsearchtextbox"));
        ara.sendKeys("JAVA"+Keys.ENTER);
        WebElement sonuc = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuc.getText());
        Assert.assertTrue(sonuc.getText().contains("JAVA"));


    }

    @AfterClass
    public static void tearDown(){
       // driver.quit();
}







}
