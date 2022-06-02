Feature: 
#tags
  @Smoke
  Scenario Outline: Test login with valid credientals
    Given enter the url
    And login with valid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | amit     |    12345 |

  @Sanity
  Scenario Outline: Test login with invalid credientals
    Given enter the url
    And login with invalid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | rajesh   |   123456 |

  @Regression
  Scenario Outline: Test login with valid credientals
    Given enter the url
    And login with valid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | sumit    |    12345 |

  @Smoke @Sanity
  Scenario Outline: Test login with invalid credientals
    Given enter the url
    And login with invalid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | amita    |   123457 |

  @Sanity @Regression
  Scenario Outline: Test login with valid credientals
    Given enter the url
    And login with valid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | sahoo    |    12345 |

  Scenario Outline: Test login with valid credientals
    Given enter the url
    And login with valid <username> and <password>
    When click on login button
    Then navigate to home page

    Examples: 
      | username | password |
      | bikash   |    12345 |
