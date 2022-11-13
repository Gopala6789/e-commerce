@login
Feature: buy product

Background:
Given open the browser
Scenario: Buy a product in Amazon
When Create account
When going to search iphone in amazon
And going to add cart
And select payment method and buy

Then close the browser

