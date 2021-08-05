package stepDefinitions;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.PageClass;
import util.TestBase;

public class StepDefinition extends TestBase{
	
	private Logger logger = LoggerFactory.getLogger(StepDefinition.class);
	PageClass pageClass;
	TestBase testBase;
	
	
	 @Given("^User opens the browser$")
	 public void user_opens_the_browser() throws Throwable {
		 testBase= new TestBase();
		 TestBase.initialization();
	 }

	 @Then("^Salesforce Developers Landing page is displayed$")
	 public void salesforce_Developers_Landing_page_is_displayed() throws Throwable {
		 pageClass= new PageClass();
	     String pageTitle=driver.getTitle();
	     logger.info("Page Title is: "+pageTitle);
	     System.out.println("Page Title is: "+pageTitle);
//	     Assert.assertEquals(pageTitle, "Introducing Lightning Web Components - Salesforce Lightning Component Library");
		 WebDriverWait wait= new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.TopicTitle));
		 Assert.assertTrue(pageClass.TopicTitle.isDisplayed());
		 logger.info("User is on Salesforce Developers Landing page");
	     System.out.println("User is on Salesforce Developers Landing page");
	     
	 }

	 @Then("^Switch to Component Reference tab$")
	 public void switch_to_Component_Reference_tab() throws Throwable {
	     pageClass= new PageClass();
	     WebDriverWait wait= new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.ComponentRefTab));
		 logger.info("Component Reference tab is displayed");
	     System.out.println("Component Reference tab is displayed");
	     JavascriptExecutor executor = (JavascriptExecutor)driver;
	     executor.executeScript("arguments[0].click();", pageClass.ComponentRefTab);
	     logger.info("Switched to Component Ref tab");
	     System.out.println("Switched to Component Ref tab");
	 }

	 @Then("^Search in Quick Find for datatable$")
	 public void search_in_Quick_Find_for_datatable() throws Throwable {
		 pageClass= new PageClass();
		 WebDriverWait wait= new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.QuickFindSearch));
		 pageClass.QuickFindSearch.sendKeys("datatable");
		 logger.info("datatable searched");
		 System.out.println("datatable searched");
	 }

	 @Then("^Under Lightning Web Components, click on the Components>lightning>datatable on the left menu panel$")
	 public void under_Lightning_Web_Components_click_on_the_Components_lightning_datatable_on_the_left_menu_panel() throws Throwable {
		 pageClass= new PageClass();
		 pageClass.LWBdatatableLink.click();
		 logger.info("Clicked on Lightning Web Components>COMPONENTS>lightning>datatable");
		 System.out.println("Clicked on Lightning Web Components>COMPONENTS>lightning>datatable");
	 }

	 @Then("^Under Example tab on the main pane > select Datatable from Inline Edit from the dropdown$")
	 public void under_Example_tab_on_the_main_pane_select_Datatable_from_Inline_Edit_from_the_dropdown() throws Throwable {
		 pageClass= new PageClass();
		 WebDriverWait wait= new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.DropdownLink));
		 pageClass.DropdownLink.click();
		 logger.info("Dropdown is opened");
		 System.out.println("Dropdown is opened");
		 Thread.sleep(2000);
		 pageClass.DatatableWithInlineEdit.click();
		 logger.info("Selected dropdown value 'Datatable with Inline Edit'");
		 System.out.println("Selected dropdown value 'Datatable with Inline Edit'");
	 }

	 @Then("^Click on the Run button$")
	 public void click_on_the_Run_button() throws Throwable {
		 pageClass= new PageClass();
		 pageClass.RunButton.click();
		 logger.info("Clicked on Run button");
		 System.out.println("Clicked on Run button");
	 }

	 @Then("^Under the section Preview > Edit/Update the values for all the columns in third row in the table by clicking on the pencil icon$")
	 public void under_the_section_Preview_Edit_Update_the_values_for_all_the_columns_in_third_row_in_the_table_by_clicking_on_the_pencil_icon() throws Throwable {
		 pageClass= new PageClass();
		 driver.switchTo().frame("preview");
		 WebDriverWait wait= new WebDriverWait(driver, 120);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.PreviewHeader));
		 Assert.assertTrue(pageClass.PreviewHeader.isDisplayed());
		 logger.info("Preview Header is displayed");
		 System.out.println("Switched to table frame");
		 Thread.sleep(3000);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
	     executor.executeScript("arguments[0].click();", pageClass.ThirdRowCheckbox);
		 wait.until(ExpectedConditions.elementToBeClickable(pageClass.LabelColn));
		 Assert.assertTrue(pageClass.LabelColn.isDisplayed());
		 System.out.println("Label Column displayed");
	 }
	

}
