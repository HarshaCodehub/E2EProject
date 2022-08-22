Feature: Login into Application
Scenario Outline: Positive test validation login
Given Initialize browser with chrome
And navigate to "click" site.
And click on login link in home page to land on secure sign in page
When user enters <username> and <password> and logs in
Then verify the user is successfully logged in

Examples: 
|username       	  	|password  |
|harsha@gmail.com		  |password	 |
|harsha123@gmail.com	|passwords |

