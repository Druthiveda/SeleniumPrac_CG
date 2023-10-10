Feature: Insert details

  Scenario: Insert details

  Given call read('classpath:apimethods/testdetails.feature')  
  And def userId = response.requestHeader
  And def alternateUserId = response.requestHeader
  And def messageReference = response.requestHeader
  And def systemName = response.requestHeader
  
  
  


