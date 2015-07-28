package com.eis.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eis.demo.share.BaseCucumber;

public class IssuesPage {

	public  Boolean isIssueCreated(String issueTitle) throws InterruptedException {
		 WebDriver driver = BaseCucumber.getWebDriver();
		//("//table[contains(@class, 'list issues')]/tbody/tr[3]/td[6]")
		//("//table[contains(@class, 'list issues')]/tbody/tr/td[6]")
		//("//table[contains(@class, 'list issues')]/tbody/tr[3]/td[@class='subject']")
		//("//table[contains(@class, 'list issues')]/tbody/tr[3]/td[@class='subject']")
		//("//table[contains(@class, 'list issues')]/tbody/tr/td[@class='subject']")
		//("//div[(@id='main-menu')]/ul/li")
		//("//div[(@id='main-menu')]/ul/li[5]")
		//("//div[(@id='main-menu')]/ul/li[5]/descendant::a")//following-sibling::input[2] or parent::input
		
		Thread.sleep(5000);
		int count = 0;
		boolean match;
		
		List<WebElement> list = driver.findElements(By.xpath("//table[contains(@class, 'list issues')]/tbody/tr/td[@class='subject']"));
		System.out.println(list.size());
		for (WebElement linkList : list) {
			
		    if (linkList.getText().contains(issueTitle)){
		    	count++;
		    }
		}
		System.out.println(count);
		if (count >= 1)
			 match = true;
		else
			match = false;
		
		return match;	
	}
}
