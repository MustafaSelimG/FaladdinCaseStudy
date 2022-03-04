# Faladdin Case Study - Test Case

> libraries Appium, Selenium, Cucumber, JUnit, TestNG

*@positive* </br>
  **Scenario: select the General as topic and verify homePage is open** </br>
    And I click on General </br>
    And I click on Send </br>
    Then I should see homePage is open </br>
 </br>
 
*@positive* </br>
  **Scenario: select the Love as topic and verify homePage is open** </br>
    And I click on Love </br>
    And I click on Send </br>
    Then I should see homePage is open </br>
 </br>

https://user-images.githubusercontent.com/88919177/156760526-88560da8-2a31-4ff2-8670-a42d690e01ec.mp4

 </br>
 
*@positive* </br>
  **Scenario: select the CareerMoney as topic and verify homePage is open** </br>
    And I click on CareerMoney </br>
    And I click on Send </br>
    Then I should see homePage is open </br>
 </br>
 
*@positive* </br>
  **Scenario: select the Health as topic and verify homePage is open** </br>
    And I click on Health </br>
    And I click on Send </br>
    Then I should see homePage is open </br>
 </br>
 
*@negative* </br>
  **Scenario: don't select a topic and verify page elements** </br>
    And  I click on Send </br>
    Then I should see Clairvoyance Topic Page elements </br>
