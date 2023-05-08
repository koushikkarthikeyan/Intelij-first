Feature: Amazon login

  Scenario Outline: amazon login page
    Given as a user i entered to login page
    When i entered username as "<username>"
    And i entered password as "<password>"
    Then i clicked login button
    Examples:
      | username | password |
    |koushik   |koushik   |