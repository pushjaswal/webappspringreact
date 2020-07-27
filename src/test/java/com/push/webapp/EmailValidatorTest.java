package com.push.webapp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator emailValidator = new EmailValidator();

    @Test
    void itShouldValidateCorrectEmail() {
        assertThat(emailValidator.test("hello@gmail.com")).isTrue();
    }

    @Test
    void itShouldValidateInCorrectEmail() {
        assertThat(emailValidator.test("hellogmail.com")).isFalse();
    }

    @Test
    void itShouldValidateInCorrectEmailWithoutDotAtTheEnd() {
        assertThat(emailValidator.test("hello@gmailcom")).isFalse();
    }
}