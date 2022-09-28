package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_ScreenShot extends TestBaseBeforeAfter {

    @Test
    public void test1() throws IOException {
        //Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        //Nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);
        //Arama sonucunun resmini alalim
        WebElement aramaSonucu = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        File nutellaAramaSonucu = aramaSonucu.getScreenshotAs(OutputType.FILE);
        //Sadece Webb elementin resmini alacaksak TakeScreenShot class'ini kullanmama gerek yok
        //Locate ettigimiz webbelementini direk gecici bbir file'a atip FileUtils ile kopyalayip yolunu(path) belirtiriz
        FileUtils.copyFile(nutellaAramaSonucu, new File("target/ekranGoruntusuWe/WebESS.jpeg"));

    }
}