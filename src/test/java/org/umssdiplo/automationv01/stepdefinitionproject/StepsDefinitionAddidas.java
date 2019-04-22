package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Home.HeaderMenu;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAddidas {
  private Home home;
  private HeaderMenu headerMenu;

  @Given("^'Addidas' page is loaded$")
  public void addidasPageIsLoaded() {
    home = LoadPage.homePage();
  }

  @And("^'hover' on the 'HOMBRE' option in the 'header' of 'home' page$")
  public void hoverOnTheHOMBREOptionInTheHeaderOfHomePage() {
    headerMenu.hoverHOMBREOption();
  }

}
