$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11860183200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into Application",
  "description": "",
  "id": "application-login;login-into-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username as \"kailashkadam6988@gmail.com\" and password as \"Kailash$2710\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Welcome page with name \"Kailash\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "EmailId is \"kailashkadam6988@gmail.com\" in profile details section",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_Landing_Page()"
});
formatter.result({
  "duration": 1729147600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kailashkadam6988@gmail.com",
      "offset": 25
    },
    {
      "val": "Kailash$2710",
      "offset": 70
    }
  ],
  "location": "StepDefinitions.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1204875500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kailash",
      "offset": 24
    }
  ],
  "location": "StepDefinitions.welcome_page_with_name(String)"
});
formatter.result({
  "duration": 3788727100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 3808950700,
  "status": "passed"
});
});