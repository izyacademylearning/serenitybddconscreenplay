Feature: add product
  i as service, i need add a new product

  Scenario: add product
    Given He user logs in
      | email              | password |
      | maob14@yopmail.com | 1234     |
    When The user add a new product to list
      | title             | description             | body                              | tag        |
      | IPHONE 13 PRO MAX | Es un iphone muy bonito | Caracteristicas de nuestro iphone | IPHONE     |
      | SAMSUMG           | Ultimo modelo           | gama alta                         | SAMSUNG 12 |
    Then He could see a product in the list


  Scenario: Login Fail
    Given He user logs in
      | email              | password |
      | maob14@yopmail.com | 3453453     |
    When The user add a new product to list
      | title             | description             | body                              | tag        |
      | IPHONE 13 PRO MAX | Es un iphone muy bonito | Caracteristicas de nuestro iphone | IPHONE     |
      | SAMSUMG           | Ultimo modelo           | gama alta                         | SAMSUNG 12 |
    Then He could see a product in the list



