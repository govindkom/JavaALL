
Feature: Search for various product categories should be possible along with product search

Scenario: User should be able to search for the products under the books category
Given I visit the website as guest user
When I select the books options from the search fropdown
And I click on Search Icon option
Then I should be able to see the page having heading as Amazon Best Reads is getting displayed
But I should not see the other category products







Scenario: User should be able to search for the products under the baby category
Given I visit the website as guest user
When I select the baby option from search dropdown
And I click on search Icon option
Then I should be able to seet the page having heading as baby product is getting displayed
But I should not see the other category products