package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.simple.Css;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends Form<User> {
	@Css("[id=email]") public TextField name;
    @Css("[id=password]") public TextField password;
    //@Css("[id=login-button]") public Button enter;
    @Css(".button.btn-primary") public Button enter;
}
