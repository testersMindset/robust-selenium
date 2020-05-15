 Feature: Title of your feature I want to use this template for my feature file

  @runTest
  Scenario Outline: launch browser test
    Given I am landed into home page
    And currency is selected as 'Euro'
    And I click to the Register Link

    Examples: 
      | Cur       | Gender | Day | Month    | Year | Name   | Last   | Email                      |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |


  @regressionTest @registrationTest
  Scenario Outline: select dropdown options validations
    Given I am landed into home page
    And currency is selected as '<Cur>'
    And I click to the Register Link
    Then I land into Register page
    And I fill in register info with below values:
      | Gender | <Gender> |
      | Day    | <Day>    |
      | Month  | <Month>  |
      | Year   | <Year>   |
      | Name   | <Name>   |
      | Last   | <Last>   |
      | Email  | <Email>  |
    Then I click to computers link

    Examples: 
      | Cur       | Gender | Day | Month    | Year | Name   | Last   | Email                      |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |
      | Euro      | male   |  12 | January  | 1923 | Robert | Kasper | abcd@testWithCucumber.com  |
      | US Dollar | female |  20 | February | 1978 | Jenny  | Pierce | xyzzd@testWithCucumber.com |
