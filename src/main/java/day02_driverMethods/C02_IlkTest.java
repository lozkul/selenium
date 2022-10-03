package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.se");

        String expectedTitleIcerik="amazon";
        String expectedURLIcerik="Amazon";

        String actualURL= driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        if (actualURL.contains(expectedURLIcerik)){
            System.out.println("URL test passed");
        } else {
            System.out.println("URL test failed");
            System.out.println("actual URL : " + actualURL);
            System.out.println("Actual URL aranan " + expectedURLIcerik + " kelimesini içermiyor");
        }

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title test passed");
        } else {
            System.out.println("Title test failed");
            System.out.println("actual Title : " + actualTitle);
            System.out.println("Actual Title aranan " + expectedTitleIcerik + " kelimesini içermiyor");
        }
        driver.quit();

    }
}
