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

  #@modelTest
  #Scenario: select dropdown options validations
    #Given I am landed into home page
    #Then I select 'Desktops' link from 'Computers' on Home Page
    #Then I add cart to Lenovo Desktop
    #Then I navigated to the cart page
    #Then I updated the cart to '0'
    #Given I am landed into home page
    #Then I select 'Clothing' link from 'Apparel' on Home Page
    #Then I am landed into clothing page
    #Then I add cart to Levi
    #Then I navigate to the cart page

     @modelTest
  Scenario: select dropdown options validations
    Given I am landed into home page
    Then I select 'Desktops' link from 'Computers' on Home Page
    Then I add cart to Lenovo Desktop
  