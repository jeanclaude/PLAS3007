Feature: Test the Calculator at http://www.math.com/students/calculators/source/basic.htm

  Scenario Outline: Doing calculations on the online calculator
    Given I navigate to 'http://www.math.com/students/calculators/source/basic.htm'
    When When I input '<first><operator><second>' in the calculator
    Then The text shown on the display is <answer>
    Examples:
      | first | operator | second | answer |
      | 5     | +        | 2      | 7      |
      | 158   | *        | 222    | 3476   |
      | 10    | -        | 2      | 8      |
      | 12    | /        | 6      | 2      |
      | 5     | /        | 0      | Infinity     |


