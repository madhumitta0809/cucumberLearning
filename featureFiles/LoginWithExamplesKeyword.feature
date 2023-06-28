
Feature:  login feature with examples keyword
Background:When startaring login process
Scenario Outline: Login scenario with  user names and   passwords
Given You are in  the login page
When you are providing the username and password as mentioned in "<username>""<password>"
And clicking enter
Then he must be taken to the home page if credentials are valid
Examples:
|username|password|
|amotooricap1@gmail.com|12345|
|amotooricap3@gmail.com|12345|
