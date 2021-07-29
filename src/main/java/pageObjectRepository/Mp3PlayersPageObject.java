package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {

	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Home Page
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homePgae;
	// Phones & PDAs
	@FindBy(xpath = "(//a[text()='MP3 Players'])[2]")
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
	// Test 11 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 11 (0)')]")
	private WebElement test11;
	// Test 12 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 12 (0)')]")
	private WebElement test12;
	// Test 15 (0)
	@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
	private WebElement test15;
	// Test 16 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 15 (0)')]")
	private WebElement test16;
	// Test 17 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 17 (0)')]")
	private WebElement test17;
	// Test 18 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 18 (0)')]")
	private WebElement test18;
	// Test 19 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 19 (0)')]")
	private WebElement test19;
	// Test 20 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 20 (0)')]")
	private WebElement test20;
	// Test 21 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 21 (0)')]")
	private WebElement test21;
	// Test 22 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 22 (0)')]")
	private WebElement test22;
	// Test 23 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 23 (0)')]")
	private WebElement test23;
	// Test 24 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 24 (0)')]")
	private WebElement test24;
	// Test 4 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 4 (0)')]")
	private WebElement test4;
	// Test 5 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 5 (0)')]")
	private WebElement test5;
	// Test 6 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 6 (0)')]")
	private WebElement test6;
	// Test 7 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 7 (0)')]")
	private WebElement test7;
	// Test 8 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 8 (0)')]")
	private WebElement test8;
	// Test 9 (0)
	@FindBy(xpath = "//a[contains(text(),'- test 9 (0)')]")
	private WebElement test9;
	// PC System Image
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement pcImage;
	// MP3 Players Text
	@FindBy(xpath = "//h2[contains(text(),'MP3 Players')]")
	private WebElement mp3PlayersText;
	// MP3 Players Image
	@FindBy(xpath = "//img[@title='MP3 Players']")
	private WebElement mp3PlayersImage;
	// MP3 Players Description
	@FindBy(xpath = "//p[contains(text(),'Shop Laptop feature only the best laptop deals on ')]")
	private WebElement mp3PlayersDescription;
	// PC System Image
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;

	// Test 11 (0)
	@FindBy(xpath = "(//a[text()='test 11 (0)'])[2]")
	private WebElement test11UnderRefineSearch;
	// Test 12 (0)
	@FindBy(xpath = "(//a[text()='test 12 (0)'])[2]")
	private WebElement test12UnderRefineSearch;
	// Test 15 (0)
	@FindBy(xpath = "(//a[text()='test 15 (0)'])[2]")
	private WebElement test15UnderRefineSearch;
	// Test 16 (0)
	@FindBy(xpath = "(//a[text()='test 16 (0)'])[2]")
	private WebElement test16UnderRefineSearch;
	// Test 17 (0)
	@FindBy(xpath = "(//a[text()='test 17 (0)'])[2]")
	private WebElement test17UnderRefineSearch;
	// Test 18 (0)
	@FindBy(xpath = "(//a[text()='test 18 (0)'])[2]")
	private WebElement test18UnderRefineSearch;
	// Test 19 (0)
	@FindBy(xpath = "(//a[text()='test 19 (0)'])[2]")
	private WebElement test19UnderRefineSearch;
	// Test 20 (0)
	@FindBy(xpath = "(//a[text()='test 20 (0)'])[2]")
	private WebElement test20UnderRefineSearch;
	// Test 21 (0)
	@FindBy(xpath = "(//a[text()='test 21 (0)'])[2]")
	private WebElement test21UnderRefineSearch;
	// Test 22 (0)
	@FindBy(xpath = "(//a[text()='test 22 (0)'])[2]")
	private WebElement test22UnderRefineSearch;
	// Test 23 (0)
	@FindBy(xpath = "(//a[text()='test 23 (0)'])[2]")
	private WebElement test23UnderRefineSearch;
	// Test 24 (0)
	@FindBy(xpath = "(//a[text()='test 24 (0)'])[2]")
	private WebElement test24UnderRefineSearch;
	// Test 4 (0)
	@FindBy(xpath = "(//a[text()='test 4 (0)'])[2]")
	private WebElement test4UnderRefineSearch;
	// Test 5 (0)
	@FindBy(xpath = "(//a[text()='test 5 (0)'])[2]")
	private WebElement test5UnderRefineSearch;
	// Test 6 (0)
	@FindBy(xpath = "(//a[text()='test 6 (0)'])[2]")
	private WebElement test6UnderRefineSearch;
	// Test 7 (0)
	@FindBy(xpath = "(//a[text()='test 7 (0)'])[2]")
	private WebElement test7UnderRefineSearch;
	// Test 8 (0)
	@FindBy(xpath = "(//a[text()='test 8 (0)'])[2]")
	private WebElement test8UnderRefineSearch;
	// Test 9 (0)
	@FindBy(xpath = "(//a[text()='test 9 (0)'])[2]")
	private WebElement test9UnderRefineSearch;
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
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement iPodClassicPrice;
	// iPod Classic EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[1]")
	private WebElement iPodClassicEXTax;
	// iPod Classic ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement iPodClassicAddToCartSign;
	// iPod Classic ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement iPodClassicAddToCart;
	// iPod Classic ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement iPodClassicAddToWishList;
	// iPod Classic Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement iPodClassicCompareThisProduct;
	// iPod Nano image
	@FindBy(xpath = "//img[@title='iPod Nano']")
	private WebElement iPodNanoImage;
	// iPod Nano Name
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
	private WebElement iPodNanoName;
	// iPod Nano Description
	@FindBy(xpath = "//p[contains(text(),'Video in your pocket')]")
	private WebElement iPodNanoDescription;
	// iPod Nano Price
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement iPodNanoPrice;
	// iPod Nano EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[2]")
	private WebElement iPodNanoEXTax;
	// iPod Nano ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement iPodNanoAddToCartSign;
	// iPod Nano ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement iPodNanoAddToCart;
	// iPod Nano ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement iPodNanoAddToWishList;
	// iPod Nano Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iPodNanoCompareThisProduct;
	// iPod Shuffle image
	@FindBy(xpath = "//img[@title='iPod Shuffle']")
	private WebElement iPodShuffleImage;
	// iPod Shuffle Name
	@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
	private WebElement iPodShuffleName;
	// iPod Shuffle Description
	@FindBy(xpath = "//p[contains(text(),'Born to be worn')]")
	private WebElement iPodShuffleDescription;
	// iPod Shuffle Price
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement iPodShufflePrice;
	// iPod Shuffle EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[3]")
	private WebElement iPodShuffleEXTax;
	// iPod Shuffle ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement iPodShuffleAddToCartSign;
	// iPod Shuffle ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement iPodShuffleAddToCart;
	// iPod Shuffle ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement iPodShuffleAddToWishList;
	// iPod Shuffle Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement iPodShuffleCompareThisProduct;
	// iPod Touch image
	@FindBy(xpath = "//img[@title='iPod Touch']")
	private WebElement iPodTouchImage;
	// iPod Touch Name
	@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
	private WebElement iPodTouchName;
	// iPod Touch Description
	@FindBy(xpath = "//p[contains(text(),'Revolutionary multi-touch interface')]")
	private WebElement iPodTouchDescription;
	// iPod Touch Price
	@FindBy(xpath = "(//p[@class='price'])[4]")
	private WebElement iPodTouchPrice;
	// iPod Touch EX Tax
	@FindBy(xpath = "(//span[contains(text(),'Ex Tax: $100.00')])[4]")
	private WebElement iPodTouchEXTax;
	// iPod Touch ADD to Cart Sign
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[6]")
	private WebElement iPodTouchAddToCartSign;
	// iPod Touch ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement iPodTouchAddToCart;
	// iPod Touch ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement iPodTouchAddToWishList;
	// iPod Touch Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement iPodTouchCompareThisProduct;
	// Showing 1 to 4 of 4 (1 pages)
	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 4 of 4 (1 Pages)')]")
	private WebElement showingPages;
	
	
	
	
	
	
	
	
	

}
