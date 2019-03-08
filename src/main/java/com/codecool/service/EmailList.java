package com.codecool.service;

import com.codecool.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailList {

    private List<Email> emails;

    public EmailList() {
        this.emails = new ArrayList<>();
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public List<Email> getEmails() {
        return emails;
    }
}
