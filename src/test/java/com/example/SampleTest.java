package com.example;

import org.example.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void testAuto(){
        driver.get("https://automationteststore.com/");
        String data = driver.findElement(By.id("categorymenu")).getText();
        System.out.println(data);
    }

}
