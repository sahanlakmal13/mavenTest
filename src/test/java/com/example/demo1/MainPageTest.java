package com.example.demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class MainPageTest {

    //private OpenTwitterPage page = new OpenTwitterPage();

    @BeforeClass
    void beforeAll(){
//        Configuration.remote = "http://localhost:4444/wd/hub";
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("browserName", "chrome");
//        Configuration.browserCapabilities = capabilities;
        browser = "firefox";
    }

    @Test
    void openPage() throws InterruptedException {

        com.codeborne.selenide.Selenide.open("https://twitter.com/i/flow/login");
        System.out.println("hello");
        //page.userNameInput();
        Thread.sleep(6000);
        //page.passwordInput();
        //Thread.sleep(60000);
        //page.tweet();

        //page.openProfile();

        //page.openTweet();

       //Thread.sleep(6000);

    }
    @AfterClass
    public static void logout() {
        closeWebDriver();
    }
}