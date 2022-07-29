package ru.netology.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CardTest {
    private WebDriver driver;

    @BeforeAll
    static void nweCart() {
        System.setProperty("webdriver.chrome.driver", "driver/win/chromedriver.exe");
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test

    void test() {
        driver.get("http://localhost:9999");

        driver.findElement(By.cssSelector("span[data-test-id='name'] input")).sendKeys("Татьяна");
        driver.findElement(By.cssSelector("span[data-test-id='phone'] input")).sendKeys("+79279999999");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button__text")).click();
        String text = driver.findElement(By.className("paragraph")).getText();
        assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
    }

    @AfterEach
    void down() {
        driver.quit();
        driver = null;
    }
}
