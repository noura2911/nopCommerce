@AllFeatures
Feature: User switch between currencies
Scenario: guest user could switch between currencies [$, €]

  Given User navigate to website F03
  When User Select “Euro” from currency dropdown list
  Then Currency has been changed from US to Euro