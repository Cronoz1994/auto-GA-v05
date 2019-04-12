
Feature: Funcionalidad de maquinarias

  Scenario Outline: Crear una maquinaria
    Given 'Store online' page is loaded
    And click 'category card' in the 'catalog list'
    And click 'add Machinery' in the 'category list'
    And fill the 'form create of machinery' for add machinery
    And click 'Accept button' in the 'form create of machinery'
    Then verify that one machinery with "<Brand name>" exist in the 'category list'

    Examples:
      |Brand name|
      |brand test|


  Scenario: eliminar una maquinaria de la lista
    Given 'Store online' page is loaded
    And click 'category card' in the 'catalog list'
    And click 'delete Machinery' in one card of the list
