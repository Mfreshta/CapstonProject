$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/retailpage.feature");
formatter.feature({
  "line": 2,
  "name": "Retail website",
  "description": "",
  "id": "retail-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteTest"
    }
  ]
});
formatter.before({
  "duration": 4641025600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click  on MyAccount",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter username \u0027ahmed@tekschool.us\u0027 and password \u0027ahmed123\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be logged in to MyAccount dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopsPageObjectStepDef.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 3617973100,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageStepDef.user_click_on_MyAccount()"
});
formatter.result({
  "duration": 111817101,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login()"
});
formatter.result({
  "duration": 471962800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 60
    }
  ],
  "location": "RetailPageStepDef.user_enter_username_ahmed_tekschool_us_and_password_ahmed(int)"
});
formatter.result({
  "duration": 405307200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestStepDef.user_click_on_Login_button()"
});
formatter.result({
  "duration": 490103800,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageStepDef.user_should_be_logged_in_to_MyAccount_dashboard()"
});
formatter.result({
  "duration": 3129514601,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Edit your affiliate information from Cheque payment method to Bank Transfer",
  "description": "",
  "id": "retail-website;edit-your-affiliate-information-from-cheque-payment-method-to-bank-transfer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@EditAffiliate"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User click on ‘Edit your affiliate information’ link",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user click on Bank Transfer radio button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User fill Bank information with below information",
  "rows": [
    {
      "cells": [
        "bankName",
        "abaNumber",
        "swiftCode",
        "accountName",
        "accountNumber"
      ],
      "line": 27
    },
    {
      "cells": [
        "tBank",
        "23457",
        "99999",
        "ahmed",
        "0002345678910"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User should see a success message",
  "keyword": "Then "
});
formatter.match({
  "location": "RetailPageStepDef.user_click_on_Edit_your_affiliate_informationlink()"
});
formatter.result({
  "duration": 10110797600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(text(),\u0027Edit your affiliate information\u0027)]\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-8BH82D5\u0027, ip: \u002710.0.0.166\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\MSelk\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:61513}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: be7a2bb05c8658387de14c65ad60d21d\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(text(),\u0027Edit your affiliate information\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat utilites.WebDriverUtility.clickOnElement(WebDriverUtility.java:23)\r\n\tat pageObjectRepository.LoginPageObject.clickOnEditYourAffiliateInformation(LoginPageObject.java:153)\r\n\tat stepDefinitions.RetailPageStepDef.user_click_on_Edit_your_affiliate_informationlink(RetailPageStepDef.java:116)\r\n\tat ✽.When User click on ‘Edit your affiliate information’ link(Features/retailpage.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RetailPageStepDef.user_click_on_Bank_Transfer_radio_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageStepDef.user_fill_Bank_information_with_below_information(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageStepDef.user_click_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageStepDef.user_should_see_a_success_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 853885799,
  "status": "passed"
});
});