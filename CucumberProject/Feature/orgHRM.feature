Feature: Login & Logout Test

Scenario:LoginTest
Given the browser launched and navigated to Url
When the tester enters username and password
And clicks on login button
Then welcome admin message displayed

Scenario:Logout
When the user clicks on welcome admin link
And also clicks on the logout link
Then login page displayed. 
