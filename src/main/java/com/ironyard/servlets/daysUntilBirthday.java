package com.ironyard.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rohanayub on 1/17/17.
 */
@WebServlet(name = "daysUntilBirthday" , urlPatterns = "/howManyDaysAlive")
public class daysUntilBirthday extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String currentDate = request.getParameter("birthdayCurrentDate");
        SimpleDateFormat simpleTodayDate = new SimpleDateFormat("yyyy-MM-dd");
        Date todayDate = null;
        try {
            todayDate = simpleTodayDate.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long longTodayDate = todayDate.getTime();

        String birthday = request.getParameter("birthDay");
        SimpleDateFormat simpleGradDate = new SimpleDateFormat("yyyy-MM-dd");
        Date parseBirthday = null;
        try{
            parseBirthday = simpleGradDate.parse(birthday);
        } catch (ParseException e){
            e.printStackTrace();
        }

        long longBirthday = parseBirthday.getTime();

        long timeInBetween = longTodayDate -longBirthday;

        long daysYouveBeenAlive = timeInBetween / (1000 * 60 * 60 * 24);

        request.setAttribute("daysAlive" , daysYouveBeenAlive);

        // forward to next jsp
        String nextJSP = "/goBacktoStart.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
