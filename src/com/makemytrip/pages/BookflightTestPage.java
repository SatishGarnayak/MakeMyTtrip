package com.makemytrip.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BookflightTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "Fromsourcelist")
	private QAFWebElement fromsourcelist;
	@FindBy(locator = "Selectcity")
	private QAFWebElement selectcity;
	@FindBy(locator = "Tocity")
	private QAFWebElement tocity;
	@FindBy(locator = "Fromdate")
	private QAFWebElement fromdate;
	@FindBy(locator = "Todate")
	private QAFWebElement todate;
	@FindBy(locator = "Clickonsearch")
	private QAFWebElement clickonsearch;
	@FindBy(locator = "Datelist")
	private QAFWebElement datelist;
	@FindBy(locator = "Enterday")
	private QAFWebElement enterday;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFromsourcelist() {
		return fromsourcelist;
	}

	public QAFWebElement getSelectcity() {
		return selectcity;
	}

	public QAFWebElement getTocity() {
		return tocity;
	}

	public QAFWebElement getFromdate() {
		return fromdate;
	}

	public QAFWebElement getTodate() {
		return todate;
	}

	public QAFWebElement getClickonsearch() {
		return clickonsearch;
	}

	public QAFWebElement getDatelist() {
		return datelist;
	}

	public QAFWebElement getEnterday() {
		return enterday;
	}

}
