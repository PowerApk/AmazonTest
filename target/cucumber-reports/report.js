$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/amazon_add_to_car.feature");
formatter.feature({
  "name": "Amazon Add to Car",
  "description": "  As a buyer user\n  I want to use Amazon Page\n  to succesfull add an item to my carShop",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Amazon"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add item To cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "name": "Alejo search an item and select any \u003cindex\u003e",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "busqueda",
        "indice"
      ]
    },
    {
      "cells": [
        "computador",
        "5"
      ]
    },
    {
      "cells": [
        "carro",
        "1"
      ]
    }
  ]
});
formatter.step({
  "name": "adds it to the car",
  "keyword": "And "
});
formatter.step({
  "name": "Alejo can see selected item in his car",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "index"
      ]
    },
    {
      "cells": [
        "0"
      ]
    },
    {
      "cells": [
        "1"
      ]
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
  "name": "Alejo is in Amazon Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoIsInAmazonHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add item To cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Amazon"
    },
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "name": "Alejo search an item and select any 0",
  "rows": [
    {
      "cells": [
        "busqueda",
        "indice"
      ]
    },
    {
      "cells": [
        "computador",
        "5"
      ]
    },
    {
      "cells": [
        "carro",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoSearchAnItemAndSelectAny(int,AmazonItemModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds it to the car",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.addsItToTheCar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alejo can see selected item in his car",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoCanSeeSelectedItemInHisCar()"
});
formatter.result({
  "status": "passed"
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
  "name": "Alejo is in Amazon Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoIsInAmazonHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add item To cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Amazon"
    },
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "name": "Alejo search an item and select any 1",
  "rows": [
    {
      "cells": [
        "busqueda",
        "indice"
      ]
    },
    {
      "cells": [
        "computador",
        "5"
      ]
    },
    {
      "cells": [
        "carro",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoSearchAnItemAndSelectAny(int,AmazonItemModel\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adds it to the car",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.addsItToTheCar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alejo can see selected item in his car",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonAddToCarStep_Def.alejoCanSeeSelectedItemInHisCar()"
});
formatter.result({
  "status": "passed"
});
});