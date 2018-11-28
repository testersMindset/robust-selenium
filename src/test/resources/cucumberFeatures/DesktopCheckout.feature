Feature: Test ability to checkout cart added item

  @modelTest
  Scenario Outline: select dropdown options validations
    Given I am landed into home page
    Then I select '<firstItem>' link from '<secondItem>' on Home Page

    Examples: 
      | firstItem      | secondItem  |
      | Desktops       | Computers   |
      | Notebooks      | Computers   |
      | Software       | Computers   |
      | Camera & photo | Electronics |
      | Cell phones    | Electronics |
      | Others         | Electronics |
      | Shoes          | Apparel     |
      | Clothing       | Apparel     |
      | Accessories    | Apparel     |
