package com.codecool.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    private String address;
    private Email email;

    @BeforeEach
    void setUp() {
        address = "test@test.com";
        email = new Email(address);
    }

    @AfterEach
    void tearDown() {
        address = null;
        email = null;
    }

    @Test
    void getAddress() {
        assertEquals(address, email.getAddress());
    }
}
