import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LocatorsTest {

@Test
public void logInLockedOut() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    WebDriver browser = new ChromeDriver();
    browser.get("https://www.saucedemo.com");
    browser.findElement(By.name("user-name")).sendKeys("locked_out_user");
    browser.findElement(By.name("password")).sendKeys("secret_sauce");
    browser.findElement(By.id("login-button")).click();
    String error = browser.findElement(By.cssSelector(".error-message-container.error")).getText();
    assertEquals(error, "Epic sadface: Sorry, this user has been locked out.");
    browser.quit();
}
    @Test
    public void logInCorrect () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        String products = browser.findElement(By.xpath("//span[@class='title']")).getText();
        assertEquals(products, "Products");
        browser.quit();
 }

    @Test
    public void logInWrongPassword () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("error_user");
        browser.findElement(By.name("password")).sendKeys("saucesauce");
        browser.findElement(By.id("login-button")).click();
        String error = browser.findElement(By.tagName("h3")).getText();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
        browser.quit();
    }

    @Test
    public void backPack () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.className("inventory_item_name")).click();
        String backPack = browser.findElement(By.xpath("//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.']")).getText();
        assertEquals(backPack, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        browser.quit();
    }

    @Test
    public void burgerMenuAllItems () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
        browser.findElement(By.xpath("//*[text()='All Items']//ancestor::div")).click();
        browser.quit();
    }

    @Test
    public void socialMediaTwitterLogo () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.cssSelector("a[href*='twitter']")).click();
        browser.quit();
    }

    @Test
    public void socialMediaFacebookLogo () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.xpath("//li[@class='social_facebook']")).click();
        browser.quit();
    }

    @Test
    public void socialMediaFacebookLogoPartialAttribute () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();
        browser.quit();
    }
    @Test
    public void socialMediaLinkedInLogo () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.partialLinkText("LinkedIn")).click();
        browser.quit();
    }

    @Test
    public void inventoryList () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.xpath("//div[@class='inventory_list']/div[1]")).click();
        browser.quit();
    }

    @Test
    public void tShirtRed () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.cssSelector("#item_3_title_link")).click();
        browser.findElement(By.cssSelector("button.btn.btn_primary.btn_small.btn_inventory")).click();
        browser.findElement(By.cssSelector("a.shopping_cart_link")).click();
        browser.findElement(By.xpath("//button[text()='Checkout']")).click();
        browser.findElement(By.cssSelector("[value=Continue")).click();
        String error = browser.findElement(By.cssSelector("h3")).getText();
        assertEquals(error, "Error: First Name is required");
        browser.quit();
    }

    @Test
    public void filter () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.name("password")).sendKeys("secret_sauce");
        browser.findElement(By.id("login-button")).click();
        browser.findElement(By.cssSelector(".select_container .product_sort_container")).click();
        browser.quit();
    }
}

