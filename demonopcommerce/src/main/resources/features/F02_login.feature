@AllFeatures
Feature: User login with valid credentials

Scenario: guest user could Login with valid credentials

  Given User navigate to website F02
  And User click on Login tab
  When User enter nour@ahmed.nana and 123456 and hit enter
  Then User login and my account tab is displayed