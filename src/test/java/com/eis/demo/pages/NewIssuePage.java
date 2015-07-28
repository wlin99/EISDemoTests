package com.eis.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.eis.demo.share.BasePage;

public class NewIssuePage extends BasePage {
	
	@FindBy(id = "issue_priority_id")
	protected WebElement priority;

	@FindBy(id = "issue_subject")
	protected WebElement issueTitleID;

	@FindBy(id = "issue_description")
	protected WebElement issueDescription;

	@FindBy(name = "commit")
	protected WebElement createButton;

	public void setIssueTitle(String issueTitle) {
		issueTitleID.sendKeys(issueTitle);
	}

	public void setPriority(String inputText) {
		selectDropListValue(priority, inputText);
		//Select dropDownList = new Select(priority);
		//dropDownList.selectByVisibleText(inputText);
	}

	public void setIssueDescription(String issueTitle) {
		issueDescription.sendKeys(issueTitle);
	}

	public IssuesPage gotoIssuespage() {
		createButton.click();
		return PageFactory.initElements(driver, IssuesPage.class);
	}
}

/*
 * public NewIssuePage setCategory(String inputText) { Select dropDownList = new
 * Select(categoryType); dropDownList.selectByValue(inputText.trim()); return
 * new NewIssuePage(driver); }
 */

// @FindBy(xpath = "html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/h1")
// @FindBy(xpath="//input[contains(@id, 'categoryBtnId')]")
// protected WebElement categoryBtnId;
// @FindBy(xpath="//input[contains(@id, 'timeDate')]")
// protected WebElement timeDate;
