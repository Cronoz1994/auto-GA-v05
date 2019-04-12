package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.OnlineStore;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionOnlineStore {
  private OnlineStore onlineStore;


  @Given("^'Store online' page is loaded$")
  public void phpTravelPageIsLoaded() throws Throwable {
    onlineStore = LoadPage.loginPage();
  }

  @And("^click 'category card' in the 'catalog list'$")
  public void clickCategoryCardInTheCatalog() {
    onlineStore.clickCategoryCard();
  }


  @And("^click 'add Machinery' in the 'category list'$")
  public void clickAddMachinery() {
    onlineStore.clickAddMachineryButton();
  }

  @And("^click 'delete Machinery' in one card of the list$")
  public void clickDeleteMachineryInOneCardOfTheList() {
    onlineStore.clickDeleteMachineryButton();
  }

  @And("^fill the 'form create of machinery' for add machinery$")
  public void fillTheFormForAddMachinery() {
    onlineStore.fillFormAddMachinery();
  }

  @And("^click 'Accept button' in the 'form create of machinery'$")
  public void clickAcceptButtonInTheFormOfMachinery() {
    onlineStore.clickAcceptButton();
  }

  @Then("^verify that one machinery with \"([^\"]*)\" exist in the 'category list'$")
  public void verifyThatOneMachineryWithExistInTheCategoryList(String brandNameExpected) throws Throwable {
    String insertedBrandName = onlineStore.getInsertedBrandName();

    Assert.assertEquals(insertedBrandName, brandNameExpected);
  }
}
