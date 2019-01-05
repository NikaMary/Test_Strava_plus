package org.mytests.tests.example;

import org.mytests.uiobjects.example.entities.User;
import org.testng.annotations.Test;

import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebBrowsers;
import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.loginPage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.userPage;
//import static org.mytests.uiobjects.example.site.JDIExampleSite.userPageSt;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;

public class SimpleTest extends TestsInit {

   @Test
    public void loginTest() {
        loginPage.open();
        login(new User());
        homePage.open();
        homePage.checkOpened();
        homePage.clearCache();
    }
    
     
   @Test
   public void wrongLoginTest() {
	   homePage.open();
	   homePage.clearCache();
       String name = "123";
       String password = "123"; 
	   loginPage.open();
       login(new User(name, password));
       //homePage.open();
       //homePage.checkOpened();
       loginPage.checkOpened();
       //homePage.clearCache();
       //System.out.println("Hi");
   
   }
    
}