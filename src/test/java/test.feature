# Za komentare

Feature: Test

  @Login
#  Scenario: Test valid login
#    Given I navigate to login web page
#    When I enter username
#    And I enter password
#    And I click login button
#    Then I should see logged in page

  Scenario Outline: I login to page with "<username>"
    Given I login to web page with "<username>" and "<password>"
    Then I should see page
    Examples:
      | username | password |
      | user1    | 123      |
      | user2    | 234      |
      | user3    | 345      |
      | user4    | 456      |
      | user5    | 567      |