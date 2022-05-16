@AllFeatures
Feature: User select different categories and sub-category

Scenario: guest user could hover and select different categories

  Given User navigate to website F05
  When User hover and select random category
  When User click on random sub-category
  Then User redirect to sub-category page