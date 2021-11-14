$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Retail website",
  "description": "",
  "id": "login-to-retail-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteTest"
    }
  ]
});
formatter.before({
  "duration": 20304136900,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "# In feature will be use a comment"
    },
    {
      "line": 4,
      "value": "#Every Feature file starts with Feature: \u003cName of Feature\u003e"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDef.user_is_on_Retail_Website()"
});
formatter.result({
  "duration": 3544202400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "# Below is the tag @login"
    }
  ],
  "line": 11,
  "name": "Login to MyAccount",
  "description": "",
  "id": "login-to-retail-website;login-to-myaccount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@login"
    },
    {
      "line": 10,
      "name": "@RegressionTest"
    },
    {
      "line": 10,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User click on MyAccount",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter userName \u0027eagles@tekschool.us\u0027 and password \u0027eagles\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be logged in to myAccount Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 162641000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login()"
});
formatter.result({
  "duration": 496400400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "eagles@tekschool.us",
      "offset": 21
    },
    {
      "val": "eagles",
      "offset": 56
    }
  ],
  "location": "LoginTestStepDef.user_enter_userName_and_password(String,String)"
});
formatter.result({
  "duration": 874193000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1095690900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_should_be_logged_in_to_myAccount_Dashboard()"
});
formatter.result({
  "duration": 5161264300,
  "status": "passed"
});
formatter.after({
  "duration": 1186390900,
  "status": "passed"
});
});