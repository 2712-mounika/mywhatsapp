package com.whatsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whatsapp.entity.WhatsappEmployee;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterafce;

/**
 * Servlet implementation class GlobalServlet
 */
public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		String s=request.getParameter("ac");
		if(s.equals("login"))
		{
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			WhatsappEmployee we = new WhatsappEmployee();
			we.setName(name);
			we.setEmail(email);
			we.setPassword(password);
			WhatsappServiceInterafce wi=WhatsappService.createServiceObject();
			int i= wi.createProfile(we);
			if(i>0)
			{
				out.println("created");
			}
			else
			{
				out.println("no");
			}
		}
			
	}

}
