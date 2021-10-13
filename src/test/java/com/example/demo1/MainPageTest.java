package com.example.demo1;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

public class MainPageTest {

    //private OpenTwitterPage page = new OpenTwitterPage();

    @BeforeAll
    static void beforeAll(){
//        Configuration.remote = "http://localhost:4444/wd/hub";
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("browserName", "chrome");
//        Configuration.browserCapabilities = capabilities;
        Configuration.browser = "firefox";
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
}