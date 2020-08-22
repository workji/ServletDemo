package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletDemo extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			doPost(req, resp);
	    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

            System.out.println("Hello World");
            HttpSession hs = req.getSession();

    		req.setAttribute("request_key", "request_value");
    		hs.setAttribute("session_key", "session_value");

            System.out.println(hs.getId() + " " + hs.getLastAccessedTime());

            PrintWriter pw = resp.getWriter();
            pw.println(req.getServletContext().getAttribute("servlet_key"));
            pw.println(req.getAttribute("request_key"));
            pw.println(hs.getAttribute("session_key") + " " + hs.getId() + " " + hs.getLastAccessedTime());
        }

}
