Feature:to test  login feature with data table
Scenario:Login scenario with correct user name and  correct password
Given You are in login page
When you are providing the username and password as 
|username|password|
|amotooricap1@gmail.com|12345|
|amotooricap3@gmail.com|12345|
And clickig enters
Then he must be taken to the home page