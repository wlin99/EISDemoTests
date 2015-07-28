package com.eis.demo.tests;

import com.eis.demo.pages.HomePage;
import com.eis.demo.pages.LoginPage;
import com.eis.demo.pages.MainPage;
import com.eis.demo.share.BaseStepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo1Steps extends BaseStepDefinition {

	@After()
	public void takeScreenShotonFail(Scenario scenario) {
		TakeScreenshot(scenario);
	}

	HomePage homePage;
	LoginPage loginPage;
	MainPage mainPage;

	@Given("^Go to the Home Page$")
	public void Go_to_the_Home_Page() throws Throwable {
		homePage = new HomePage();
		homePage = homePage.gotoHomePage();
	}

	@When("^At the Login Page$")
	public void At_the_Login_Page() throws Throwable {
		loginPage = homePage.SelectLogin();
	}

	@Then("^Enter username and password$")
	public void Enter_username_and_password() throws Throwable {
		loginPage.setUsername("admin");
		loginPage.setPassword("admin");
		mainPage = loginPage.gotoMainPage();
	}

	@Then("^Logout the page$")
	public void Logout_the_page() throws Throwable {
		mainPage.selectsignOutLink();
	}

}
