package com.eis.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.eis.demo.share.BasePage;

public class ProjectsPage extends BasePage {

	public  OverviewPage selectAProject(String projectName) {
		driver.findElement(By.linkText(projectName)).click();
		return PageFactory.initElements(driver, OverviewPage.class);
	}
	
	public SearchResultsPage searchAticket(String ticketSearch) {
		driver.findElement(By.id("q")).sendKeys("demo");
		driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}
}
