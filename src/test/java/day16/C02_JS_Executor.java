package day16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_JS_Executor extends TestBaseBeforeAfter {

    @Test
    public void test() {
        // Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        // Asagidaki carrers butonunu gorunceye kadar js ile scroll yapalim
        WebElement carrers = driver.findElement(By.xpath("//*[text()='Careers']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",carrers);
        // Carrers butonuna js ile click yapalim
        jse.executeScript("arguments[0].click();",carrers);
        /*
        js.executeScript("arguments[0].scrollIntoView(true);", auto.downloadInvoiceButton);
        try {
        driver.findElement(By.linkText("Scans")).click();
        } catch (Exception e) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.linkText("Scans")));
        }
        */
    }
}