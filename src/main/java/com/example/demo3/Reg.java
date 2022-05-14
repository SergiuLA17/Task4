package com.example.demo3;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "reg", value = "/reg-servlet")
public class Reg extends HttpServlet {
    private String message;

     static ArrayList<User>  db = new ArrayList<>();

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        {

            String name = request.getParameter("Name");
            String user_name = request.getParameter("Login");
            String pass = request.getParameter("pass");


            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            pw.write("<h2> New user was added! <h2> <br>");
            pw.write("<a href=\"index.jsp\"> Now you can log in!</a>");

            User new_user = new User(name,user_name,pass);
            db.add(new_user);
            System.out.println(db);


            pw.write("</h3>");

        }
    }

}