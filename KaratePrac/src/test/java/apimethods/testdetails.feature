Feature: Insert details

	Scenario: Insert details using post method
		Given req = read('classpath:resources/template/request.json')
		
		Given URL ENDPOINT
		And request req
		When method post
		Then status 201
		And print response
		
		And match response.requestHeader == requestHeader.userId
		And match response.requestHeader == requestHeader.alternateUserId
		And match response.requestHeader == requestHeader.messageReference
		And match response.requestHeader == requestHeader.systemName
		
		
