$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters Username and Password",
  "description": "",
  "id": "login-feature;user-enters-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters lalitha as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Password123 as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user will Finds a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestmeAppLogin.the_login_page_is_opened()"
});
formatter.result({
  "duration": 35378010500,
  "status": "passed"
});
formatter.match({
  "location": "TestmeAppLogin.user_enters_lalitha_as_username()"
});
formatter.result({
  "duration": 365725300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 20
    }
  ],
  "location": "TestmeAppLogin.user_enters_Password_as_password(int)"
});
formatter.result({
  "duration": 347977100,
  "status": "passed"
});
formatter.match({
  "location": "TestmeAppLogin.user_will_Finds_a_testmeapp_homepage()"
});
formatter.result({
  "duration": 5408272400,
  "status": "passed"
});
});