package com.academy.techcenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Automation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        Thread.sleep(1000);
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals("Web Orders Login"));

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        String orderPageTitle = driver.getTitle();
        Assert.assertTrue(orderPageTitle.equals("Web Orders"));


        WebElement loginWelcome = driver.findElement(By.xpath("//div[@class='login_info']"));
        Assert.assertTrue(loginWelcome.isDisplayed());

        WebElement logoutLink = driver.findElement(By.id("ctl00_logout"));
        Assert.assertTrue(logoutLink.isDisplayed());

        WebElement webOrdersLogo = driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(webOrdersLogo.isDisplayed());

        WebElement orderLink = driver.findElement(By.xpath("//a[text()='Order']"));
        orderLink.click();
    }
}
