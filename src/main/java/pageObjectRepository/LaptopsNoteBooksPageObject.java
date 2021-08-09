package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Laptops & NoteBooks
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement lapTopsNoteBooksTab;
	// Show All Laptops & NoteBooks
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLapTopsNoteBooks;
	// Home Page Button
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePage;
	// LapTops & NoteBook
	@FindBy(xpath = "(//a[text()='Laptops & Notebooks'])[2]")
	private WebElement lapTopsNoteBooks2;
	// desktops (13)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement desktops;
	// Laptops & NoteBooks (5)
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement lapTopsNoteBooks5;
	// Macs (0)
	@FindBy(xpath = "//a[contains(text(),'- Macs (0)')]")
	private WebElement macs;
	// Windows (0)
	@FindBy(xpath = "//a[contains(text(),'- Windows (0)')]")
	private WebElement windows;
	// components (2)
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement components;
	// tablets (1)
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tablets;
	// softWare (0)
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement softWare;
	// phoneAndPDAs (3)
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement phoneAndPDAs;
	// cameras (2)
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement cameras;
	// mp3Players (4)
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mp3Players;
	// PC Image
	@FindBy(xpath = "(//img[@class='img-responsive'])[1]")
	private WebElement pcImage;
	// LapTops & NoteBooks Name
	@FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
	private WebElement lapTopsNoteBooksName;
	// LapTops & NoteBooks Image
	@FindBy(xpath = "//img[@title='Laptops & Notebooks']")
	private WebElement lapTopsNoteBooksImage;
	// LapTops & NoteBooks Description
	@FindBy(xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
	private WebElement lapTopsNoteBooksDescription;
	// Refine Search
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;
	// mac_1
	@FindBy(xpath = "(//a[text()='Macs (0)'])[2]")
	private WebElement mac_1;
	// windows (0)
	@FindBy(xpath = "(//a[text()='Windows (0)'])[2]")
	private WebElement windows2;
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
	// Sort By dropDown
	@FindBy(id = "input-sort")
	private WebElement sortByDropDown;
	// show
	@FindBy(xpath = "//label[contains(text(),'Show:')]")
	private WebElement show;
	// show DropDown
	@FindBy(id = "input-limit")
	private WebElement showDropDown;
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
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement hpLP3065Price;
	// HP LP3065 EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $100.00')]")
	private WebElement hpLP3065EXTax;
	// HP LP3065 ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement hpLP3065AddToCartSign;
	// HP LP3065 ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement hpLP3065DAddToCart;
	// HP LP3065 ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement hpLP3065AddToWishList;
	// HP LP3065 Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement hpLP3065CompareThisProduct;
	// MacBook image
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBook;
	// MacBook Name
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookName;
	// MacBook Information
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement macBookDescription;
	// MacBook Price
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement macBookPrice;
	// MacBook EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $500.00')]")
	private WebElement macBookEXTax;
	// MacBook ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement macBookAddToCartSign;
	// MacBook ADD to Cart
//	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
//	private WebElement macBookAddToCart;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement macBookAddToCart;
	// MacBook ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement macBookAddToWishList;
	// MacBook Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement macBookCompareThisProduct;
	// MacBook Air image
	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	// MacBook Air Name
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement macBookAirName;
	// MacBook Air Information
	@FindBy(xpath = "//p[contains(text(),'MacBook Air is ultrathin, ultraportable, and ultra')]")
	private WebElement macBookAirDescription;
	// MacBook Air Price
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement macBookAirPrice;
	// MacBook Air EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $1,000.00')])[1]")
	private WebElement macBookAirEXTax;
	// MacBook Air ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement MacBookAirAddToCartSign;
	// MacBook Air ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement MacBookAirAddToCart;
	// MacBook Air ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement MacBookAirAddToWishList;
	// MacBook Air Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement MacBookAirCompareThisProduct;
	// MacBook Pro image
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookPro;
	// MacBook Pro Name
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookProName;
	// MacBook Pro Description
	@FindBy(xpath = "//p[contains(text(),'Latest Intel mobile architecture')]")
	private WebElement macBookProDescription;
	// MacBook Pro Price
	@FindBy(xpath = "(//p[@class='price'])[4]")
	private WebElement macBookProPrice;
	// MacBook Pro EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $2,000.00')]")
	private WebElement macBookProEXTax;
	// MacBook Pro ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[6]")
	private WebElement macBookProAddToCartSign;
	// MacBook Pro ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement macBookProAddToCart;
	// MacBook Pro ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement macBookProAddToWishList;
	// MacBook Pro Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement macBookProCompareThisProduct;
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
	@FindBy(xpath = "(//p[@class='price'])[5]")
	private WebElement sonyVAIOPrice;
	// Sony VAIO EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $1,000.00')])[2]")
	private WebElement sonyVAIOEXTax;
	// Sony VAIO ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[7]")
	private WebElement sonyVAIOAddToCartSign;
	// Sony VAIO ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
	private WebElement sonyVAIOAddToCart;
	// Sony VAIO ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement sonyVAIOAddToWishList;
	// Sony VAIO Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[5]")
	private WebElement sonyVAIOCompareThisProduct;
	// Showing 1 to 5 of 5 (1 Pages)
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 5 of 5 (1 Pages)')]")
	private WebElement showingPages;
	// Showing 1 to 5 of 5 (1 Pages)
	@FindBy(xpath = "//div[contains(text(),'Success: You have added ')]")
	private WebElement SuccessMessage;
	// Showing 1 to 5 of 5 (1 Pages)
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement itemCart;
	// Showing 1 to 5 of 5 (1 Pages)
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeItem;
	// Showing 1 to 5 of 5 (1 Pages)
	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//div[contains(text(),' You must ')]")
	private WebElement userMustLoginOrCreateAccount;
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement macBookProTagPrice;
	
	
	
	
	public void clickOnLaptopAndNoteBooksTab(){
		WebDriverUtility.clickOnElement(lapTopsNoteBooksTab);
	}
	
	public void clickOnShowAllLaptopAndNoteBooksOption(){
		WebDriverUtility.clickOnElement(showAllLapTopsNoteBooks);
	}
	public void clickOnMacBookItem(){
		WebDriverUtility.clickOnElement(macBook);
	}
	public void clickOnAddToCartButton(){
		WebDriverUtility.clickOnElement(macBookAddToCart);
	}
	public String UserSeeSuccessMessage(){
		String message =SuccessMessage.getText();
		return message;
	}
	public String userShouldSeeOneItemInTheCart(){
		String message = itemCart.getText();
		return message;
	}
	public void clickOnCartOption(){
		WebDriverUtility.clickOnElement(itemCart);
	}
	public void clickOnRedButtonToRemoveItemFromCart(){
		WebDriverUtility.clickOnElement(removeItem);
	}
	
	public String itemShouldBeRemovedFromTheCart(){
		String message = itemCart.getText();
		return message;
	}
	
	public void clickOnMacBookProductComparison(){
		WebDriverUtility.clickOnElement(macBookCompareThisProduct);
	}
	public void clickOnMacBookAirProductComparison(){
		WebDriverUtility.clickOnElement(MacBookAirCompareThisProduct);
	}
	public void userShouldSeeAMessageYouHvaeAddedMacBookToComparison(){
		WebDriverUtility.getText(SuccessMessage);
	}
	public void clickOnProductComparisonLink(){
		WebDriverUtility.clickOnElement(productComparisonLink);
	}
	public void userShouldSeeProductComparisonChart(){
		WebDriverUtility.screenShot();
	}
	
	public void clickOnAddSonyVAIOToWishList(){
		WebDriverUtility.clickOnElement(sonyVAIOAddToWishList);
	}
	public void userMustLoginOrCreateAcoountMesssage(){
		WebDriverUtility.getText(userMustLoginOrCreateAccount);
	}
	
	public void clickOnMacBookPro(){
		WebDriverUtility.clickOnElement(macBookPro);
	}
	
	public String userMustShouldSeeThePriceTagIsPresent(){
		String message  = macBookProTagPrice.getText();
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
