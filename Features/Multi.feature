Feature: Amazon Site 

Scenario Outline: All and other funtionality test

Given Open a home page 
When Click sign in button 
And enter an email as a "<username>" and password as a "<password>"
And Click sign in 
And Click on All meanu 
And Scorldown and click Baby 
And take a screenshot
Then it should take me to the baby page
Examples:
|username||password|
|anayet.amails@gmail.com||manha123|