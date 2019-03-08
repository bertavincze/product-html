package com.codecool.servlet;
import com.codecool.model.Email;
import com.codecool.service.EmailList;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet {

    private EmailList emails = new EmailList();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String email = request.getParameter("email");
        emails.addEmail(new Email(email));
        request.setAttribute("emails", emails.getEmails());
        request.setAttribute("email", email);
        request.getRequestDispatcher("subscribed.html").forward(request, response);
    }
}

