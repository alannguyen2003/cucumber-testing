package org.hegroup.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class DemoLoginSteps {

    WebDriver webDriver = new ChromeDriver();

    @Given("User is at login page")
    public void userIsAtLoginPage() {
        webDriver.get("http://localhost:8080/vsos/user/login.do");
        webDriver.manage().window().maximize();
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        webDriver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("thu1@gmail.com");
        webDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
    }

    @Then("^User is navigated to home page$")
    public void userIsNavigatedToHomePage() {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", webDriver.findElement(By.id("login")));
        assertEquals("http://localhost:8080/vsos/home/index.do", webDriver.getCurrentUrl());
        webDriver.close();
    }
}
