@GoRest
Feature: Albums

Scenario: Get Albums
When I provide the request data
And I make an API call to getAlbums API
Then I validate that 200 is the status code
And I validate the response body