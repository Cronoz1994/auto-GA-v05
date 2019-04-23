package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAddidas {
  private Home home;
  private String itemPrice;

  @Given("^'Addidas' page is loaded$")
  public void addidasPageIsLoaded() {
    home = LoadPage.homePage();
  }

  @And("^hover on the 'HOMBRE option' in the 'header' of 'home' page$")
  public void hoverOnTheHOMBREOptionInTheHeaderOfHomePage() {
    home.hoverHOMBREOption();
  }

  @And("^click 'Futbol link' in the colum 'TENIS' of the menu of 'HOMBRE option'$")
  public void clickFutbolLinkInTheColumTENISOfTheMenuOfHOMBREOption() {
    home.selectLinkFutbol();
  }

  @Then("^verify title \"([^\"]*)\" option exist of the 'list of footwear'$")
  public void verifyTitleOptionExistOfTheListOfFootwear(String nameOption) {
    String nameOptionList = home.getTitleOfItemList();

    Assert.assertEquals(nameOptionList, nameOption);
  }

  @And("^get first 'price' of the \"([^\"]*)\" option of the 'list of footwear'$")
  public void getFirstPriceOfTheOptionOfTheListOfFootwear(String nameOption) {
    itemPrice = home.getFirstPriceOfItemList();
  }

  @And("^click of the \"([^\"]*)\" option of the 'list of footwear'$")
  public void clickOfTheOptionOfTheListOfFootwear(String nameOption) {
    home.clickItemList();
  }

  @And("^select of the 'dropdown of sizes' the \"([^\"]*)\" option of the 'cart form'$")
  public void selectOfTheDropdownOfSizesTheOptionOfTheCartForm(String size) {
    home.selectSizeOption(size);
  }

  @And("^click 'AÑADIR AL CARRITO' button of the 'cart form'$")
  public void clickAÑADIRALCARRITOButtonOfTheCartForm() {
    home.clickAddCartButton();
  }

  @Then("^verify that 'CANTIDAD' is equal to \"([^\"]*)\" in the 'cart modal'$")
  public void verifyThatCANTIDADIsEqualToInTheCartModal(String quantity) {
    String quantityCart = home.getQuantityCart();

    Assert.assertEquals(quantityCart, quantity);
  }

  @And("^click 'VER CARRITO' link of the 'cart modal'$")
  public void clickVERCARRITOLinkOfTheCartModal() {
    home.clickShowCartLink();
  }

  @Then("^verify that \"([^\"]*)\" title is displayed in the 'cart show' page$")
  public void verifyThatTitleIsDisplayedInTheCartShowPage(String nameOption) {
    String titleDisplayed = home.getTitleDisplayedInCartShow();

    Assert.assertEquals(titleDisplayed, nameOption);
  }

  @Then("^verify that 'TOTAL DEL PRODUCTO' is equal to \"([^\"]*)\" in the 'cart show' page$")
  public void verifyThatTOTALDELPRODUCTOIsEqualToInTheCartShowPage(String productPrice) {
    String productPriceDisplayed = home.getProductPriceDisplayedInCartShow();

    Assert.assertEquals(productPriceDisplayed, productPrice);
  }

  @Then("^verify that 'TOTAL' is equal to \"([^\"]*)\" in the 'cart show' page$")
  public void verifyThatTOTALIsEqualToInTheCartShowPage(String totalPrice) {
    String totalPriceDisplayed = home.getTotalPriceDisplayedInCartShow();

    Assert.assertEquals(totalPriceDisplayed, totalPrice);
  }

}
