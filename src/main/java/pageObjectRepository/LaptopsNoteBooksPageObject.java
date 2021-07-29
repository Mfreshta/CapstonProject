package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Home Page Button
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePage;
	// LapTops & NoteBook
	@FindBy(xpath = "(//a[text()='Laptops & Notebooks'])[2]")
	private WebElement lapTopsNoteBooks;
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
	private WebElement MacBookImage;
	// MacBook Name
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookName;
	// MacBook Information
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Duo processor')]")
	private WebElement MacBookDescription;
	// MacBook Price
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement MacBookPrice;
	// MacBook EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $500.00')]")
	private WebElement MacBookEXTax;
	// MacBook ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement MacBookAddToCartSign;
	// MacBook ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement MacBookAddToCart;
	// MacBook ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement MacBookAddToWishList;
	// MacBook Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
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
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement MacBookAirPrice;
	// MacBook Air EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $1,000.00')])[1]")
	private WebElement MacBookAirEXTax;
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
	private WebElement macBookProImage;
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

	
	
	

}
