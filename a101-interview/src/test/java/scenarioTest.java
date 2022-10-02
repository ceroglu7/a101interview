import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Variables.addAdressPage;
import Variables.choosingKneeSocks;
import Variables.productPage;
import Variables.productContinuou;
import Variables.payingPage;
import Variables.homePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class scenarioTest {
    protected WebDriver driver;
    addAdressPage addadresspage=new addAdressPage();
    productContinuou productcontinuou=new productContinuou();
    productPage productpage= new productPage();
    choosingKneeSocks choosingkneesocks= new choosingKneeSocks();
    payingPage payingpage=new payingPage();
    homePage homepage=new homePage();





    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driverFolder/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");
    }



    @Test
    public void scenario() throws InterruptedException{
        homePage();
        kadinIcGiyim();
        dizaltiCorap();
        productPage();
        continuou();
        adressAdd();
        carGo();
        payIng();
    }
    public static String randomPhoneNumber (){
        Random randI = new Random();
        long origin= 000000000;
        long bound=999999999;
        long myRandInt = randI.nextLong(origin, bound);
        return "1"+myRandInt;
    }
    public void homePage() throws InterruptedException{
        driver.findElement(By.id(homepage.buttonAcceptPopUpSelector)).click();
        Thread.sleep( 1000);
        driver.findElement(By.name("search_text")).sendKeys("Kadin");
        Thread.sleep( 1000);
        driver.findElement(By.partialLinkText("İç Giyim")).click();
        Thread.sleep( 2000);
    }
    public void kadinIcGiyim() throws InterruptedException{
        driver.findElement(By.partialLinkText("Dizaltı")).click();
        Thread.sleep( 2000);
    }
    public void dizaltiCorap() throws InterruptedException{
        driver.findElement(By.cssSelector(choosingkneesocks.checkboxBlackSelectionSelector)).click();
        Thread.sleep(2000);
        List<WebElement> col = driver.findElements(By.cssSelector(choosingkneesocks.filteredBlackProductsSelector));
        ArrayList lastList=new ArrayList();
        for (var a:col) {
            if (a.getText().toLowerCase().contains("tükendi"))
                break;
            lastList.add(a.getText());
        }
        int productCount = lastList.size();
        Random randP = new Random();
        int myRandP=randP.nextInt(productCount);
        String myProductText=lastList.get(myRandP).toString();
        String partialText=myProductText.substring(0,40);
        driver.findElement(By.partialLinkText(partialText)).click();
    }
    public void productPage() throws InterruptedException{
        driver.findElement(By.cssSelector(productpage.imgColorVerificationInProductPage)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(productpage.buttonAddCartSelector)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(productpage.buttonShowBasketSelector)).click();
        Thread.sleep(2000);
    }
    public void continuou() throws InterruptedException{
        driver.findElement(By.cssSelector(productcontinuou.buttonApproveBasketSelector)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(productcontinuou.buttonContiniouWithoutSignInSelector)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(productcontinuou.textboxEmailSelector)).sendKeys(productcontinuou.myEmail);
        driver.findElement(By.cssSelector(productcontinuou.buttonEmailContiniouSelector)).click();
        Thread.sleep(2000);
    }
    public void adressAdd() throws InterruptedException{
        driver.findElement(By.cssSelector(addadresspage.areaAddNewAdressSelector)).click();
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.textboxAdressNameSelector)).sendKeys("Ev adresim");
        driver.findElement(By.cssSelector(addadresspage.textboxMyNameSelector)).sendKeys("Cihan");
        driver.findElement(By.cssSelector(addadresspage.textboxMySurnameSelector)).sendKeys("Eroğlu");
        driver.findElement(By.cssSelector(addadresspage.textboxMyPhoneSelector)).sendKeys(randomPhoneNumber());
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.comboboxCitiesSelector)).click();
        Thread.sleep( 2000);
        Random randCity = new Random();
        int myRandCity=1+randCity.nextInt(82);
        System.out.println("81 adet ilimiz mevcut. Listeden "+myRandCity+". ilimize tıklandı.");
        String city="#js-orders-modal-container > div > div.modal-content > form > div:nth-child(7) > div:nth-child(1) > div > label > div > select > option:nth-child("+myRandCity+")";
        driver.findElement(By.cssSelector(city)).click();
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.comboboxCountiesSelector)).click();
        Thread.sleep( 2000);
        List<WebElement> cou = driver.findElements(By.cssSelector(addadresspage.countyTag));
        int countyCount = cou.size();
        System.out.println("Seçilen ilimizde "+countyCount+" adet ilçe mevcut.");
        Random randCounty = new Random();
        int myRandCounty=1+randCounty.nextInt(countyCount);
        System.out.println(myRandCounty+". ilçeye tıklandı.");
        String county="#js-orders-modal-container > div > div.modal-content > form > div:nth-child(7) > div:nth-child(2) > div > label > div > select > option:nth-child("+myRandCounty+")";
        driver.findElement(By.cssSelector(county)).click();
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.comboboxNeigbourhoodsSelector)).click();
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.comboboxTheNeigbourhoodSelector)).click();
        driver.findElement(By.cssSelector(addadresspage.textareaAdressTextSelector)).sendKeys(addadresspage.myAdress);
        Thread.sleep( 2000);
        driver.findElement(By.cssSelector(addadresspage.buttonSaveAdressSelector)).click();
        Thread.sleep( 3000);
    }
    public void carGo() throws InterruptedException{
        List<WebElement> cargo = driver.findElements(By.cssSelector(payingpage.checkboxCargoSelector));
        int cargoCount = cargo.size();
        System.out.println(cargoCount+" adet kargo firması opsiyonu mevcut.");
        Random randC = new Random();
        int myRandC=1+randC.nextInt(cargoCount);
        System.out.println(myRandC+". kargo firması seçildi.");
        String myCrg="body > section > section > div > div.checkout-addresses.js-tab-content.active > div > div.col-sm-9 > div > div.continue > form > div.cargo > div.cargo-list > ul > li:nth-child("+myRandC+") > label > div.check > div";
        driver.findElement(By.cssSelector(myCrg)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(payingpage.buttonCargoContinuou)).click();
    }
    public void payIng() {
        if(driver.getPageSource().contains("Masterpass"))
        {
            System.out.println("Başarılı: Ödeme ekranı doğrulandı");
        }
        else
        {
            System.out.println("Hata: Ödeme ekranı doğrulanamadı");
        }
    }

}
