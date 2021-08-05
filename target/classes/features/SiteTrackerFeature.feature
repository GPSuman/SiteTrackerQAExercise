Feature: Site Tracker QA Exercise 

Scenario: Validate end to end flow for SiteTracker QA exercise 
	Given User opens the browser
	Then Salesforce Developers Landing page is displayed
	And  Switch to Component Reference tab 
	And  Search in Quick Find for datatable 
	And  Under Lightning Web Components, click on the Components>lightning>datatable on the left menu panel 
	And  Under Example tab on the main pane > select Datatable from Inline Edit from the dropdown 
	And  Click on the Run button 
	Then Under the section Preview > Edit/Update the values for all the columns in third row in the table by clicking on the pencil icon