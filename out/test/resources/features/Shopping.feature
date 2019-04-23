# Shopping bag feature
Feature: Shopping bag

  Scenario Outline: add product to shopping bag
    Given 'Addidas' page is loaded
    And hover on the 'HOMBRE option' in the 'header' of 'home' page
    And click 'Futbol link' in the colum 'TENIS' of the menu of 'HOMBRE option'
    Then verify title "<option title>" option exist of the 'list of footwear'
    And get first 'price' of the "<option title>" option of the 'list of footwear'
    And click of the "<option title>" option of the 'list of footwear'
    And select of the 'dropdown of sizes' the "<size>" option of the 'cart form'
    And click 'AÑADIR AL CARRITO' button of the 'cart form'
    Then verify that 'CANTIDAD' is equal to "<quantity>" in the 'cart modal'
    And click 'VER CARRITO' link of the 'cart modal'
    Then verify that "<option title>" title is displayed in the 'cart show' page
    Then verify that 'TOTAL DEL PRODUCTO' is equal to "<product price>" in the 'cart show' page
    Then verify that 'TOTAL' is equal to "<total price>" in the 'cart show' page

    Examples:
      | option title                | size   | quantity    | product price | total price |
      | CALZADO DE FÚTBOL X 18.3 TF | MX 9.5 | Cantidad: 1 | $1,329.00     | $1,428.00   |