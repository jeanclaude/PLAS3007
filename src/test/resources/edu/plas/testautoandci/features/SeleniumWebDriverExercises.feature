
  Feature: Selenium Webdriver Exercises Lesson 5

    @timesTalk
    Scenario: Times Talk Image Size
      Given I navigate to http://www.timesofmalta.com
      Then the Times Talk section image has a height of 156 pixels and a width of 278 pixels

    @mainMenuItems
    Scenario: Main Menu Items
      Given I navigate to http://www.bbc.com/news
      Then there are 17 main menu items

    @watchListenListItems
    Scenario: Watch/Listen menu contains 6 items
      Given I navigate to http://www.bbc.com/news
      Then the Watch/Listen menu contains 6 items

    @watchListenListFeature
    Scenario Outline: Watch/Listen menu items all have a title, image and associated index
      Given I navigate to http://www.bbc.com/news
      Then all the Watch/Listen menu items have a '<feature>'
      Examples:
        | feature |
        | title |
        | image |
        | index |

