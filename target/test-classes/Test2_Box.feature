Feature: Testing the WebPage

Scenario Outline: Test the TextBox inputs

Given User is on the WebPage
When User enters valid inputs "<Name>", "<Address>", "<MyStory>" in the respective texboxes
Then User clicks the Submit btn


Examples:

|Name|Address|MyStory|
|Tom|Apolo dr|Performing automation testing|
|Tom 07|1895 ApolloDR|					|
|t3|real.qyite|Automation on 11.09-2022|
|@$Tom|	*!1895 Apollo	|$% Automation|
|			|				|Performing automation testing|
|				|					|					|

Scenario: Verify Max CharLimit of the textBoxes
Given User is on the WebPage
Then User calculate and assert max CharLimit of the Name, Address and My story textboxes


