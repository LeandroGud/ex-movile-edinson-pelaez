Feature: Ingresando a SwagLabs

  @test
  Scenario: Ingreso login a SwagLabs

    Given que me encuentro en el login de SwagLabs
    When ingrese usuario "standard_user", contraseña "secret_sauce"
    Then valido que deberia aparecer el titulo "PRODUCTS"
    #And tambien valido que exista al menos un item

