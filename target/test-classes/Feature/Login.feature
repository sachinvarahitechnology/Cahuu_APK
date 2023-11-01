 Feature: Login functionality

@validlogin
Scenario Outline: validate login functionality using valid credential
 
Given  user on login page
When   user provide <username> and <password> 
And    click on button
Then   login successfully 

 Examples:
 |username                        |    password   |   
 |"sachin@varahitechnologies.com"| 	"1234566@"	|