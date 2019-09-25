$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/tagdemo.feature");
formatter.feature({
  "line": 3,
  "name": "ECommerce Application",
  "description": "",
  "id": "ecommerce-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "Add a product to bag",
  "description": "",
  "id": "ecommerce-application;add-a-product-to-bag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 55,
  "name": "Increase product quantity from bag page",
  "description": "",
  "id": "ecommerce-application;increase-product-quantity-from-bag-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 53,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 69,
  "name": "Buy a product with cash payment",
  "description": "",
  "id": "ecommerce-application;buy-a-product-with-cash-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@SmokeTest"
    },
    {
      "line": 67,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 77,
  "name": "Buy a product with CC payment",
  "description": "",
  "id": "ecommerce-application;buy-a-product-with-cc-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 75,
      "name": "@SmokeTest"
    },
    {
      "line": 75,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 79,
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});