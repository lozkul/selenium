package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ikea.se");
        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.close();



    }
}
