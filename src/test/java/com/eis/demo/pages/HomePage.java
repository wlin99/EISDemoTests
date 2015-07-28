package com.eis.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eis.demo.share.BasePage;

public class HomePage extends BasePage {

	@FindBy(className = "login")
	protected WebElement SigninLink;

	public LoginPage SelectLogin() {
		// driver.findElement(By.className("login")).click();
		SigninLink.click();
		return PageFactory.initElements(driver, LoginPage.class);

	}

}
