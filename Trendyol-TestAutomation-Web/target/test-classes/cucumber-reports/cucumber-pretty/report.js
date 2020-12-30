$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase.feature");
formatter.feature({
  "line": 1,
  "name": "Trendyol buy product",
  "description": "",
  "id": "trendyol-buy-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4103291700,
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
  "duration": 1844666300,
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
  "duration": 137852200,
  "status": "passed"
});
formatter.match({
  "location": "WebStep.ResetMousePosition()"
});
formatter.result({
  "duration": 238023100,
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
  "duration": 393727600,
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
  "duration": 210104000,
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
  "duration": 2513381800,
  "status": "passed"
});
formatter.match({
  "location": "WebStep.login(DataTable)"
});
formatter.result({
  "duration": 10568066200,
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
  "duration": 167809500,
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
  "duration": 84486100,
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
  "duration": 130336400,
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
  "duration": 5001340600,
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
  "duration": 2650703400,
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
  "duration": 15209584700,
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
  "duration": 73808800,
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
  "duration": 183918900,
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
  "duration": 1020426500,
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
  "duration": 330404200,
  "error_message": "java.lang.AssertionError: expected [SamsungGalaxy Tab A7 SM-T500 32 GB 10.4\" Tablet Gri\n(270)\n1.699,00 TL\n1.536 TL\nKARGO BEDAVA\nTek Beden\nSepete Ekle] but found [Samsung]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat org.testng.Assert.assertEquals(Assert.java:200)\r\n\tat Libs.WebStep.getElementTextCompareTemp(WebStep.java:74)\r\n\tat ✽.And I compare myFavoriteProduct text with temp variable text(TestCase.feature:31)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.trendyol.com/Hesabim/Favoriler");
formatter.after({
  "duration": 1199705600,
  "status": "passed"
});
});