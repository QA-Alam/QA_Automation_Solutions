Feature: User can search the properties, select the property, buy the property, 
	compare the property & verify the price

	Description: User login zoopla web site, search the property &
              select the property as well as verify the property price.  
@Sanity 
@Smoke 
@Functional 
@Regression 
Scenario: User can login to the application, search the location, select the second or third property from the list & verify the price on the screen.
 
	Given Users is able to verify login information successfully 
	When Users can hover over the page on the For Sale module and click on the UK Property For Sale 
	And Users is able to enter location- "New York, Lincolnshire"- in the text box & hit enter button 
	And Users is able to print all value/price of the properties in the console 
	And click on the third property from the properties list 
	And Users is able to print out the selected property details 
	Then Users can Verify the price of the selected property 
	And User is able to logout the application 
	
	
@Login 
Scenario Outline: 
	User able to login the application with valid username & password, 
	users cannot login without valid username & password, user cannot use 
                       password more eight charecter

	Given User able to open a any browser 
	And User able to enter "<URL>"  url 
	When User able to click on sign-in button 
	And User able to enter the userName "<userName>"  & password "<passWord>"" 
	And User able to click on login button 
	Then User can verify the user information on the grid 
	
	Examples: 
		|        URL                                |                  userName                    |         passWord        |
		|https://www.zoopla.co.uk/| alammohammed79@gmail.com | SAYEDawan2008@|
		|https://www.zoopla.co.uk/| alammohammed79@gmail.com |        fkuyfcgag         |
		
	