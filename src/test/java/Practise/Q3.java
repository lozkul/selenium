package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) {

/* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Levent" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Özkul" + Keys.ENTER);
        WebElement genderRadioButton =driver.findElement(By.xpath("//input[@id='sex-0']"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//input[@id='exp-6']")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11.10.2022" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
       // driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[7]")).click();
        driver.findElement(By.xpath("//select[@class='input-xlarge']")).sendKeys("Antartica"+ Keys.ENTER+ Keys.ENTER);
       // driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]")).click();
        driver.findElement(By.xpath("//select[@id='selenium_commands']")).sendKeys("Browser Commands"+ Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.close();
    }
}
