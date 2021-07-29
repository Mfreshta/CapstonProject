package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base {

	public TablestPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Home Page
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePage;
	// tablets (1)
	@FindBy(xpath = "(//a[text()='Tablets'])[2]")
	private WebElement tablets;
	// Desktops (13)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement deskTops;
	// Laptops & NoteBooks (5)
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement lapTopsNoteBooks;
	// Components
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement Components2;
	// tablets (1)
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets2;
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
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement pcImage;
	// Tablets Text
	@FindBy(xpath = "//h2[contains(text(),'Tablets')]")
	private WebElement tabletsText;
	// list
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement list;
	// grid
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement grid;
	// productCompare
	@FindBy(id = "compare-total")
	private WebElement productCompare;
	// sortBy
	@FindBy(xpath = "//label[contains(text(),'Sort By:')]")
	private WebElement sortBy;
	// SortBy dropDown
	@FindBy(id = "input-sort")
	private WebElement sortByDropDown;
	// show
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement show;
	// show DropDown
	@FindBy(id = "input-limit")
	private WebElement showDropDown;
	// samsung Galaxy Tab 10.1 image
	@FindBy(xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTab10_1Image;
	// samsung Galaxy Tab 10.1 Name
	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement samsungGalaxyTab10_1Name;
	// samsung Galaxy Tab 10.1 Information
	@FindBy(xpath = "//p[contains(text(),'Samsung Galaxy Tab 10.1, is the world’s thinnest t')]")
	private WebElement samsungGalaxyTab10_1Description;
	// samsung Galaxy Tab 10.1 Price
	@FindBy(xpath = "//p[@class='price']")
	private WebElement samsungGalaxyTab10_1Price;
	// samsung Galaxy Tab 10.1 EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $199.99')]")
	private WebElement samsungGalaxyTab10_1EXTax;
	// samsung Galaxy Tab 10.1 ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement samsungGalaxyTab10_1AddToCartSign;
	// samsung Galaxy Tab 10.1 ADD to Cart
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement samsungGalaxyTab10_1AddToCart;
	// samsung Galaxy Tab 10.1 ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement samsungGalaxyTab10_1AddToWishList;
	// samsung Galaxy Tab 10.1 Compare This Product
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement samsungGalaxyTab10_1CompareThisProduct;
	// Showing 1 to 1 of 1 (1 pages)
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 1 of 1 (1 Pages)')]")
	private WebElement showingPages;
	
	
	
	
	
	

}
