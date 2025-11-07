Feature: Validating Place APIs

  Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
    Given Add place payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "POST" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"

    Examples:
      | name   | language | address          |
      | Front  | French   | 29, side layout  |
