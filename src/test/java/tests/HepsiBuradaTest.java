package tests;
import pages.HepsiBuradaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBaseFinal;
import java.util.List;


public class HepsiBuradaTest extends TestBaseFinal {

    HepsiBuradaPage hepsiBuradaPage= new HepsiBuradaPage();

    @Test
    public void hepsiBurada(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburada_link"));
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals("Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com", title);
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburada_login"));
        hepsiBuradaPage.ePostaAdresi.sendKeys(ConfigurationReader.getProperty("hepsiburadaEmail"));
        hepsiBuradaPage.sifre.sendKeys(ConfigurationReader.getProperty("hepsiburadaSifre"));
        hepsiBuradaPage.girisyapButonu.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hepsiBuradaPage.sifreTekrari.sendKeys("27625434aA");
        hepsiBuradaPage.girisyapbutonuTekrari.click();
        hepsiBuradaPage.searchAlani.click();
        hepsiBuradaPage.searchAlani.sendKeys("samsung");
        hepsiBuradaPage.araButonu.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
      }
        hepsiBuradaPage.telefon.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hepsiBuradaPage.cepTelefonu.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sonucSayisi = hepsiBuradaPage.samsungsonucSayisi.getText();
        System.out.println("Samsung Cep Telefonu Arama Sayisi >>>>> "+sonucSayisi);
        boolean isSonucSayisi= sonucSayisi.contains("samsung ile ilgili");
        Assert.assertTrue(isSonucSayisi);

        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");

        hepsiBuradaPage.ikinciSayfa.click();

        String url = Driver.getDriver().getCurrentUrl();
        System.out.println("Ikinci Sayfadayiz >>> "+url);

        Assert.assertEquals("https://www.hepsiburada.com/ara?kategori=2147483642_371965&q=samsung&sayfa=2",url);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement>urunListem=Driver.getDriver().findElements(By.xpath("//li[@class='search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex']" ));

          for (int i =0;i<=urunListem.size()-1;i++){
              urunListem.get(4).click();
              break;

          }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hepsiBuradaPage.begenButonu.click();

       System.out.println(hepsiBuradaPage.urunEklendiYazisi.getText());
       Assert.assertTrue(hepsiBuradaPage.urunEklendiYazisi.isDisplayed());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.doubleClick(hepsiBuradaPage.hesabim).perform();

        hepsiBuradaPage.begendiklerim.click();
        Assert.assertTrue(hepsiBuradaPage.seciliUrun.isDisplayed());
        hepsiBuradaPage.sepettekiSeciliUrun.click();
        hepsiBuradaPage.urunleriSepeteEkle.click();
        System.out.println(hepsiBuradaPage.urunlerSepeteEklendiYazisi.getText());
        Assert.assertTrue(hepsiBuradaPage.urunlerSepeteEklendiYazisi.isDisplayed());
        Driver.getDriver().navigate().to("https://checkout.hepsiburada.com/sepetim");
        System.out.println(hepsiBuradaPage.sepetBosYazisi.getText());
        Assert.assertTrue(hepsiBuradaPage.sepetBosYazisi.isDisplayed());




        }




























    }


