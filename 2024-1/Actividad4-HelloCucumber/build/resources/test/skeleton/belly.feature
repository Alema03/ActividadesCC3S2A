Feature: BellyFeature

  Scenario: eaten many cukes and wait 2 hours and growl
    Given I have eaten 11 cukes
    When I wait 2 hour
    Then my belly should growl

  Scenario: eaten 11 cukes and wait 1 hour and not growl
    Given I have eaten 11 cukes
    When I wait 1 hour
    Then my belly should not growl

  Scenario: eaten 9 cukes and wait 2 hours and not growl
    Given I have eaten 9 cukes
    When I wait 2 hour
    Then my belly should not growl

  Scenario: eaten 9 cukes and wait 1 hour and not growl
    Given I have eaten 9 cukes
    When I wait 1 hour
    Then my belly should not growl