package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HeaderMenu extends BasePage {
  @FindBy(css = "a.label[href='/home']")
  private WebElement hombreOption;

  public void hoverHOMBREOption() {
//    CommonEvents.forceWait(1000);
//    Actions action = new Actions(webDriver);
//
//    action.moveToElement(hombreOption).build().perform();
    CommonEvents.clickButton(hombreOption);

  }

}
