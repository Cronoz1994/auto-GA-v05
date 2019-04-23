package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
  @FindBy(css = "a[href='/hombre']")
  private WebElement hombreOption;

  @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
  private WebElement linkFutbol;

  @FindBy(css = "div[title='Calzado de Fútbol X 18.3 TF']")
  private WebElement itemList;

  @FindBy(css = "div[class='gl-dropdown gl-dropdown--no-max-height']")
  private WebElement dropdownOfSizes;

  @FindBy(css = "button[type='submit'][aria-label='Añadir al carrito']")
  private WebElement addCartButton;

  @FindBy(css = "div[class='gl-modal__main']")
  private WebElement modalCart;

  @FindBy(css = "a[data-auto-id='view-bag-desktop']")
  private WebElement showCartLink;

  @FindBy(css = "a[title='Calzado de Fútbol X 18.3 TF']")
  private WebElement titleDisplayedOnCartShow;

  @FindBy(css = "div[data-ci-test-id='orderTotalProductsDeliveryValue']")
  private WebElement ProductPriceDisplayedOnCartShow;

  @FindBy(css = "div[data-ci-test-id='orderTotalCartValue']")
  private WebElement TotalPriceDisplayedOnCartShow;

  public void hoverHOMBREOption() {
    Actions action = new Actions(webDriver);

    action.moveToElement(hombreOption).perform();
  }

  public void selectLinkFutbol() {
    CommonEvents.clickButton(linkFutbol);
  }

  public String getTitleOfItemList() {
    return CommonEvents.getTextContent(itemList);
  }

  public String getFirstPriceOfItemList() {
    WebElement itemPrice = itemList.findElement(By.xpath("following-sibling::div//span[contains(@class,'gl-price__value--sale')]"));
    String itemPriceValue = CommonEvents.getTextContent(itemPrice);

    return itemPriceValue;
  }

  public void clickItemList() {
    CommonEvents.clickButton(itemList);
  }

  public void selectSizeOption(String size) {
    CommonEvents.selectDropDown(dropdownOfSizes, new By.ByCssSelector("button[title='" + size + "']"));
  }

  public void clickAddCartButton() {
    CommonEvents.clickButton(addCartButton);
  }

  public String getQuantityCart() {
    CommonEvents.forceWait(1000);

    WebElement quantityOfModal = modalCart.findElement(By.cssSelector("span[data-auto-id='add-to-bag-product-info-qty']"));
    String quantityValue = CommonEvents.getTextContent(quantityOfModal);

    return quantityValue;
  }

  public void clickShowCartLink() {
    CommonEvents.clickButton(showCartLink);
  }

  public String getTitleDisplayedInCartShow() {
    String titleDisplayed = CommonEvents.getTextContent(titleDisplayedOnCartShow);

    return titleDisplayed.toUpperCase();
  }

  public String getProductPriceDisplayedInCartShow() {
    String productPriceDisplayed = CommonEvents.getTextContent(ProductPriceDisplayedOnCartShow);

    return productPriceDisplayed;
  }

  public String getTotalPriceDisplayedInCartShow() {
    String totalPriceDisplayed = CommonEvents.getTextContent(TotalPriceDisplayedOnCartShow);

    return totalPriceDisplayed;
  }

}
