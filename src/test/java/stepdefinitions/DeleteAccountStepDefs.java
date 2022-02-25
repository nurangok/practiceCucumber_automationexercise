package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

public class DeleteAccountStepDefs {
    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();
    //steps
    @When("kullanici Continue butonuna tiklar")
    public void kullanici_continue_butonuna_tiklar() {
        deleteAccountPage.continueButton.click();
    }
    @Then("kullanicin otutum actigini dogreulamasi gerekir\\(Logged in as username)")
    public void kullanicin_otutum_actigini_dogreulamasi_gerekir_logged_in_as_username() {
        Assert.assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }
    @Then("kullanici Delete Account butonuna tiklar")
    public void kullanici_delete_account_butonuna_tiklar() {
        deleteAccountPage.deleteButton.click();
    }
    @Then("kullanici hesabin silindigini test eder")
    public void kullanici_hesabin_silindigini_test_eder() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));
    }
}



