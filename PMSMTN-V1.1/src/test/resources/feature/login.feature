#Author: your.email@your.domain.com
Feature: login to PMS

  Scenario Outline: Login with valid credentials
    Given user is on login page
    When user enter <userid> and <password>
    And clicks on publish
    Then user is naviagted to PMS dashboard

    Examples: 
      | userid                  | password             |
      | Shakir.Mohammad@mtn.com | thisIsAstrong@12Pass |
