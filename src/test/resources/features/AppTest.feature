Feature: Логин

  Background:
    Given открываем главную страницу сайта

  Scenario:
    When кликаем Личный кабинет
    And кликаем Авторизация
    Then вводим имейл
    And вводим пароль
    And кликаем Войти
    Then сверяем адрес личного кабинета

