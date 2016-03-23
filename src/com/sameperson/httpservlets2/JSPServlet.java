package com.sameperson.httpservlets2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/jsptest")
public class JSPServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Test.jsp");


        ArrayList<User> list = new ArrayList<>();
        list.add(new User("John", 32));
        list.add(new User("Bill", 14));
        list.add(new User("Jenny", 25));


        req.setAttribute("Users", list);

        dispatcher.forward(req, resp);

    }
}


