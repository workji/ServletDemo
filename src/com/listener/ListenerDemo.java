package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerDemo implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ListenerDemo Start");
		ServletContext st=sce.getServletContext();
		st.setAttribute("servlet_key", "servlet_value");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ListenerDemo End");
		ServletContext st=sce.getServletContext();
		st.removeAttribute("servlet_key");
	}

}
