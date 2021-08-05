package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.TestBase;

public class PageClass extends TestBase {
	
	private static final Logger logger= LoggerFactory.getLogger(PageClass.class);
	
	public PageClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1//span[text()=\"Introducing Lightning Web Components\"]")
	public WebElement TopicTitle;
	
	@FindBy(xpath="//div[@role=\"list\"]//a//span[@title=\"Component Reference\"]")
	public WebElement ComponentRefTab;
	
	@FindBy(xpath="//div//input[@name=\"Quick Find\"]")
	public WebElement QuickFindSearch;
	
	@FindBy(xpath="//h3[text()=\"Lightning Web Components\"]/parent::div//span[text()=\"datatable\"]")
	public WebElement LWBdatatableLink;
	
	@FindBy(xpath="//div[@class=\"slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right\"]")
	public WebElement DropdownLink;
	
	@FindBy(xpath="//div[@role=\"listbox\"]//span[@title=\"Data Table with Inline Edit\"]	")
	public WebElement DatatableWithInlineEdit;
	
	@FindBy(xpath="//lightning-button-group//button")
	public WebElement RunButton;
	
	@FindBy(xpath="//span[text()=\"Select Item 3\"]/parent::label/parent::span//input[@type=\"checkbox\"]")
	public WebElement ThirdRowCheckbox;
	
	@FindBy(xpath="//table[@role=\"grid\"]//tbody/tr[3]//th[@scope]")
	public WebElement ThirdRowLabel;
	
	@FindBy(css=".slds-hint-parent:nth-child(3) .slds-checkbox_faux")
	public WebElement LabelPencilIcon;
	
	@FindBy(xpath="//div[text()=\"Preview\"]")
	public WebElement PreviewHeader;
	
	@FindBy(xpath="//span[@class=\"slds-th__action\"]//span[@title=\"Label\"]")
	public WebElement LabelColn;
	
	@FindBy(xpath="//div[@class=\"slds-col preview-container\"]//iframe[@name=\"preview\"]")
	public WebElement TableFrame;
		
	@FindBy(xpath="//table[@role=\"grid\"]/tbody/tr[3]")
	public WebElement ThirdRow;

}
