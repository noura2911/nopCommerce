@AllFeatures
Feature: Follow us links open the corresponding websites

Scenario: confirm "follow us" links open the corresponding websites

  Given User navigate to website F07
  When User click on Facebook link and Twitter link and Youtube link and RSS link
  Then Facebook page opens and Twitter page opens and Youtube page opens and RSS page opens

