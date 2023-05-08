import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class login {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\91850\\Desktop\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        String actualtitle = driver.getTitle();
//        String Expected = "https://www.amazon.in/";
//        Assert.assertEquals(actualtitle,Expected);

        WebElement textbox =  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebDriverWait wait= new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(textbox));
     textbox.clear();
     textbox.sendKeys("redmi mobiles");
     driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
       WebElement textbox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       textbox2.clear();
       textbox2.sendKeys("mobile accessories");

    }
}
