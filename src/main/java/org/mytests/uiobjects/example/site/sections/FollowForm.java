package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class FollowForm extends Form<User>{
	
	
	
	
	@Css (".primary.button.btn-primary.follow.fixed-small") public Button followYou; 
	@Css (".primary.button.fixed-small.unfollow") public Button unFollowYou; 
	

	//@FindBy ( id ="notifications-button") public Button followYou; 
	
}
