package com.qount.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class TrackerPage {

	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;

	protected FluentWait<WebDriver> wait;
	private By myTasks = By.xpath("//span[@class='leftTooltiptext' and text()='MY TASKS']/preceding-sibling::i");
	private By firmTasks = By.xpath("//span[@class='leftTooltiptext' and text()='FIRM TASKS']/preceding-sibling::i");

	public TrackerPage(WebDriver driver, FluentWait<WebDriver> wait) {
		this.driver = driver;
		this.wait = wait;
		jsDriver = (JavascriptExecutor) driver;
		ngWebDriver = new NgWebDriver(jsDriver);
	}

	public void goToTrackersPage() {
		javaScriptClick(By.xpath("//div[text()='# 1040']"));
		driver.findElement(myTasks).click();
		driver.findElement(firmTasks).click();

	}

	public void javaScriptClick(By by) {
		WebElement element = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	

}
