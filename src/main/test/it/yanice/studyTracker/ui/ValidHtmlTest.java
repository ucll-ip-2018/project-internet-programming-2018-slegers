package it.yanice.studyTracker.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidHtmlTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //Gelieve de laatst versie van deze drive in deze folder te plaatsen
        // werkt enkel en alleen maar op mac
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        // driver.quit();
    }

    @Test
    public void isValidHtml() {
        driver.get("https://validator.w3.org/#validate_by_uri+with_options");
        WebElement invulveld = driver.findElement(By.id("uri"));
        invulveld.click();
        invulveld.sendKeys("http://193.191.177.8:10838/studyTracker/index.htm");

        Select dropdown = new Select(driver.findElement(By.id("uri-doctype")));
        dropdown.selectByValue("HTML5");

        WebElement button = driver.findElement(By.cssSelector(".submit_button"));
        button.click();

        WebElement pass = driver.findElement(By.cssSelector("p.success"));
        assertEquals("Document checking completed. No errors or warnings to show.", pass.getText());
    }

}
