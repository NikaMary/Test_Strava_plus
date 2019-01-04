package org.mytests.tests.example;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;

import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;
import static org.mytests.uiobjects.example.site.JDIExampleSite.follow;
import static org.mytests.uiobjects.example.site.JDIExampleSite.loginPage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.userPage;

import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.site.JDIExampleSite;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FriendTest extends TestsInit{
	
	@Test
    public void loginAs() {
        loginPage.open();
        login(new User());
        homePage.open();
	}
        
    @Test
    
    public void chekUserPage() {
        
        userPage.open();
        userPage.title().check();
        
    }
    
    @Test
    
    public void followAnybody() {
        
        //userPage.checkOpened();
        follow();
}
	}
	