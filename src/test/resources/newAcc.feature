
Feature:create Login feature
@qw
Scenario: Facebook login

Given To open chrome

When  Vaild username and invalind password
|valind|invaild|

And   inVaild username and valind password 
|invalind|vaild|

And   Vaild username and valind password
|valind|vaild|

And   inVaild username and invalind password
|invalind|invaild|

Then close