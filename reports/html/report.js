$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo2.feature");
formatter.feature({
  "id": "this-is-the-demo2-feature-test",
  "description": "",
  "name": "This is the demo2 feature test",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-is-the-demo2-feature-test;this-is-the-create-a-ticket-scenario",
  "tags": [
    {
      "name": "@Demo2",
      "line": 5
    }
  ],
  "description": "",
  "name": "This is the create a ticket scenario",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario",
  "comments": [
    {
      "value": "#Background:",
      "line": 3
    },
    {
      "value": "#Given Signin as a user",
      "line": 4
    }
  ]
});
formatter.step({
  "name": "Signin as a user",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "At Redmine Home, select the Projects Link",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "Select a project",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "Select the New Issues Link",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "Create a Redmine ticket",
  "keyword": "Then ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 12
    },
    {
      "cells": [
        "Title",
        "System error after click the review button"
      ],
      "line": 13
    },
    {
      "cells": [
        "Priority",
        "High"
      ],
      "line": 14
    },
    {
      "cells": [
        "Description",
        "How to repeat the steps"
      ],
      "line": 15
    }
  ]
});
formatter.step({
  "name": "Close the Browser",
  "keyword": "Then ",
  "line": 16
});
formatter.match({
  "location": "Demo2Steps.Signin_as_a_user()"
});
formatter.result({
  "duration": 7249819369,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.At_Redmine_Home_select_the_Projects_Link()"
});
formatter.result({
  "duration": 603687413,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Select_a_project()"
});
formatter.result({
  "duration": 9688206616,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Select_the_New_Issues_Link()"
});
formatter.result({
  "duration": 862761648,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Create_a_Redmine_ticket(DataTable)"
});
formatter.result({
  "duration": 4288076151,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Close_the_Browser()"
});
formatter.result({
  "duration": 4122652826,
  "status": "passed"
});
formatter.after({
  "duration": 92779,
  "status": "passed"
});
formatter.after({
  "duration": 77178,
  "status": "passed"
});
formatter.scenario({
  "id": "this-is-the-demo2-feature-test;this-is-the-search-a-ticket-scenario",
  "tags": [
    {
      "name": "@Demo2",
      "line": 18
    }
  ],
  "description": "",
  "name": "This is the search a ticket scenario",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "Signin as a user",
  "keyword": "Given ",
  "line": 20
});
formatter.step({
  "name": "At Redmine Home, select the Projects Link",
  "keyword": "When ",
  "line": 21
});
formatter.step({
  "name": "Select a project",
  "keyword": "Then ",
  "line": 22
});
formatter.step({
  "name": "Search for a redmine ticket",
  "keyword": "Then ",
  "line": 23
});
formatter.step({
  "name": "Verify the search result",
  "keyword": "Then ",
  "line": 24
});
formatter.step({
  "name": "Close the Browser and Cleanup",
  "keyword": "Then ",
  "line": 25
});
formatter.match({
  "location": "Demo2Steps.Signin_as_a_user()"
});
formatter.result({
  "duration": 3847624376,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.At_Redmine_Home_select_the_Projects_Link()"
});
formatter.result({
  "duration": 793748368,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Select_a_project()"
});
formatter.result({
  "duration": 9548870073,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Search_for_a_redmine_ticket()"
});
formatter.result({
  "duration": 6707183933,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Verify_the_search_result()"
});
formatter.result({
  "duration": 5377120564,
  "status": "passed"
});
formatter.match({
  "location": "Demo2Steps.Close_the_Browser_and_Cleanup()"
});
formatter.result({
  "duration": 1172841503,
  "status": "passed"
});
formatter.after({
  "duration": 24632,
  "status": "passed"
});
formatter.after({
  "duration": 70611,
  "status": "passed"
});
});