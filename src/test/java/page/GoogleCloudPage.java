package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoogleCloudPage extends GeneralPage {
    public GoogleCloudPage(WebDriver driver) {
        super(driver);
    }

    private String homePage = "https://cloud.google.com/";
    private By searchField = By.xpath("//input[@aria-label='Search']");
    private By searchResultPricingCalculator = By.xpath("//b[contains(text(), 'Google Cloud Pricing Calculator')]");
            //("//*[@id='___gcse_0']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a/b");
    //("//div[@class='gs-title']/a[@href='https://cloud.google.com/products/calculator']");
   // private By computeEngineTab = By.xpath("//*[@id='mainForm']/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/div/div");
    private By numberOfInstancesField = By.xpath("//*[contains(text(), 'Number of instances')]");
                    //("//*[@id='mainForm']/div[2]/div/md-card/md-card-content/div/div[1]/form/div[1]/div[1]/md-input-container");
                    //("//label[contains(text(), 'Number of instances')]");
                    //("input_78");
    private By operatingSystemField = By.id("select_value_label_1918");
    private By operatingSystemValue = By.xpath("//*[@id='select_option_1928']/div[contains(text(), 'Debian, CentOS, CoreOS, Ubuntu')]");
    private By vmSeriesField = By.id("select_value_label_73");
    private By vmSeriesValue = By.xpath("//*[@id='select_option_218']/div[contains(text(), 'N1')]");
    private By vmClassField = By.id("select_value_label_1919");
    private By vmClassValue = By.xpath("//*[@id='select_option_1941']/div[contains(text(), 'Regular')]");
    private By instanceTypeField = By.id("select_value_label_1922");
    private By instanceTypeValue = By.xpath("//*[@id='select_option_421']/div[contains(text(), 'n1-standard-8')]");
    private By addGPUsCheckbox = By.xpath("//*[@id='mainForm']/div[2]/div/md-card/md-card-content/div/div[1]/form/div[11]/div[1]/md-input-container");
    private By gpuTypeField = By.id("select_454");
    private By gpuTypeValue = By.xpath("//*[@id='select_option_461']/div[contains(text(), 'NVIDIA Tesla V100')]");
    private By numberOfGpusField = By.id("select_value_label_453");
    private By numberOfGpusValue = By.xpath("//*[@id='select_option_465']/div[contains(text(), '1')]");
    private By localSsdField = By.id("select_value_label_415");
    private By localSsdValue = By.xpath("//*[@id='select_option_442']/div[contains(text(), '2x375 GB')]");
    private By datacenterLocationField = By.id("select_value_label_76");
    private By datacenterLocationValue = By.xpath("//*[@id='select_option_239']/div[contains(text(), 'Frankfurt')]");
    private By commitedUsageField = By.id("select_value_label_77");
    private By commitedUsageValue = By.xpath("//*[@id='select_option_116']/div[contains(text(), '1 Year')]");
    private By addToEstimateButton = By.xpath("//*[@id='mainForm']/div[2]/div/md-card/md-card-content/div/div[1]/form/div/button[contains(text(), 'Add to Estimate')]");
   // private By totalEstimatedCost = By.xpath("//div[@class='md-list-item-text']/b[contains(text(), 'Estimated Component Cost')]");
    private By estimateResultBox = By.id("resultBlock");

    public void openPage(){
        driver.get(homePage);
    }
    public void pasteTextIntoSearchField(String textSearchField) {
        driver.findElement(searchField)
                .click();
        WebElement searchFieldInput = driver.findElement(searchField);
        searchFieldInput.sendKeys(textSearchField);
        searchFieldInput.sendKeys(Keys.ENTER);
    }
    public void searchResultChoose() {
        driver.findElement(searchResultPricingCalculator)
                .click();
    }
   // public void computeEngineTabChoosing() {
   //     driver.findElement(computeEngineTab)
   //             .click();
  //  }
    public void selectNumberOfInstances(String textNumberOfInstance) {
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfInstancesField));
        driver.findElement(numberOfInstancesField)
                .sendKeys(textNumberOfInstance);
    }
    public void selectOperatingSystem() {
        driver.findElement(operatingSystemField)
                .click();
        driver.findElement(operatingSystemValue)
                .click();
    }
    public void selectVMClass() {
        driver.findElement(vmSeriesField)
                .click();
        driver.findElement(vmSeriesValue)
                .click();
        driver.findElement(vmClassField)
                .click();
        driver.findElement(vmClassValue)
                .click();
    }
    public void selectInstanceType() {
        driver.findElement(instanceTypeField)
                .click();
        driver.findElement(instanceTypeValue)
                .click();
    }
    public void selectGPUs() {
        driver.findElement(addGPUsCheckbox)
                .click();
        driver.findElement(gpuTypeField)
                .click();
        driver.findElement(gpuTypeValue)
                .click();
        driver.findElement(numberOfGpusField)
                .click();
        driver.findElement(numberOfGpusValue)
                .click();
    }
    public void selectLocalSSD() {
        driver.findElement(localSsdField)
                .click();
        driver.findElement(localSsdValue)
                .click();
    }
    public void selectDatacenterLocation() {
        driver.findElement(datacenterLocationField)
                .click();
        driver.findElement(datacenterLocationValue)
                .click();
    }
    public void selectCommitedUsage() {
        driver.findElement(commitedUsageField)
                .click();
        driver.findElement(commitedUsageValue)
                .click();
    }
    public void clickAddToEstimate() {
        driver.findElement(addToEstimateButton)
                .click();
    }
    public void checkVMClass(String vmClassResult) {
        String isExist = driver.findElement(estimateResultBox)
                .getText();
        Assert.assertEquals(isExist, vmClassResult);
    }
    public void checkInstanceType(String instanceTypeResult) {
        String isExist = driver.findElement(estimateResultBox)
                .getText();
        Assert.assertEquals(isExist, instanceTypeResult);
    }
    public void checkRegion(String regionResult) {
        String isExist = driver.findElement(estimateResultBox)
                .getText();
        Assert.assertEquals(isExist, regionResult);
    }
    public void checklocalSSD(String localSsdResult) {
        String isExist = driver.findElement(estimateResultBox)
                .getText();
        Assert.assertEquals(isExist, localSsdResult);
    }
    public void checktotalEstimatedCost(String totalEstimatedCostPerMonth) {
        String isExist = driver.findElement(estimateResultBox)
                .getText();
        Assert.assertEquals(isExist, totalEstimatedCostPerMonth);
    }

}
