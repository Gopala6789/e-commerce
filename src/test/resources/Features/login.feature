Feature: login page

Scenario: valid inputs invalid inputs
Given open the browser
When pass "<username>" and "<Password>"

Then close the browser

Examples:
|username|password|
|gopal|11111|
|parvathi|2222|
|jeni|3333|