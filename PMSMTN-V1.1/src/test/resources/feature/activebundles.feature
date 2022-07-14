Feature: View active bundles on PMS

  Scenario Outline: View all active bundles on PMS
    Given user is on login page
    When user enter <userid> and <password>
    And clicks on publish
    Then user is naviagted to PMS dashboard
    When user click on dashboard link
    Then user is navigated to the active bundles page
    And user navigate to sms tab

    Examples: 
      | userid                  | password             |
      | Shakir.Mohammad@mtn.com | thisIsAstrong@12Pass |
