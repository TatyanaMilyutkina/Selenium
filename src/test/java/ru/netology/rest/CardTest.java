//package ru.netology.rest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//
//
//public class CardTest {
//    private WebDriver driver;
//
//    @BeforeAll
//    public static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//        driver.get("http://localhost:9999");
//    }
//
//    @Test
//    void test() {
//       // driver.get("http://localhost:9999");
//
//        driver.findElement(By.cssSelector("span[data-test-id='name'] input")).sendKeys("Татьяна");
//        driver.findElement(By.cssSelector("span[data-test-id='phone'] input")).sendKeys("+79279999999");
//        driver.findElement(By.className("checkbox__box")).click();
//        driver.findElement(By.className("button__text")).click();
//        String actualText = driver.findElement(By.cssSelector("[data-test-id=order-success")).getText();
//        //String text = driver.findElement(By.className("paragraph")).getText();
//        String expectedText = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        assertEquals(expectedText.trim(), actualText.trim());
//        //assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
//    }
//
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;
//    }
//}
