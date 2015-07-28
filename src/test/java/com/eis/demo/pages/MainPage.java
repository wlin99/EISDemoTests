package com.eis.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eis.demo.share.BasePage;

public class MainPage extends BasePage {

	@FindBy(className = "logot")
	protected WebElement SignOutLink;

	@FindBy(className = "projects")
	protected WebElement ProjectsLink;

	public ProjectsPage selectProjectsLink() {
		// driver.findElement(By.className("projects")).click();
		clickButton(ProjectsLink);
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("document.getElementByClassName('projects').click();");
		return PageFactory.initElements(driver, ProjectsPage.class);
	}

	public HomePage selectsignOutLink() {
		//SignOutLink.click();
		clickButton(ProjectsLink);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
