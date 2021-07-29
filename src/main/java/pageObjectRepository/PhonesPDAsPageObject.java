package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {

	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Home Page
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePgae;
	// Phones & PDAs
	@FindBy(xpath = "(//a[text()='Phones & PDAs'])[2]")
	private WebElement phonesPDAs;
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
	private WebElement softWare;
	// Phones & PDAs (3)
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phonesPDAs2;
	// Cameras (2)
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	// MP3 Players (4)
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mp3Players;
	// PC System (4)
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement pcImage;
	// phone & PDAs Text
	@FindBy(xpath = "//h2[contains(text(),'Phones & PDAs')]")
	private WebElement phonePDAsText;
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
	@FindBy(id = "compare-total")
	private WebElement sortByDropDown;
	// show
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement show;
	// show DropDown
	@FindBy(id = "input-limit")
	private WebElement showDropDown;
	// HTC Touch HD image
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcTouchHDImage;
	// HTC Touch HD Name
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement htcTouchHDName;
	// HTC Touch HD Information
	@FindBy(xpath = "//p[contains(text(),'HTC Touch - in High Definition. Watch music videos')]")
	private WebElement htcTouchHDDescription;
	// HTC Touch HD Price
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement htcTouchHDPrice;
	// HTC Touch HD EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $100.00')]")
	private WebElement htcTouchHDEXTax;
	// HTC Touch HD ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement htcTouchHDAddToCartSign;
	// HTC Touch HD ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement htcTouchHDDAddToCart;
	// HTC Touch HD ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement htcTouchHDAddToWishList;
	// HTC Touch HD Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement htcTouchHDCompareThisProduct;
	// iPhone image
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	// iPhone Name
	@FindBy(xpath = "//a[contains(text(),'iPhone')]")
	private WebElement iPhoneName;
	// iPhone Information
	@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary new mobile phone that al')]")
	private WebElement iPhoneDescription;
	// iPhone Price
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement iPhonePrice;
	// iPhone EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $101.00')]")
	private WebElement iPhoneEXTax;
	// iPhone ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement iPhoneAddToCartSign;
	// iPhone ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement iPhoneAddToCart;
	// iPhone ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement iPhoneAddToWishList;
	// iPhone Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iPhoneCompareThisProduct;
	// Palm Treo Pro image
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImage;
	// Palm Treo Pro Name
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement palmTreoProName;
	// Palm Treo Pro Information
	@FindBy(xpath = "//p[contains(text(),'Redefine your workday with the Palm Treo Pro smart')]")
	private WebElement palmTreoProDescription;
	// Palm Treo Pro Price
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement palmTreoProPrice;
	// Palm Treo Pro EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $279.99')]")
	private WebElement palmTreoProEXTax;
	// Palm Treo Pro ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement palmTreoProAddToCartSign;
	// Palm Treo Pro ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement palmTreoProAddToCart;
	// Palm Treo Pro ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement palmTreoProAddToWishList;
	// Palm Treo Pro Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement palmTreoProCompareThisProduct;
	// Showing 1 to 3 of 3 (1 pages)
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 3 of 3 (1 Pages)')]")
	private WebElement showingPages;
	
	
	
	
	

}
