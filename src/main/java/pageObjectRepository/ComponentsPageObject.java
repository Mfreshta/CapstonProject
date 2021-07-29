package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// Home Page
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePage;
	// Components
	@FindBy(xpath = "(//a[text()='Components'])[2]")
	private WebElement components;
	// Desktops (13)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement deskTops;
	// Laptops & NoteBooks (5)
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement lapTopsNoteBooks;
	// Components
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement Components2;
	// Mice and TrackBalls (0)
	@FindBy(xpath = "//a[contains(text(),'- Mice and Trackballs (0)')]")
	private WebElement miceAndTrackBalls;
	// Monitors (2)
	@FindBy(xpath = "//a[contains(text(),'- Monitors (2)')]")
	private WebElement monitors;
	// printers (0)
	@FindBy(xpath = "//a[contains(text(),'- Printers (0)')]")
	private WebElement printers;
	// scanners (0)
	@FindBy(xpath = "//a[contains(text(),'- Scanners (0)')]")
	private WebElement scanners;
	// Web Cameras (0)
	@FindBy(xpath = "//a[contains(text(),'- Web Cameras (0)')]")
	private WebElement webCameras;
	// tablets (1)
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets;
	// softWare (0)
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement softWare;
	// Phones & PDAs (3)
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phonesPDAs;
	// Cameras (2)
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	// MP3 Players (4)
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mp3Players;
	// PC System (4)
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement pcImage;
	// Components
	@FindBy(xpath = "//h2[contains(text(),'Components')]")
	private WebElement Components3;
	// Refine Search
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;
	// Mice and TrackBalls (0)
	@FindBy(xpath = "(//a[text()='Mice and Trackballs (0)'])[2]")
	private WebElement miceAndTrackBalls2;
	// Monitors (2)
	@FindBy(xpath = "(//a[text()='Monitors (2)'])[2]")
	private WebElement monitors2;
	// printers (0)
	@FindBy(xpath = "(//a[text()='Printers (0)'])[2]")
	private WebElement printers2;
	// scanners (0)
	@FindBy(xpath = "(//a[text()='Scanners (0)'])[2]")
	private WebElement scanners2;
	// Web Cameras (0)
	@FindBy(xpath = "(//a[text()='Web Cameras (0)'])[2]")
	private WebElement webCameras2;
	
	
	
	
	

}
