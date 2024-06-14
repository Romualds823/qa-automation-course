Feature: Historical weather data

  Scenario: Historical temperature data test
    Given coordinates:
      | latitude  | 52.54833  |
      | longitude | 13.407822 |

    When we are requesting historical data from "2024-04-01" to "2024-04-01"

    Then timezone is set as "GMT"
    And elevation is 53
    And hourly units are:
      | time           | iso8601 |
      | temperature_2m | °C      |

    And hourly list is:
      | 2024-04-01T00:00 |
      | 2024-04-01T01:00 |
      | 2024-04-01T02:00 |
      | 2024-04-01T03:00 |
      | 2024-04-01T04:00 |
      | 2024-04-01T05:00 |
      | 2024-04-01T06:00 |
      | 2024-04-01T07:00 |
      | 2024-04-01T08:00 |
      | 2024-04-01T09:00 |
      | 2024-04-01T10:00 |
      | 2024-04-01T11:00 |
      | 2024-04-01T12:00 |
      | 2024-04-01T13:00 |
      | 2024-04-01T14:00 |
      | 2024-04-01T15:00 |
      | 2024-04-01T16:00 |
      | 2024-04-01T17:00 |
      | 2024-04-01T18:00 |
      | 2024-04-01T19:00 |
      | 2024-04-01T20:00 |
      | 2024-04-01T21:00 |
      | 2024-04-01T22:00 |
      | 2024-04-01T23:00 |

    And 2m temperatures are:
  |9.5|
  |9.3|
  |8.7|
  |8.5|
  |8.8|
  |9.4|
  |10.8|
  |12.4|
  |13.1|
  |14.5|
  |17|
  |19|
  |19.2|
  |18.6|
  |19.4|
  |17.8|
  |15.2|
  |13.2|
  |11.9|
  |11.8|
  |10.7|
  |10.4|
  |10.1|
  |10|
