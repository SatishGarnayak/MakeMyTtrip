package com.makemytrip.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.makemytrip.pages.*;

public class Clickonwebelement extends WebDriverBaseTestPage<WebDriverTestPage>{
	BookflightTestPage b=new BookflightTestPage();
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	@QAFTestStep(description="Launch the mmt homepage")
	public void launch(){
		driver.get("/");
		driver.manage().window().maximize();
	}
	@QAFTestStep(description="Select fromcity")
	public void selectfromcity (){
		b.getFromsourcelist().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	@QAFTestStep(description="Enter to city")
	public void selecttocity (){
		b.getTocity().sendKeys("pune",Keys.TAB);
		
	}
	@QAFTestStep(description="Click on search")
	public void Clickonsearch(){
		b.getClickonsearch().click();
		Assert.assertEquals(driver.getTitle(),"Flight Search");
		System.out.println("Title of flight search page= "+driver.getTitle());
	}

}
