Feature: User able use zoopla application, login the application, searching the property, buy the property 

Descriptions: "User able use zoopla application, login the application, searching the property, buy the property "


Background: 
Given User able to open a any browser 
And User able to enter "https://www.zoopla.co.uk/" url 
When User able to click on sign-in button 
And User able to enter valid userName "alammohammed79@gmail.com" & password "SAYEDawan2008@"
And User able to click on login button
Then User can verify the user information on the grid 



Scenario:  User able to search the properties 
And User able to click on the for sale button 
And User able to type in search box location of the properties 
And user able to click on search buttion 
Then User able to see the properties on the grid 



Scenario:  User able to search the properties 
And User able to click on the for sale button 
And User able to type in search box location of the properties 
And user able to click on search buttion 
And User able to select and buy the property 
Then User able to enterd the user won house 