$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Test.feature");
formatter.feature({
  "name": "Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Test1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I do some step",
  "keyword": "When "
});
formatter.match({
  "location": "TestingSteps.i_do_some_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "another step",
  "rows": [
    {
      "cells": [
        "a",
        "b"
      ]
    },
    {
      "cells": [
        "c",
        "d"
      ]
    },
    {
      "cells": [
        "d",
        "e"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestingSteps.another_step(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I validate the outcomes",
  "rows": [
    {
      "cells": [
        "Header1",
        "Header2",
        "Header3"
      ]
    },
    {
      "cells": [
        "Data 1.1",
        "Data 1.2",
        "Data 1.3"
      ]
    },
    {
      "cells": [
        "Data 2.1",
        "Data 2.2",
        "Data 2.3"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestingSteps.i_validate_the_outcomes(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "name": "I verify that for value \u003cvalue\u003e, the result \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I check for the 5 in step",
  "keyword": "When "
});
formatter.match({
  "location": "TestingSteps.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that for value 5, the result \"success\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestingSteps.i_verify_that_for_value_the_result(Integer,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I check for the 7 in step",
  "keyword": "When "
});
formatter.match({
  "location": "TestingSteps.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that for value 7, the result \"Fail\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestingSteps.i_verify_that_for_value_the_result(Integer,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});