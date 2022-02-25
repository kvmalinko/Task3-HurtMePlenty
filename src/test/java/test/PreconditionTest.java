package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.GoogleCloudPage;

import java.util.concurrent.TimeUnit;

public class PreconditionTest {
        private WebDriver driver;
        protected GoogleCloudPage mainPage;

  @BeforeMethod
        public void setupBrowser(){
            System.setProperty("webdriver.chrome.driver", "/Users/Katsiaryna_Malinko/chromedriver");
            driver = new ChromeDriver();
            driver.manage()
                    .timeouts()
                    .implicitlyWait(20, TimeUnit.SECONDS);
            mainPage = new GoogleCloudPage(driver);
        }

  @AfterMethod(alwaysRun = true)
  public void closeBrowser(){
        driver.quit();
        driver=null;
    }
}
