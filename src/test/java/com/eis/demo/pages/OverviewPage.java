package com.eis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.eis.demo.share.BasePage;

public class OverviewPage extends BasePage {

	public  NewIssuePage selectNewIssuesLink() {
		driver.findElement(By.className("new-issue")).click();
		return PageFactory.initElements(driver, NewIssuePage.class);
	}
	
	public  IssuesPage selectIssuesLink() {
		driver.findElement(By.className("issues")).click();
		return PageFactory.initElements(driver, IssuesPage.class);
	}
}
