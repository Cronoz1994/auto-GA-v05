package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class OnlineStore extends BasePage {
  @FindBy(name = "email")
  private WebElement usernameInputField;

  @FindBy(name = "password")
  private WebElement passwordInputField;

  @FindBy(css = ".btn-primary.btn-block")
  private WebElement loginBtn;

  @FindBy(css = "mat-card:nth-of-type(1)")
  private WebElement categoryBtn;

  @FindBy(css = "div.main-container > button")
  private WebElement addMachineryBtn;

  @FindBy(css = "div.main-container mat-card mat-card-header button")
  private WebElement deleteMachineryBtn;

  @FindBy(css = "input[formcontrolname='marca']")
  private WebElement brandInputField;

  @FindBy(css = "input[formcontrolname='anio']")
  private WebElement yearInputField;

  @FindBy(css = "input[formcontrolname='horas_uso']")
  private WebElement hoursUseInputField;

  @FindBy(css = "input[formcontrolname='capacidad']")
  private WebElement capacityInputField;

  @FindBy(css = "input[formcontrolname='motor']")
  private WebElement motorInputField;

  @FindBy(css = "input[formcontrolname='price']")
  private WebElement priceInputField;

  @FindBy(css = "input[formcontrolname='model']")
  private WebElement modelInputField;

  @FindBy(css = "textarea[formcontrolname='torre']")
  private WebElement turretInputField;

  @FindBy(css = "button.mat-button[type='submit']")
  private WebElement accepButton;

  @FindBy(css = "mat-select")
  private WebElement boxSelectField;

  @FindBy(css = "input[type='file']")
  private WebElement machineryImageInputField;

  public void setCredentials() {
    String username = PropertyAccessor.getInstance().getUser();
    String password = PropertyAccessor.getInstance().getPassword();

    CommonEvents.setInputField(usernameInputField, username);
    CommonEvents.setInputField(passwordInputField, password);

    CommonEvents.clickButton(loginBtn);
  }

  public void clickCategoryCard() {
    CommonEvents.clickButton(categoryBtn);
  }

  public void clickAddMachineryButton() {
    CommonEvents.clickButton(addMachineryBtn);
  }

  public void clickDeleteMachineryButton() {
    CommonEvents.clickButton(deleteMachineryBtn);
  }

  public void fillFormAddMachinery() {
    CommonEvents.setInputField(brandInputField, "brand test");
    CommonEvents.setInputField(yearInputField, "2018");
    CommonEvents.setInputField(hoursUseInputField, "0");
    CommonEvents.setInputField(capacityInputField, "3 tons");
    CommonEvents.selectDropDown(boxSelectField, new By.ByCssSelector("mat-option[value=Mechanical]"));
    CommonEvents.setInputField(motorInputField, "new");
    CommonEvents.setInputField(priceInputField, "12000");
    CommonEvents.setInputField(modelInputField, "VXS");
    CommonEvents.setInputField(turretInputField, "None");

//    CommonEvents.setInputFieldHidden(machineryImageInputField, "C:\\Users\\Cronoz\\Desktop\\img.jpg");

  }

  public String getInsertedBrandName() {
    return "brand test";
  }

  public void clickAcceptButton() {
    CommonEvents.clickButton(accepButton);
  }
}
