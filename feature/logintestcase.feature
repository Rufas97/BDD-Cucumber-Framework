Feature: login feature

  #Scenario: login FB page  
  #Given user is on login page
  #When user enters valid username "testing"
  #And user enters valid password "password"
  #Then clicks on submit button
 
 @regression @smoke
  Scenario Outline: login with multiple user
                             Given user is on login page
                             When user enters valid  username "<username>"
                             And user enters valid password "<password>"
                             Then clicks on submit button
  
  
           Examples:
                           |username|password|
                           |Testing@gmail.com|p1234|
                           |Naresh@gmail.com|Test@1234|
                        
 