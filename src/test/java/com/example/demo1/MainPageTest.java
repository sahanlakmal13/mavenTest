package com.example.demo1;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    //private OpenTwitterPage page = new OpenTwitterPage();

    @BeforeMethod
    static void setUp(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities = capabilities;

//        if (browserName.equals("chrome")){
//            WebDriverManager.chromedriver().setup();
//            capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//        }
//        else if (browserName.equals("firefox")){
//            WebDriverManager.firefoxdriver().setup();
//            capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
//        }
//        else if (browserName.equals("edge")){
//            //WebDriverManager.edgedriver().setup();
//            capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.EDGE);
//        }

//        try {
//            driver = new RemoteWebDriver(new URL(url), capabilities);
//            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

    }

    @Test
    public void openPage() throws InterruptedException {

        open("https://twitter.com/i/flow/login");

        //page.userNameInput();
        Thread.sleep(6000);
        //page.passwordInput();
        //Thread.sleep(60000);
        //page.tweet();

        //page.openProfile();

        //page.openTweet();

       //Thread.sleep(6000);

    }
}