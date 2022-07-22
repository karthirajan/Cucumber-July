$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile Purchase",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Electronics"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login into flipkart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_login_into_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile one dim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Electronics"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user search mobile by using one dim list",
  "rows": [
    {
      "cells": [
        "SAMSUNG",
        "iPhone",
        "realme"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile_by_using_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the mobile and doing payments",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_choose_the_mobile_and_doing_payments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive order confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_receive_order_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});