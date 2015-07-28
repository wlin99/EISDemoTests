package com.eis.demo.tests;

import java.util.List;

import org.junit.Assert;

import com.eis.demo.pages.HomePage;
import com.eis.demo.pages.IssuesPage;
import com.eis.demo.pages.LoginPage;
import com.eis.demo.pages.MainPage;
import com.eis.demo.pages.NewIssuePage;
import com.eis.demo.pages.OverviewPage;
import com.eis.demo.pages.ProjectsPage;
import com.eis.demo.pages.SearchResultsPage;
import com.eis.demo.share.BaseStepDefinition;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Demo2Steps extends BaseStepDefinition {
	
	@After()
	public void takeScreenShotonFail(Scenario scenario) {
		TakeScreenshot(scenario);
	}

	HomePage homePage;
	LoginPage loginPage;
	MainPage mainPage;
	ProjectsPage projectsPage;
	OverviewPage overviewPage;
	NewIssuePage newissuePage;
	SearchResultsPage searchResultsPage;
	IssuesPage issuesPage;

	@Given("^Signin as a user$")
	public void Signin_as_a_user() throws Throwable {

		homePage = new HomePage();
		homePage = homePage.gotoHomePage();

		loginPage = homePage.SelectLogin();
		loginPage.setUsername("admin");
		loginPage.setPassword("admin");
		mainPage = loginPage.gotoMainPage();
	}

	@When("^At Redmine Home, select the Projects Link$")
	public void At_Redmine_Home_select_the_Projects_Link() throws Throwable {
		System.out.println("This is the Projects Page");
		projectsPage = mainPage.selectProjectsLink();
	}

	@Then("^Select a project$")
	public void Select_a_project() throws Throwable {
		System.out.println("This is the project");
		overviewPage = projectsPage.selectAProject("EisDemo");
		issuesPage = overviewPage.selectIssuesLink();
		Assert.assertTrue(issuesPage.isIssueCreated("Redmine ticket for Demo"));
	}

	@Then("^Select the New Issues Link$")
	public void Select_the_New_Issues_Link() throws Throwable {
		newissuePage = overviewPage.selectNewIssuesLink();
		System.out.println("This is the new issues page");
	}

	@Then("^Create a Redmine ticket$")
	public void Create_a_Redmine_ticket(DataTable table) throws Throwable {
		System.out.println("This is the test");
		List<List<String>> data = table.raw();
		newissuePage.setIssueTitle(data.get(1).get(1));
		newissuePage.setPriority(data.get(2).get(1));
		newissuePage.setIssueDescription(data.get(3).get(1));
		newissuePage.gotoIssuespage();

	}

	@Then("^Search for a redmine ticket$")
	public void Search_for_a_redmine_ticket() throws Throwable {
		//driver.findElement(By.id("q")).sendKeys("demo");
		//driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
		searchResultsPage = projectsPage.searchAticket("demo");
		Thread.sleep(5000);
	}

	@Then("^Verify the search result$")
	public void Verify_the_search_result() throws Throwable {
		System.out.println("This is the search result");		
		Assert.assertTrue(searchResultsPage.verifySearchResults("Demo"));
		//searchResultsPage.verifySearchResults("Demo");
	}
	
	@Then("^Close the Browser$")
	public void Close_the_Browser() throws Throwable {
		closeDriver();
	}
	
	@Then("^Close the Browser and Cleanup$")
	public void Close_the_Browser_and_Cleanup() throws Throwable {
		cleanUp();
	}
}
