*** settings **

Library SeleniumLibrary

*** Test Cases ***

TC to demostrate weblocators in Robot FW
	[Documentation] 
	
	Open Browser https://developer.salesforce.com/signup chrome
	Maximize Browser Window
	
	Input Text xpath:////input[starts-with(@id,input)] 
	Sleep 4s
	Close Browser