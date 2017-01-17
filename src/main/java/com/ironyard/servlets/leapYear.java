package com.ironyard.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;

/**
 * Created by rohanayub on 1/16/17.
 */
@WebServlet(name = "leapYear" , urlPatterns ="/isThisALeapYear")
public class leapYear extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int year = Integer.parseInt(request.getParameter("year"));


        String isThisALeapYear;

        if((year % 4 == 0) && (year % 100 != 0)){
            isThisALeapYear = (year) + " is indeed a leap year!";
        }

        else if(year % 400 == 0 ){
            isThisALeapYear = (year) + " is indeed a leap year!";
        }

        else{
            isThisALeapYear = (year) + " is not a leap year.";
        }

        request.setAttribute("leapYear" , isThisALeapYear);


        // forward to next jsp
        String nextJSP = "/ageValue.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
