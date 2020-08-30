Feature: LoginAmazon WebSite

  @tc_01_login
Scenario:Login to website

  Given Launch the browser and enter the url
  When Amazon page is opened
  Then Go to Accounts and lists and click  signin button
  Then login page is displayed
  Then enter the "<email>" and "<password>"
  Then Click the login
  And Take screenshots and quit browser
