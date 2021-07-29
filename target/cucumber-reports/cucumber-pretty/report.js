$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/desktops.feature");
formatter.feature({
  "line": 2,
  "name": "Desktops to Retail website",
  "description": "",
  "id": "desktops-to-retail-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteDesktopsTest"
    }
  ]
});
formatter.before({
  "duration": 4043834100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "DesktopsPageObjectStepDef.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4141963500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User add HP LP 3065  from Desktops tab to the cart",
  "description": "",
  "id": "desktops-to-retail-website;user-add-hp-lp-3065--from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@AddHP"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click  ADD TO CART option on ‘HP LP3065’ item",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select quantity 1",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageObjectStepDef.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 91467401,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageObjectStepDef.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 784898899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 40
    }
  ],
  "location": "DesktopsPageObjectStepDef.user_click_ADD_TO_CART_option_on_HP_LP_item(int)"
});
formatter.result({
  "duration": 86163101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "DesktopsPageObjectStepDef.user_select_quantity(int)"
});
formatter.result({
  "duration": 1907471299,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageObjectStepDef.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 412186701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 57
    }
  ],
  "location": "DesktopsPageObjectStepDef.user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int)"
});
formatter.result({
  "duration": 263736200,
  "status": "passed"
});
formatter.after({
  "duration": 946652900,
  "status": "passed"
});
});