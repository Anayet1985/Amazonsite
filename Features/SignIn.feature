Feature: SignIn Amazon

Scenario Outline: Valid Login Test functonality 

Given Im on a homepage 
When I clicks sign in Button 
And Enter a valid email as a "<Email>" and password as a "<Password>" 
And Clicks sign In button
Then Successfully sign in
Examples:
|Email||Password|
|anayet.amails@gmail.com||manha123|