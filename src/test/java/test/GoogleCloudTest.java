package test;

import org.testng.annotations.Test;

public class GoogleCloudTest extends PreconditionTest {

    @Test
    public void fillingOutComputeEngineForm(){

        String textSearchField = "Google Cloud Pricing Calculator";
        String textNumberOfInstance = "4";
        String vmClassResult = "VM class: regular";
        String instanceTypeResult = "Instance type: n1-standard-8";
        String regionResult = "Region: Frankfurt";
        String localSsdResult = "Local SSD: 2x375 GiB";
        String totalEstimatedCostPerMonth = "1,082.77";

        mainPage.openPage();
        mainPage.pasteTextIntoSearchField(textSearchField);
        mainPage.searchResultChoose();
       // mainPage.computeEngineTabChoosing();
        mainPage.selectNumberOfInstances(textNumberOfInstance);
        mainPage.selectOperatingSystem();
        mainPage.selectVMClass();
        mainPage.selectInstanceType();
        mainPage.selectGPUs();
        mainPage.selectLocalSSD();
        mainPage.selectDatacenterLocation();
        mainPage.selectCommitedUsage();
        mainPage.clickAddToEstimate();
        mainPage.checkVMClass(vmClassResult);
        mainPage.checkInstanceType(instanceTypeResult);
        mainPage.checkRegion(regionResult);
        mainPage.checklocalSSD(localSsdResult);
        mainPage.checktotalEstimatedCost(totalEstimatedCostPerMonth);
    }

}
