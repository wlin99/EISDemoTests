package com.eis.demo.share;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.eis.demo.utils.GetProperties;

import cucumber.api.Scenario;

public class BaseStepDefinition extends BaseCucumber {

	public BaseStepDefinition() {
		super();
	}

	public void TakeScreenshot(Scenario scenario) {
		//Path path = Paths.get(GetProperties.Path_ScreenShot, scenario.getClass().getName() + ".png");
		//System.out.println(GetProperties.Path_ScreenShot);
		//System.out.println(scenario.getClass().getName() + ".png");
		//Files.write(path, screenshot, StandardOpenOption.CREATE);
		
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
