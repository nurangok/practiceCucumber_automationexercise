@US01
Feature: Register_User_Functionality
  @register
  Scenario: TC01_register_page (kayit sayfasi)
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    And kullanici,New User Signup! in gorunur oldugunu test eder



