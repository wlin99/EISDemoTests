package com.eis.demo.share;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCucumber {

	public static WebDriver driver;

	private static void setUpIE() {

		File file = new File("C:/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();
		driver = configureDriver(driver);

	}

	protected static WebDriver configureDriver(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//WebElement wait = (new WebDriverWait(driver, 35))
               // .until(ExpectedConditions.visibilityOf(questionName));
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getWebDriver() {
		if (driver == null) {
			setUpIE();
		}
		return driver;
	}

	public static void closeDriver() throws Exception {
		driver.quit();
		setUpIE();
	}
	
	public void cleanUp() throws Exception {
		driver.quit();
	}

}
