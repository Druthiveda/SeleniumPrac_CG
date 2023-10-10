Feature: CSV file

  @readdatacsv
  Scenario: ReadData from csv file
    Then eval data = read('\resources\data\userdata.csv')
    And print data
