$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase.feature");
formatter.feature({
  "line": 1,
  "name": "Trendyol buy product",
  "description": "",
  "id": "trendyol-buy-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4148642500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Check image loaded and product add to basket",
  "description": "",
  "id": "trendyol-buy-product;check-image-loaded-and-product-add-to-basket",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Run"
    },
    {
      "line": 6,
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I go to https://www.trendyol.com page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I url must be https://www.trendyol.com/",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I move mouse reset position",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click welcomePopup element if exist",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I mouse over loginIcon element",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click mainLogin element",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I login with",
  "rows": [
    {
      "cells": [
        "usernameInput",
        "passwordInput"
      ],
      "line": 15
    },
    {
      "cells": [
        "test24950@gmail.com",
        "123456Qq"
      ],
      "line": 16
    },
    {
      "cells": [
        "loginButton",
        ""
      ],
      "line": 17
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click closeNotificationPopup element if exist",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I see Hesabım text",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I write text samsung text area search",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#And I press ENTER key"
    },
    {
      "line": 22,
      "value": "#And I click search element"
    }
  ],
  "line": 23,
  "name": "I wait 5 second",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click Samsung text",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I see pageTitleSamsung element",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "# Trendyol Sayfa yapısına göre sayfa scroll edildikçe product yüklenecek şekilde tasarlandığından,"
    },
    {
      "line": 27,
      "value": "# 5. step  \"Arama sonuçlarından 2. sayfaya tıklayacak ve açılan sayfada 2. sayfanın şu an gösterimde olduğunu onaylayacak.\" ignore edildi."
    }
  ],
  "line": 28,
  "name": "I get thirdProduct element text and keep temp variable",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click thirdFavoriteButton element",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click myFavorite element",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I compare myFavoriteProduct text with temp variable text",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click removeMyFavorite element",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I see Favoriler Listeniz Henüz Boş text",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.trendyol.com",
      "offset": 8
    }
  ],
  "location": "WebStep.GoToURL(String)"
});
formatter.result({
  "duration": 3486537600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.trendyol.com/",
      "offset": 14
    }
  ],
  "location": "WebStep.CheckUrl(String)"
});
formatter.result({
  "duration": 42277100,
  "status": "passed"
});
formatter.match({
  "location": "WebStep.ResetMousePosition()"
});
formatter.result({
  "duration": 202234800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "welcomePopup",
      "offset": 8
    }
  ],
  "location": "WebStep.ClickElementExist(String)"
});
formatter.result({
  "duration": 271701300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginIcon",
      "offset": 13
    }
  ],
  "location": "WebStep.MouseOver(String)"
});
formatter.result({
  "duration": 302963900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mainLogin",
      "offset": 8
    }
  ],
  "location": "WebStep.Click(String)"
});
formatter.result({
  "duration": 2515758400,
  "status": "passed"
});
formatter.match({
  "location": "WebStep.login(DataTable)"
});
formatter.result({
  "duration": 10638643600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "closeNotificationPopup",
      "offset": 8
    }
  ],
  "location": "WebStep.ClickElementExist(String)"
});
formatter.result({
  "duration": 162225100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hesabım",
      "offset": 6
    }
  ],
  "location": "WebStep.seeText(String)"
});
formatter.result({
  "duration": 76660900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "samsung",
      "offset": 13
    },
    {
      "val": "search",
      "offset": 31
    }
  ],
  "location": "WebStep.SendKeys(String,String)"
});
formatter.result({
  "duration": 124069400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 7
    }
  ],
  "location": "WebStep.WaitTime(int)"
});
formatter.result({
  "duration": 5000037700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung",
      "offset": 8
    }
  ],
  "location": "WebStep.ClickText(String)"
});
formatter.result({
  "duration": 2449307900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pageTitleSamsung",
      "offset": 6
    }
  ],
  "location": "WebStep.seeElement(String)"
});
formatter.result({
  "duration": 15294024500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thirdProduct",
      "offset": 6
    }
  ],
  "location": "WebStep.getElementText(String)"
});
formatter.result({
  "duration": 70403400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thirdFavoriteButton",
      "offset": 8
    }
  ],
  "location": "WebStep.Click(String)"
});
formatter.result({
  "duration": 4003575100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "myFavorite",
      "offset": 8
    }
  ],
  "location": "WebStep.Click(String)"
});
formatter.result({
  "duration": 954260200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "myFavoriteProduct",
      "offset": 10
    }
  ],
  "location": "WebStep.getElementTextCompareTemp(String)"
});
formatter.result({
  "duration": 294975900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "removeMyFavorite",
      "offset": 8
    }
  ],
  "location": "WebStep.Click(String)"
});
formatter.result({
  "duration": 163227200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Favoriler Listeniz Henüz Boş",
      "offset": 6
    }
  ],
  "location": "WebStep.seeText(String)"
});
formatter.result({
  "duration": 594635200,
  "status": "passed"
});
formatter.after({
  "duration": 719054400,
  "status": "passed"
});
});