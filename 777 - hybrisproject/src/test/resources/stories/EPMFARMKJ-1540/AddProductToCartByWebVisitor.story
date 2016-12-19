Meta:

Narrative:
As a web site visitor,
I want to be redirected to a login page, when I add restricted products to basket,
So that the 'Add2Basket' functionality is restricted.



Scenario: buy ordinary product
Given web visitor is on the home page
When web visitor search '$product'
And press button 'add to cart' of '$product'
Then '$product' should be added to cart

Examples:
|product|
|DSC-H20 Blue|


Scenario: buy restricted product
Given web visitor is on the home page
When web visitor search '$product'
And press button 'add to cart' of '$product'
Then web visitor should be redirected to login page

Examples:
|product|
|PowerShot A480|

Scenario: signed in user buy restricted product

Given web visitor is on the home page
And web visitor signed in
When web visitor search '$product'
And press button 'add to cart' of '$product'
Then '$product' should be added to cart
And user sign out

Examples:
|product|
|PowerShot A480|



Scenario: user redirect to page when user was before signing in

Given web visitor is on the home page
And web visitor search '$product'
And press button 'add to cart' of '$product'
When web visitor signed in
Then user is on the '$product' page
And user sign out

Examples:
|product|
|PowerShot A480|

