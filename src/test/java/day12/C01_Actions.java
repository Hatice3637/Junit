package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C01_Actions extends TestBaseBeforeAfter {
    @Test
    public void tet1() {
        //Automationexercises.com adresine gidelim
        driver.get("https://www.automationexercise.com");
//product bölümüne girelim
        driver.findElement(By.cssSelector("a[href=\"/products\"]")).click();
//ilk ürünü tıklamayalım
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        WebElement firstItem = driver.findElement(By.xpath("(//*[@class='nav nav-pills nav-justified'])[1]"));
    }
}
