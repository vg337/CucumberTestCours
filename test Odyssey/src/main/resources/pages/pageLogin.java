package main.resources.pages;

import org.openqa.selenium.By;

import main.resources.GenericPage;


public class pageLogin extends GenericPage{
	//variables
	private By email_user = By.id("email_user");
	private By user_password = By.id("user_password");
	private By btn_cnx = By.className("commit");
	
	//fonctions de base
	public void cliquerBtnSeConnecter() {
		driver.findElement(btn_cnx).click();
	}

	public By getEmail_user() {
		return email_user;
	}

	public void setEmail_user(By email_user) {
		this.email_user = email_user;
	}

	public By getUser_password() {
		return user_password;
	}

	public void setUser_password(By user_password) {
		this.user_password = user_password;
	}

}
