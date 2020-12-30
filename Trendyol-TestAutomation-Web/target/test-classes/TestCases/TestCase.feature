Feature: Trendyol buy product

  Background:


  @Run @Chrome
  Scenario: Check image loaded and product add to basket
    Given I go to https://www.trendyol.com page
    Then  I url must be https://www.trendyol.com/
    And   I move mouse reset position
    And   I click welcomePopup element if exist
    When  I mouse over loginIcon element
    And   I click mainLogin element
    When  I login with
      | usernameInput       | passwordInput |
      | test24950@gmail.com | 123456Qq      |
      | loginButton         |               |
    And I click closeNotificationPopup element if exist
    Then  I see Hesabım text
    And I write text samsung text area search
    #And I press ENTER key
      #And I click search element
    And I wait 5 second
    And I click Samsung text
    And I see pageTitleSamsung element
    # Trendyol Sayfa yapısına göre sayfa scroll edildikçe product yüklenecek şekilde tasarlandığından,
    # 5. step  "Arama sonuçlarından 2. sayfaya tıklayacak ve açılan sayfada 2. sayfanın şu an gösterimde olduğunu onaylayacak." ignore edildi.
    And I get thirdProduct element text and keep temp variable
    And I click thirdFavoriteButton element
    And I click myFavorite element
    And I compare myFavoriteProduct text with temp variable text
    And I click removeMyFavorite element
    And I see Favoriler Listeniz Henüz Boş text


