Feature: Title of your feature I want to use this template for my feature file

  @runTest
  Scenario: launch browser test
    Given I am landed into home page
    And currency is selected as 'Euro'

  @regressionTest
  Scenario Outline: select dropdown options validations
    Given I am landed into home page
    And currency is selected as '<currency>'
    And I click to the Register Link
    Then I land into Register pages
    And I fill in register info with below values:
      | gender     | <gender>     |
      | birthDay   | <birthDay>   |
      | birthMonth | <birthMonth> |
      | birthYear  | <birthYear>  |
      | firstName  | <firstName>  |
      | lastName   | <lastName>   |
      | email      | <email>      |

    Examples: 
      | currency  | gender | birthDay | birthMonth | birthYear | firstName | lastName | email                     |
      | Euro      | male   |       12 | January    |      1923 | Robert    | Kasper   | abcd@testWithCucumber.com |
      | US Dollar | female |       20 | March      |      1982 | Hanson    | Star     | xyz3@testWithCucumber.com |
      | Euro      | male   |       12 | January    |      1923 | Robert    | Kasper   | abcd@testWithCucumber.com |
      | US Dollar | female |       20 | March      |      1982 | Hanson    | Star     | xyz3@testWithCucumber.com |
