package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class FollowForm {
	
	
	
	
	//@Css (".primary.button.btn-primary.follow.fixed-small")
	@FindBy (css = "body/div.view/div.page.container/div.athlete-profile/div.profile-heading.profile.section/div.row/div.spans5/div.follow-action/button")
	public Button follow; 

}
