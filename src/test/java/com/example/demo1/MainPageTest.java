package com.example.demo1;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    //private OpenTwitterPage page = new OpenTwitterPage();

    @BeforeMethod
    void setUp(){
        Configuration.remote = "http://localhost:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("browserName", "chrome");
        Configuration.browserCapabilities = capabilities;
    }

    @Test
    public void openPage() throws InterruptedException {

        open("https://twitter.com/i/flow/login");
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