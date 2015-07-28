package com.eis.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eis.demo.share.BasePage;

public class LoginPage extends BasePage {

	@FindBy(linkText = "Sign in")
	protected WebElement LoginLink;

	@FindBy(className = "home")
	protected WebElement HomeLink;

	@FindBy(id = "q")
	protected WebElement Searchlink;

	@FindBy(id = "username")
	protected WebElement UserName;

	@FindBy(id = "password")
	protected WebElement Password;

	@FindBy(name = "login")
	protected WebElement submitLogin;

	public void setUsername(String inputText) {
	    setFieldValue(UserName, inputText );
		//UserName.sendKeys(inputText);
	}

	public String getUsername() {
		return UserName.getText().toString();
	}

	public void setPassword(String inputText) {
		setFieldValue(Password, inputText );
		//Password.sendKeys(inputText);
	}

	public String getPassword() {
		return Password.getText().toString();
	}

	public void submitLogin() {
		//submitLogin.click();
		clickButton(submitLogin);
	}

	public MainPage gotoMainPage() {
		submitLogin();
		return PageFactory.initElements(driver, MainPage.class);
	}

}
