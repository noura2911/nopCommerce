@AllFeatures
Feature: User search for products with Name and SKU
  Background:
  Given User navigate to website F04

Scenario: guest user could search for any product using Name


  When User enter nokia in search box and hit enter
  Then User found nokia product

  Scenario: guest user could search for any product using SKU

    When User enter N_1020_LU in search box and hit enter
    Then User found nokia product