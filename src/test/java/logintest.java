import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class logintest {
    @Test
    public void loginTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/test23/login.do");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("username")), "testengineer@yopmail.com").build().perform();
        actions.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Password']")), "Test@123").build().perform();
        actions.click(driver.findElement(By.xpath("//a[@id='loginButton']"))).build().perform();
        actions.click(driver.findElement(By.id("container_tasks"))).build().perform();
        actions.click(driver.findElement(By.xpath("//div[@class='title ellipsis']"))).build().perform();
        actions.click(driver.findElement(By.xpath("//div[@class='item createNewCustomer']"))).build().perform();
        driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name' and @class]")).sendKeys("Tejas & Co");
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("World's best invetors");
        actions.click(driver.findElement(By.xpath("//div[@class='components_button_label' and text()='Create Customer'] "))).build().perform();
//        driver.close();
    }

}
