import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {



    @Test
    public void loginTest() {

        //init login
        click(By.id("pt-login"));

        //fill login form

        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("rrrrttttt.com");


        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("1234567");
        //confirm login
        click(By.name("wploginattempt"));

        //pause
    }


}


