package day07Asertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03DropHandle {


    //●https://www.amazon.com/ adresinegidin.
    //-Test1
    //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin45
    //oldugunu testedin
    //-Test2
    //1.Kategori menusunden Books seceneginisecin
    //2.Arama kutusuna Java yazin vearatin
    //3.Bulunan sonuc sayisiniyazdirin
    //4.Sonucun Java kelimesini icerdigini testedin


    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }
    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1(){
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin45
        //oldugunu testedin
        WebElement ddm = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        List<WebElement> dmmlist=select.getOptions();
        System.out.println(dmmlist.size());
        int dropDownList = dmmlist.size();
        int expectedSayi = 45;
        Assert.assertNotEquals(expectedSayi,dropDownList);

    }
    @Test
    public void test2(){
        //1.Kategori menusunden Books seceneginisecin

        //2.Arama kutusuna Java yazin vearatin
        //3.Bulunan sonuc sayisiniyazdirin
        //4.Sonucun Java kelimesini icerdigini testedin



    }
}
