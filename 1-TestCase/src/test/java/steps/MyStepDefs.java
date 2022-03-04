package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClairvoyancePage;
import pages.HomePage;

import java.net.MalformedURLException;

public class MyStepDefs {

    public MyStepDefs() throws MalformedURLException {
    }

    HomePage homePage = new HomePage();
    ClairvoyancePage clairvoyancePage = new ClairvoyancePage();

    @When("I open the clairvoyance")
    public void IOpenTheClairvoyance() {
        homePage.clickClairvoyance();
    }

    @And("I press the Clairvoyance progress bar")
    public void IPressTheClairvoyanceProgressBar() {
        clairvoyancePage.pressProgressBar();
    }

    @And("I click on Send")
    public void IClickOnSend() {
        clairvoyancePage.clickSend();
    }

    @And("I click on General")
    public void IClickOnGeneral() {
        clairvoyancePage.clickSelectionGeneral();
    }

    @And("I click on Love")
    public void IClickOnLove() {
        clairvoyancePage.clickSelectionLove();
    }

    @And("I click on CareerMoney")
    public void IClickOnCareerMoney() {
        clairvoyancePage.clickSelectionCareerMoney();
    }

    @And("I click on Health")
    public void IClickOnHealth() {
        clairvoyancePage.clickSelectionHealth();
    }

    @Then("I should see homePage is open")
    public void IShouldSeeHomePageIsOpen() {
        homePage.verifyHomePage();
    }

    @Then("I should see Clairvoyance Topic Page elements")
    public void IShouldSeeClairvoyanceTopicPageElements() {
        clairvoyancePage.verifyTopicPageElements();
    }
}
