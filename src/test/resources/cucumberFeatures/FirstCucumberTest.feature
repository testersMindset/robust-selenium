Feature: Title of your feature I want to use this template for my feature file

  @runTest
  Scenario: launch browser test
    Given I am landed into home page
    And currency is selected as 'Euro'
 
 @runTest
  Scenario Outline: select dropdown options validations
    Given I am landed into home page
    And currency is selected as '<currency>'
    
    Examples:
    | currency 	|
    | Euro			|
    | US Dollar |
    