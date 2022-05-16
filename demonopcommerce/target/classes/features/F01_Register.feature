@AllFeatures
Feature: User register with valid data

Scenario: guest user could register with valid data successfully

  Given User navigate to website F01
  When Click on register tab
  And User choose gender
  And User enter first name Nour and last name Ahmed
  And User select day and month and year
  And User enter email nour@ahmed.nana
  And User enter company name Noreen
  And User enter password 123456
  And User enter the same password in confirm password field and hit enter
  Then User registered and success message is displayed
