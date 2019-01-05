package org.mytests.uiobjects.example.site;


import com.epam.jdi.uitests.web.selenium.elements.common.Label;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.pages.UserPage;
import org.mytests.uiobjects.example.site.sections.LoginForm;
import org.mytests.uiobjects.example.site.sections.FollowForm;
import ru.yandex.qatools.allure.annotations.Step;

@JSite("https://www.strava.com")
public class JDIExampleSite extends WebSite {
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static UserPage userPage;
    
    public static LoginForm loginForm;
    public static FollowForm followForm;
    

    //@Css("[id=loginlink]")
   //public static Label loginlink;

    @Step
    public static void login(User user) {
    	//loginlink.click();
        loginForm.loginAs(user);
    	//loginForm.enter.click();
       
                
    }
    
    @Step
    public static boolean CheckTitle ()  {
    	
    	boolean chekResalt;    
    	chekResalt = userPage.title().check();
    	System.out.println(chekResalt);
    	return chekResalt;
    	//System.out.println(followForm.follow.getText());
    	
    }
    
    @Step
    public static void follow() {
    	
    	//System.out.println(followForm.followYou);
    
    	followForm.followYou.click();
    }
    
    @Step
    public static void unFollow() {
    	
    	//System.out.println(followForm.followYou);
    
    	followForm.unFollowYou.click();
    }
    
}
