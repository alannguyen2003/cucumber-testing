package org.hegroup.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class DemoDDT {
    WebDriver webDriver = new ChromeDriver();

    @Given("^User is at login page DDT$")
    public void userIsAtLoginPageDDT() {
        webDriver.get("http://localhost:8080/vsos/user/login.do");
        webDriver.manage().window().maximize();
    }

    @When("^User enters (.*) and (.*) DDT$")
    public void userEntersUsernameAndPasswordDDT(String username, String password) {
        webDriver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }

    @Then("^(.*) is navigated to home page DDT$")
    public void userIsNavigatedToHomePageDDT(String name) {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", webDriver.findElement(By.id("login")));
        assertEquals("http://localhost:8080/vsos/home/index.do", webDriver.getCurrentUrl());
        System.out.println(name + " is navigated to home page!!");
        webDriver.close();
    }
}
