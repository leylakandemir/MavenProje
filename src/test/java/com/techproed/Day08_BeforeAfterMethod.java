package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setup(){
        System.out.println("Setup calisti");
    }
    @Before
    public void methoddanonce(){
        System.out.println("methoddanonce calisti");
    }
    @Test
    public void test1(){
        System.out.println("Test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }

    @After
    public void methoddansonra(){
        System.out.println("methoddansonra calisti");
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }
}
