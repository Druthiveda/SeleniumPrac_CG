@regressiontest
Feature: Read CSV data

  Scenario Outline: Read CSV data parameters and print details 

		And print 'userId: ' + "<userId>"
		And print 'alternateUserId: ' + "<alternateUserId>"
		And print 'messageReference: ' + "<messageReference>"
		And print 'systemName: ' + "<systemName>"
		
		Examples:
		| read('classpath:resources/data/userdata.csv')|