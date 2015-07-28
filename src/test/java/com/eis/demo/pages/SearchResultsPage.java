package com.eis.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eis.demo.share.BasePage;

public class SearchResultsPage extends BasePage{

	public boolean verifySearchResults(String searchString) throws Throwable {
		Thread.sleep(5000);
		int count = 0;
		boolean match;
		//driver.findElement(By.xpath("//a[contains(@href, 'issues')]")).click();
		//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Demo')]"));
		//List<WebElement> list = driver.findElements(By.xpath("//a[contains(@href, 'issues')]"));
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(@class, 'highlight')]"));
		System.out.println(list.size());
		for (WebElement linkList : list) {
			
		    if (linkList.getText().contains(searchString)){
		    	count++;
		    }
		}
		
		if (count == list.size())
			 match = true;
		else
			match = false;
		
		return match;
		
	}
	
}
