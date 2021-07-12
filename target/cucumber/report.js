$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Background.feature");
formatter.feature({
  "line": 1,
  "name": "Sky Blue Background change",
  "description": "",
  "id": "sky-blue-background-change",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4121265300,
  "status": "passed"
});
formatter.before({
  "duration": 3496964900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "BBsteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 195563500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1 User should able to change and verify background color",
  "description": "",
  "id": "sky-blue-background-change;1-user-should-able-to-change-and-verify-background-color",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Execute1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "BBsteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 118438400,
  "status": "passed"
});
formatter.match({
  "location": "BBsteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 103373400,
  "status": "passed"
});
formatter.after({
  "duration": 712683900,
  "status": "passed"
});
formatter.after({
  "duration": 668598100,
  "status": "passed"
});
});