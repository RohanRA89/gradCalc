package com.ironyard.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.Date;

/**
 * Created by rohanayub on 1/13/17.
 */
@WebServlet(name = "com.ironyard.servlets.dateCalc", urlPatterns = "/graduationDate")
public class dateCalc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String currentDate = request.getParameter("todayDate");
        SimpleDateFormat simpleTodayDate = new SimpleDateFormat("yyyy-MM-dd");
        Date todayDate = null;
        try {
            todayDate = simpleTodayDate.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long longTodayDate = todayDate.getTime();

        String graduateDate = "2017-03-31";
        SimpleDateFormat simpleGradDate = new SimpleDateFormat("yyyy-MM-dd");
        Date graduatesDate = null;
        try{
            graduatesDate = simpleGradDate.parse(graduateDate);
        } catch (ParseException e){
            e.printStackTrace();
        }

        long longGraduateDate = graduatesDate.getTime();

        long timeInBetween = longGraduateDate - longTodayDate;

        long daysInBetween = timeInBetween / (1000 * 60 * 60 * 24);

        request.setAttribute("daysUntilGrad" , daysInBetween);






        // forward to next jsp
        String nextJSP = "/gradDate.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }


        LocalDate today = LocalDate.now();
        LocalDate gDate = LocalDate.of(2017, Month.MARCH, 31);

    //int days = Days.daysBetween(today, gDate).getDays();




    }



