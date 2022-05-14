package com.example.demo3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "log", value = "/login")
public class Servlet extends HttpServlet {
    private String user_name;
    private String pass;
    private String name;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        user_name = request.getParameter("Login");
        pass = request.getParameter("pass");


        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        if (checkData()) {
            pw.write("<h2> Hello, " + name + " <h2> <br>");
            pw.write("Login successful!");
        } else {
            pw.write("Incorrect login or password!");
            pw.write("<a href=\"index.jsp\"> Try again!</a>");
        }
    }

    public boolean checkData() {
        boolean validateLogin = false;
        boolean validatePass = false;
        boolean validate = false;
        for (int i = 0; i < Reg.db.size(); i++) {
            if (Reg.db.get(i).getLogin().equals(user_name)) {
                name = Reg.db.get(i).getName();
                validateLogin = true;
            }
            if (Reg.db.get(i).getPass().equals(pass)) {
                validatePass = true;
            }
        }
        if (validateLogin && validatePass) {
            validate = true;
        }
        return validate;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
