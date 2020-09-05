package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {



    @BeforeClass //bu annotation a sahip method her class calismadan once calisir sadece 1 kere
    public static void setup(){
        System.out.println("setup calisti");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }

}
