#Author: Lvelasq55@gmail.com

Feature: As an online user
  I want to enter Notepad
  To create a new text note

  @CreateNote
  Scenario: Create new note
    Given I enter Notepad
    When I select to create a rich text note
    Then I validate the created note