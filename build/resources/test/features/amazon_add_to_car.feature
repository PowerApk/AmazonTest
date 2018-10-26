#Author: powerapk.desarrollo@gmail.com
@Amazon
Feature: Amazon Add to Car
  As a buyer user
  I want to use Amazon Page
  to succesfull add an item to my carShop

  Background: 
    Given Alejo is in Amazon Home Page

  @AddToCart
  Scenario Outline: Add item To cart
    When Alejo search an item and select any <index>
      | busqueda   | indice |
      | computador |      5 |
      | carro      |      1 |
    And adds it to the car
    Then Alejo can see selected item in his car

    Examples: 
      | index |
      |     0 |
      |     1 |
