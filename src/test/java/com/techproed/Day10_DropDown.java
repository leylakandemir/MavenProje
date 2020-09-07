package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day10_DropDown {
static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void test1(){
        driver.get("http://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        select.selectByIndex(5);
        WebElement secim3  = select.getFirstSelectedOption();
        System.out.println(secim3.getText());

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        select.selectByValue("search-alias=arts-crafts-intl-ship");
        WebElement secim  = select.getFirstSelectedOption();
        System.out.println(secim.getText());
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        select.selectByVisibleText("Beauty & Personal Care");

        WebElement secim2  = select.getFirstSelectedOption();
        System.out.println(secim2.getText());

        List<WebElement> liste = select.getOptions();
        for (WebElement w:liste) {
            System.out.println(w.getText());
        }

       int dropdownsayisi = liste.size();
        System.out.println(dropdownsayisi);


}






}
