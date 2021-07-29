package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {

	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// Home Page 
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePgae;
	// softWare (0)
	@FindBy(xpath = "(//a[contains(text(),'Software')])[2]")
	private WebElement softWare;
	// Desktops (13)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement deskTops;
	// Laptops & NoteBooks (5)
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement lapTopsNoteBooks;
	// Components
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement Components;
	// tablets (1)
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets;
	// softWare (0)
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement softWare2;
	// Phones & PDAs (3)
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phonesPDAs;
	// Cameras (2)
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	// MP3 Players (4)
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement mp3Players;
	// PC System (4)
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement pcImage;
	// PC System (4)
	@FindBy(xpath = "//h2[contains(text(),'Software')]")
	private WebElement softWareText;
	// PC System (4)
	@FindBy(xpath = "//p[contains(text(),'There are no products to list in this category.')]")
	private WebElement thereAreNoProductListInThisCatagory;
	// PC System (4)
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	
	
	
	
	
	
	
	
	

}
