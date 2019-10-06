Feature: Application Login

@Login
Scenario: Login into Application
Given User is on Landing Page
When User enters username as "kailashkadam6988@gmail.com" and password as "Kailash$2710"
Then Welcome page with name "Kailash" 
And EmailId is "kailashkadam6988@gmail.com" in profile details section

