package org.mytests.uiobjects.example.entities;


import com.epam.jdi.tools.DataClass;

public class User extends DataClass<User> {
	
    public String name; 
    public String password;
    
    public User() {
    	this.name = "elanium@gmail.com";
        this.password = "123Laina";
    }
    
    public User(String name, String password) {
    	this.name = name;
        this.password = password;
        }
        
}
