package com.eis.demo.share;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eis.demo.pages.HomePage;

public class BasePage extends BaseCucumber {

	protected static String baseUrl = "http://localhost:3000/";

	public HomePage gotoHomePage() {
		WebDriver driver = BaseCucumber.getWebDriver();
		driver.navigate().to(baseUrl);
		return PageFactory.initElements(driver, HomePage.class);

	}

	public void clickButton(WebElement obj) {
		WebElement wait = (new WebDriverWait(driver, 35)).until(ExpectedConditions.visibilityOf(obj));
		if (obj.isDisplayed() && obj.isEnabled()) {
			obj.click();
		}
	}

	public void clickButton(WebElement obj, String buttonId) {
		if (obj != null) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementByName('$buttonId'.click();");
		}
	}

	public void setFieldValue(WebElement obj, String value) {
		WebElement wait = (new WebDriverWait(driver, 35)).until(ExpectedConditions.visibilityOf(obj));
		if (obj.isDisplayed() && obj.isEnabled()) {
			obj.sendKeys(value);
			// sendKeys(Keys.RETURN);
			// obj.sendKeys(Keys.TAB);
		}
	}

	public void selectCheckBox(WebElement obj) {
		WebElement wait = (new WebDriverWait(driver, 35)).until(ExpectedConditions.visibilityOf(obj));
		if (obj.getAttribute("checked") == null)
			obj.click();

	}

	public void unselectCheckBox(WebElement obj) {
		WebElement wait = (new WebDriverWait(driver, 35)).until(ExpectedConditions.visibilityOf(obj));
		if (obj.getAttribute("Checked") != null)
			obj.click();

	}

	public void selectDropListValue(WebElement obj, String value) {
		WebElement wait = (new WebDriverWait(driver, 35)).until(ExpectedConditions.visibilityOf(obj));
		if (obj.isDisplayed() && obj.isEnabled()) {
			Select dropDownList = new Select(obj);
			dropDownList.selectByVisibleText(value);
		}
	}
}
