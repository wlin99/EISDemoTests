package com.eis.demo.utils;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.eis.demo.share.BaseCucumber;

public class ScreenshotRunListener extends RunListener {
	
	//protected static GifAssembler gifAssembler = new GifAssembler();
		
	@Override
	public void testFinished(Description description) throws Exception {
		String details = description.getMethodName();
		byte[] screenshot = ((TakesScreenshot) BaseCucumber.getWebDriver())
				.getScreenshotAs(OutputType.BYTES);
		//gifAssembler.addFrame(details, screenshot);
	}
	
}