package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaPage {
    public HepsiBuradaPage(){


        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (id="login")
    public WebElement login;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement ePostaAdresi;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement sifre;

    @FindBy (id = "txtPassword")
    public WebElement sifreTekrari;

    @FindBy ( name="btnLogin")
    public WebElement girisyapbutonuTekrari;

    @FindBy (id="btnLogin")
    public WebElement girisyapButonu;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement searchAlani;

    @FindBy (className="SearchBoxOld-buttonContainer")
    public WebElement araButonu;

    @FindBy (xpath = "//*[@id=\"categoryList\"]/li[1]")
    public WebElement telefon;

    @FindBy (xpath = "//*[@id=\"categoryList\"]/li[3]")
    public WebElement cepTelefonu;

    @FindBy (xpath = "//header[@class='container title-wrapper for-suggestion']")
    public WebElement samsungsonucSayisi;

    @FindBy (xpath = "//*[@id=\"pagination\"]/ul/li[2]/a")
    public WebElement ikinciSayfa;

    @FindBy (xpath = " //li[@class='search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex']" )
    public WebElement besinciUrun;

    @FindBy(className = "Like-3yczz")
    public WebElement begenButonu;

    @FindBy(className = "hb-toast-content-holder")
    public WebElement urunEklendiYazisi;

    @FindBy(className="sf-OldMyAccount-PhY-T")
    public  WebElement hesabim;

    @FindBy(xpath = "//a[@title='Beğendiklerim']")
    public WebElement begendiklerim;

    @FindBy(xpath = "//div[@class='so9s9a38cgg hb-eRkjGz dHezNd']")
    public WebElement seciliUrun;

    @FindBy (className="active-radio-button")
    public WebElement sepettekiSeciliUrun;

    @FindBy (className="btn orange-button")
    public WebElement urunleriSepeteEkle;

    @FindBy (className=" hb-toast-text")
    public WebElement urunlerSepeteEklendiYazisi;

    @FindBy (className="product_delete_1zR-0")
    public WebElement urunuSepettenKaldir;

    @FindBy(className ="content_Z9h8v")
    public WebElement sepetBosYazisi;















}
