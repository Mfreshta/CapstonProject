package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {

	// we create a constructor and inside the constructor we will
	// define PageFactory class and call InitLements method
	// to initialize all variables of this class
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	// PageFactory provides @FindBy annotation to find UI elements
	// driver.findElement(by.id('123));
	// @FindBy(id ='123')

	// Currency
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	// Euro
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euro;
	// Pound Sterling
	@FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
	private WebElement poundSterling;
	// US Dollar
	@FindBy(xpath = "//button[contains(text(),'$ US Dollar')]")
	private WebElement usDollar;
	// Phone Logo
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement phoneNumberSign;
	// Phone Number
	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement phoneNumber;
	// MyAccount Logo
	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement myAccountSign;
	// My Account
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccountHeader;
	// Login
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	// Register
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	// WishList logo
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[1]")
	private WebElement wishListSign;
	// Wish List
	@FindBy(xpath = "//span[contains(text(),'Wish List (0)')]")
	private WebElement wishList;
	// Shopping Cart Logo
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
	private WebElement shoppingCartSign;
	// Shopping Cart
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	// Check out Logo
	@FindBy(xpath = "//i[@class='fa fa-share']")
	private WebElement checkoutSign;
	// Check out
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkout;
	// Test Environment
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement testEnvironment;
	// Search Bar
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;
	// Search Button
	@FindBy(xpath = "(//i[@class='fa fa-search'])[1]")
	private WebElement searchButton;
	// Item Cart
	@FindBy(id = "cart-total")
	private WebElement itemCart;
	// Desktop
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	// Show All Desktops
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	// Laptops & NoteBooks
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement lapTopsNoteBooks;
	// Show All Laptops & NoteBooks
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLapTopsNoteBooks;
	// Components
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	// Show All Components
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement showAllComponents;
	// tablets
	@FindBy(xpath = "//a[contains(text(),'Tablets')]")
	private WebElement tablets;
	// SoftWare
	@FindBy(xpath = "//a[contains(text(),'Software')]")
	private WebElement software;
	// Phones & PDSa
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement phonesPDAs;
	// Cameras
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameras;
	// SHow All Cameras
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement showAllCameras;
	// MP3Players
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3Players;
	// Show ALl MP3Players
	@FindBy(xpath = "//a[contains(text(),'Show All MP3 Players')]")
	private WebElement shwoAllMp3Players;
	// MacBook Slide
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement macBookSlide;
	// Phone Slide
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement phoneSlide;
	// Slide Left Side Arrow
	@FindBy(xpath = "(//div[@class='swiper-button-prev'])[1]")
	private WebElement slidepreviousArrow;
	// Slide right side arrow
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[1]")
	private WebElement slideNextArrow;
	// Slide Phone Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active'])[1]")
	private WebElement phoneSlideButton;
	// Slide MacBook Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[1]")
	private WebElement macBookSlideButton;
	// Featured
	@FindBy(xpath = "//h3[contains(text(),'Featured')]")
	private WebElement featuredText;
	// MacBook Computer image
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookComputer;
	// MacBook Name
	@FindBy(xpath = "//a[contains(text(),'MacBook')]")
	private WebElement macBookName;
	// MacBook Information
	@FindBy(xpath = "//p[@xpath='1']")
	private WebElement macBookDescription;
	// MacBook Price
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement macBookPrice;
	// MacBook EX Tax
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $500.00')]")
	private WebElement macBookEXTax;
	// MacBook ADD to Cart Logo
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement macBookAddToCartSign;
	// MacBook ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement macBookAddToCart;
	// MacBook ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement macBookAddToWishList;
	// MacBook Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement macBookCompareThisProduct;
	// iPhone image
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhone;
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
	// iPhone ADD to Cart Logo
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement iPhoneAddToCartLogo;
	// iPhone ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement iPhoneAddToCart;
	// iPhone ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement iPhoneAddToWishList;
	// iPhone Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement iPhoneCompareThisProduct;
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
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement AppleCinema30AddToCartSign;
	// Apple Screen ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement AppleCinema30AddToCart;
	// Apple Screen ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement AppleCinema30AddToWishList;
	// Apple Screen Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
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
	// Canon EOS 5D ADD to Cart logo
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[6]")
	private WebElement canonEOS5DAddToCartSign;
	// Canon EOS 5D ADD to Cart
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement canonEOS5DAddToCart;
	// Canon EOS 5D ADD to WishList
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement canonEOS5DAssToWishList;
	// Canon EOS 5D Compare This Product
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement canonEOS5DImageCompareThisProduct;
	// Bottom Slider Previous Arrow
	@FindBy(xpath = "(//div[@class='swiper-button-prev'])[2]")
	private WebElement bottomSlidePreviousArrow;
	// NFL Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[14]")
	private WebElement NFLLogo;
	// Red Bull Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[15]")
	private WebElement RedBullLogo;
	// SONY Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[16]")
	private WebElement SonyLogo;
	// CocaCola Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[17]")
	private WebElement CocaColaLogo;
	// BurgerKing Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[18]")
	private WebElement BurgerKingLogo;
	// Canon Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[19]")
	private WebElement CanonLogo;
	// Harley Davidson Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[20]")
	private WebElement HarleyDavidsonLogo;
	// Dell Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[21]")
	private WebElement DellLogo;
	// Disnep Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[22]")
	private WebElement DisnepLogo;
	// StarBucks Coffee Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[23]")
	private WebElement StarBucksCoffeeLogo;
	// Nintendo Logo
	@FindBy(xpath = "(//img[@class='img-responsive'])[24]")
	private WebElement NintendoLogo;
	// Bottom Slider Next Arrow
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[2]")
	private WebElement bottomSlideNextArrow;
	// NFL Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[2]")
	private WebElement RedBullSlideButton;
	// Red Bull Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[3]")
	private WebElement SonySlideButton;
	// SONY Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[4]")
	private WebElement CocaColaSlideButton;
	// Coca Cola Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[5]")
	private WebElement BurgerKingSlideButton;
	// Burger King Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[6]")
	private WebElement SlideButton;
	// Canon Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active'])[2]")
	private WebElement CanonSlideButton;
	// Harley Davidson Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[7]")
	private WebElement HarleyDavidsonSlideButton;
	// Dell Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[8]")
	private WebElement DellSlideButton;
	// Disnep Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[9]")
	private WebElement DisnepSlideButton;
	// StarBucks Coffee Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[10]")
	private WebElement StarBucksCoffeeSlideButton;
	// Nindendo Slide Button
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[11]")
	private WebElement NintendoSlideButton;
	// Information
	@FindBy(xpath = "//h5[contains(text(),'Information')]")
	private WebElement information;
	// aboutUs
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	private WebElement aboutUs;
	// deliveryInformation
	@FindBy(xpath = "//a[contains(text(),'Delivery Information')]")
	private WebElement deliveryInformation;
	// privacyPolicy
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;
	// termsAndConditions
	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	private WebElement termsAndConditions;
	// customerServices
	@FindBy(xpath = "//h5[contains(text(),'Customer Service')]")
	private WebElement customerServices;
	// contactUs
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;
	// returns
	@FindBy(xpath = "//a[contains(text(),'Returns')]")
	private WebElement returns;
	// siteMap
	@FindBy(xpath = "//a[contains(text(),'Site Map')]")
	private WebElement siteMap;
	// extras
	@FindBy(xpath = "//h5[contains(text(),'Extras')]")
	private WebElement extras;
	// brands
	@FindBy(xpath = "//a[contains(text(),'Brands')]")
	private WebElement brands;
	// giftCertificates
	@FindBy(xpath = "//a[contains(text(),'Gift Certificates')]")
	private WebElement giftCertificates;
	// affiliate
	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliate;
	// specials
	@FindBy(xpath = "//a[contains(text(),'Specials')]")
	private WebElement specials;
	// MYAccount at the bottom
	@FindBy(xpath = "//h5[contains(text(),'My Account')]")
	private WebElement myAccountFooterText;
	// MyAccount at the bottom
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccountFooter;
	// orderHistory
	@FindBy(xpath = "//a[contains(text(),'Order History')]")
	private WebElement orderHistory;
	// wishList at the bottom
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement wishListAtBottom;
	// newsLetter
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement newsLetter;
	// Powered By OpenCart
	@FindBy(xpath = "//p[@xpath='1']")
	private WebElement poweredByOpenCart;
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
