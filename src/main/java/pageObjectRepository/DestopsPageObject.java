package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DestopsPageObject extends Base {

	public DestopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Desktop
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	// Show All Desktops
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	// Home Page Button
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePageButton;
	// DeskTops
	@FindBy(xpath = "(//a[text()='Desktops'])[2]")
	private WebElement DeskTops;
	// Desktops (13)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement deskTops13;
	// PC (0)
	@FindBy(xpath = "//a[contains(text(),'- PC (0)')]")
	private WebElement pc;
	// mac
	@FindBy(xpath = "//a[contains(text(),'- Mac (1)')]")
	private WebElement mac;
	// lapTopsAndNoteBooks
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement lapTopsAndNoteBooks;
	// componenets
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement componenets;
	// tablets
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets;
	// softWare
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement softWare;
	// phonesAndPDAs
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phonesAndPDAs;
	// cameras
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	// mp3Players
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mp3Players;
	// PC Image
	@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
	private WebElement pcImage;
	// Middle DeskTops Name/text
	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement DesktopsText;
	// Middle DeskTops
//	@FindBy(xpath = "")
//	private WebElement middleDesktopsText;
	// Example Description
	@FindBy(xpath = "//p[contains(text(),'Example of category description text')]")
	private WebElement exampleDescriptionTest;
	// Refine Search
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;
	// pc_0
	@FindBy(xpath = "(//a[text()='PC (0)'])[2]")
	private WebElement pc_0;
	// mac_1
	@FindBy(xpath = "(//a[text()='Mac (1)'])[2]")
	private WebElement mac_1;
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
	// Apple Screen image
	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinema30Screen;
	// Apple Screen Name
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement AppleScreen30Name;
	// Apple Screen Information
	@FindBy(xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]")
	private WebElement AppleCinema30Description;
	// Apple Screen Price
	@FindBy(xpath = "//span[contains(text(),'$110.00')]")
	private WebElement AppleCinema30Price;
	// Apple Screen Old Price
	@FindBy(xpath = "(//span[text()='$122.00'])[1]")
	private WebElement AppleCinema30OldPrice;
	// Apple Screen EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $90.00')]")
	private WebElement AppleCinema30EXTax;
	// Apple Screen ADD to Cart Logo
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement AppleCinema30AddToCartSign;
	// Apple Screen ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement AppleCinema30AddToCart;
	// Apple Screen ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement AppleCinema30AddToWishList;
	// Apple Screen Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement AppleCinema30CompareThisProduct;
	// Canon EOS 5D image
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonEOS5DImage;
	// Canon EOS 5D Name
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement canonEOS5DName;
	// Canon EOS 5D Information
	@FindBy(xpath = "//p[contains(text(),\"Canon's press material for the EOS 5D states that \")]")
	private WebElement canonEOS5DDescription;
	// Canon EOS 5D Price
	@FindBy(xpath = "//span[contains(text(),'$98.00')]")
	private WebElement canonEOS5DPrice;
	// Canon EOS 5D Old Price
	@FindBy(xpath = "(//span[text()='$122.00'])[2]")
	private WebElement canonEOS5DOldPrice;
	// Canon EOS 5D EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $80.00')]")
	private WebElement canonEOS5DEXTax;
	// Canon EOS 5D ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement canonEOS5DAddToCartSign;
	// Canon EOS 5D ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement canonEOS5DAddToCart;
	// Canon EOS 5D ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement canonEOS5DAssToWishList;
	// Canon EOS 5D Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement canonEOS5DCompareThisProduct;
	// HP LP3065 image
	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065Image;
	// HP LP3065 Name
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLP3065Name;
	// HP LP3065 Information
	@FindBy(xpath = "//p[contains(text(),'Stop your co-workers in their tracks with the stun')]")
	private WebElement hpLP3065Description;
	// HP LP3065 Price
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement hpLP3065Price;
	// HP LP3065 EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[3]")
	private WebElement hpLP3065EXTax;
	// HP LP3065 ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement hpLP3065AddToCartSign;
	// HP LP3065 ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement hpLP3065DAddToCart;
	// HP LP3065 ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement hpLP3065AddToWishList;
	// HP LP3065 Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement hpLP3065CompareThisProduct;
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
	@FindBy(xpath = "(//p[@class='price'])[4]")
	private WebElement htcTouchHDPrice;
	// HTC Touch HD EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[2]")
	private WebElement htcTouchHDEXTax;
	// HTC Touch HD ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[6]")
	private WebElement htcTouchHDAddToCartSign;
	// HTC Touch HD ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement htcTouchHDDAddToCart;
	// HTC Touch HD ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement htcTouchHDAddToWishList;
	// HTC Touch HD Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
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
	@FindBy(xpath = "(//p[@class='price'])[5]")
	private WebElement iPhonePrice;
	// iPhone EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $101.00')]")
	private WebElement iPhoneEXTax;
	// iPhone ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[7]")
	private WebElement iPhoneAddToCartSign;
	// iPhone ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
	private WebElement iPhoneAddToCart;
	// iPhone ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement iPhoneAddToWishList;
	// iPhone Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[5]")
	private WebElement iPhoneCompareThisProduct;
	// iPod Classic image
	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	// iPod Classic Name
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassicName;
	// iPod Classic Information
	@FindBy(xpath = "//p[contains(text(),'More room to move')]")
	private WebElement iPodClassicDescription;
	// iPod Classic Price
	@FindBy(xpath = "(//p[@class='price'])[6]")
	private WebElement iPodClassicPrice;
	// iPod Classic EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[3]")
	private WebElement iPodClassicEXTax;
	// iPod Classic ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[8]")
	private WebElement iPodClassicAddToCartSign;
	// iPod Classic ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
	private WebElement iPodClassicAddToCart;
	// iPod Classic ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[7]")
	private WebElement iPodClassicAddToWishList;
	// iPod Classic Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[6]")
	private WebElement iPodClassicCompareThisProduct;
	// MacBook image
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement MacBookImage;
	// MacBook Name
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookName;
	// MacBook Information
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement MacBookDescription;
	// MacBook Price
	@FindBy(xpath = "(//p[@class='price'])[7]")
	private WebElement MacBookPrice;
	// MacBook EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $500.00')]")
	private WebElement MacBookEXTax;
	// MacBook ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[9]")
	private WebElement MacBookAddToCartSign;
	// MacBook ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
	private WebElement MacBookAddToCart;
	// MacBook ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[8]")
	private WebElement MacBookAddToWishList;
	// MacBook Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[7]")
	private WebElement MacBookCompareThisProduct;
	// MacBook Air image
	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement MacBookAirImage;
	// MacBook Air Name
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement MacBookAirName;
	// MacBook Air Information
	@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin, ultraportable, and ultra')]")
	private WebElement MacBookAirDescription;
	// MacBook Air Price
	@FindBy(xpath = "(//p[@class='price'])[8]")
	private WebElement MacBookAirPrice;
	// MacBook Air EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $1,000.00')])[1]")
	private WebElement MacBookAirEXTax;
	// MacBook Air ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[10]")
	private WebElement MacBookAirAddToCartSign;
	// MacBook Air ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[8]")
	private WebElement MacBookAirAddToCart;
	// MacBook Air ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[9]")
	private WebElement MacBookAirAddToWishList;
	// MacBook Air Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[8]")
	private WebElement MacBookAirCompareThisProduct;
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
	@FindBy(xpath = "(//p[@class='price'])[9]")
	private WebElement palmTreoProPrice;
	// Palm Treo Pro EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $279.99')]")
	private WebElement palmTreoProEXTax;
	// Palm Treo Pro ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[11]")
	private WebElement palmTreoProAddToCartSign;
	// Palm Treo Pro ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
	private WebElement palmTreoProAddToCart;
	// Palm Treo Pro ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[10]")
	private WebElement palmTreoProAddToWishList;
	// Palm Treo Pro Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[9]")
	private WebElement palmTreoProCompareThisProduct;
	// Product 8 image
	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement product8Image;
	// Product 8 Name
	@FindBy(xpath = "//a[contains(text(),'Product 8')]")
	private WebElement product8Name;
	// Product 8 Information
	@FindBy(xpath = "//p[contains(text(),'Product 8..')]")
	private WebElement product8Description;
	// Product 8 Price
	@FindBy(xpath = "(//p[@class='price'])[10]")
	private WebElement product8Price;
	// Product 8 EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[4]")
	private WebElement product8EXTax;
	// Product 8 ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[12]")
	private WebElement product8AddToCartSign;
	// Product 8 ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
	private WebElement product8AddToCart;
	// Product 8 ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement product8AddToWishList;
	// Product 8 Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[10]")
	private WebElement product8CompareThisProduct;
	// Samsung SyncMaster 941BW image
	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterImage;
	// Samsung SyncMaster 941BW Name
	@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement samsungSyncMasterName;
	// Samsung SyncMaster 941BW Information
	@FindBy(xpath = "//p[contains(text(),'Imagine the advantages of going big without slowin')]")
	private WebElement samsungSyncMasterDescription;
	// Samsung SyncMaster 941BW Price
	@FindBy(xpath = "(//p[@class='price'])[11]")
	private WebElement samsungSyncMasterPrice;
	// Samsung SyncMaster 941BW EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $200.00')]")
	private WebElement samsungSyncMasterEXTax;
	// Samsung SyncMaster 941BW ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[13]")
	private WebElement samsungSyncMasterAddToCartSign;
	// Samsung SyncMaster 941BW ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
	private WebElement samsungSyncMasterAddToCart;
	// Samsung SyncMaster 941BW ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[12]")
	private WebElement samsungSyncMasterAddToWishList;
	// Samsung SyncMaster 941BW Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[11]")
	private WebElement samsungSyncMasterCompareThisProduct;
	// Sony VAIO image
	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImage;
	// Sony VAIO Name
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement sonyVAIOName;
	// Sony VAIO Description
	@FindBy(xpath = "//p[contains(text(),'Unprecedented power. The next generation of proces')]")
	private WebElement sonyVAIODescription;
	// Sony VAIO Price
	@FindBy(xpath = "(//p[@class='price'])[12]")
	private WebElement sonyVAIOPrice;
	// Sony VAIO EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $1,000.00')])[2]")
	private WebElement sonyVAIOEXTax;
	// Sony VAIO ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[14]")
	private WebElement sonyVAIOAddToCartSign;
	// Sony VAIO ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
	private WebElement sonyVAIOAddToCart;
	// Sony VAIO ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[13]")
	private WebElement sonyVAIOAddToWishList;
	// Sony VAIO Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[12]")
	private WebElement sonyVAIOCompareThisProduct;
	// Showing 1 to 12 of 12 (1 pages)
	@FindBy(xpath = "//div[text()='Showing 1 to 12 of 12 (1 Pages)']")
	private WebElement showingPages;
	@FindBy(id = "input-quantity")
	private WebElement hpLP3065DQuantity;
	@FindBy(id = "button-cart")
	private WebElement hpLP3065DAddToCartLastTime;
	@FindBy(id = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageIsDisplayed;
	
	public void clickOnDesktopsTab() {
		WebDriverUtility.clickOnElement(desktopsTab);
	}
	
	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}
	
	public void userSeeAllItemsArePresentInDesktopPage() {
		WebDriverUtility.screenShot();
	}
	
	public void clickOnAddToCartHPLP3065() {
		WebDriverUtility.clickOnElement(hpLP3065DAddToCart);
	}
	
	public void userAddHpLP3065DQuantity() {
		WebDriverUtility.clearTextUsingSendKeys(hpLP3065DQuantity);
	}
	
	public void clickOnAddToCartHPLP3065LastTime() {
		WebDriverUtility.clickOnElement(hpLP3065DAddToCartLastTime);
	}
	
	public void UserSeeSuccessMessage() {
		WebDriverUtility.isElementDisplayed(successMessageIsDisplayed);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
