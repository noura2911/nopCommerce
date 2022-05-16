@AllFeatures
Feature: Verify that user could click on slider wrapper

Scenario: guest user could click on slider wrapper

  Given User navigate to website F06
  When User click on iphone banner small box and click on iphone6 banner
  Then User could click on the banner and redirected to the iphone6 page
