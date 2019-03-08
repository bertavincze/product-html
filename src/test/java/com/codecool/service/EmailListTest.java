package com.codecool.service;

import com.codecool.model.Email;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailListTest {

    private EmailList emails;
    private Email email;

    @BeforeEach
    void setUp() {
        emails = new EmailList();
        email = new Email("test@test.com");
    }

    @AfterEach
    void tearDown() {
        emails = null;
        email = null;
    }

    @Test
    void addEmail() {
        emails.addEmail(email);
        assertTrue(emails.getEmails().contains(email));
    }

    @Test
    void getEmails() {
        emails.addEmail(email);
        assertEquals(email, emails.getEmails().get(0));
    }
}
