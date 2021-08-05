$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/SiteTrackerFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Site Tracker QA Exercise",
  "description": "",
  "id": "site-tracker-qa-exercise",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate end to end flow for SiteTracker QA exercise",
  "description": "",
  "id": "site-tracker-qa-exercise;validate-end-to-end-flow-for-sitetracker-qa-exercise",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Salesforce Developers Landing page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Switch to Component Reference tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Search in Quick Find for datatable",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Under Lightning Web Components, click on the Components\u003elightning\u003edatatable on the left menu panel",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Under Example tab on the main pane \u003e select Datatable from Inline Edit from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Run button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Under the section Preview \u003e Edit/Update the values for all the columns in third row in the table by clicking on the pencil icon",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_opens_the_browser()"
});
formatter.result({
  "duration": 5037607200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.salesforce_Developers_Landing_page_is_displayed()"
});
formatter.result({
  "duration": 2660532300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.switch_to_Component_Reference_tab()"
});
formatter.result({
  "duration": 295641900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.search_in_Quick_Find_for_datatable()"
});
formatter.result({
  "duration": 260617600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.under_Lightning_Web_Components_click_on_the_Components_lightning_datatable_on_the_left_menu_panel()"
});
formatter.result({
  "duration": 365630400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.under_Example_tab_on_the_main_pane_select_Datatable_from_Inline_Edit_from_the_dropdown()"
});
formatter.result({
  "duration": 3291735600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_Run_button()"
});
formatter.result({
  "duration": 78603100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.under_the_section_Preview_Edit_Update_the_values_for_all_the_columns_in_third_row_in_the_table_by_clicking_on_the_pencil_icon()"
});
formatter.result({
  "duration": 24477700800,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//span[text()\u003d\"Select Item 3\"]/parent::label/parent::span//input[@type\u003d\"checkbox\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-F0931AC\u0027, ip: \u0027192.168.43.169\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_192\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat stepDefinitions.StepDefinition.under_the_section_Preview_Edit_Update_the_values_for_all_the_columns_in_third_row_in_the_table_by_clicking_on_the_pencil_icon(StepDefinition.java:116)\r\n\tat ✽.Then Under the section Preview \u003e Edit/Update the values for all the columns in third row in the table by clicking on the pencil icon(src/main/java/features/SiteTrackerFeature.feature:11)\r\n",
  "status": "failed"
});
});