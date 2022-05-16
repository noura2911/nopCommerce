@AllFeatures
Feature: User add products to wishlist

Scenario: guest user could add products to wishlist

  Given User navigate to website F08
  When User choose a random product and click on add to wishlist icon
  Then message appears says The product has been added to your wishlist
