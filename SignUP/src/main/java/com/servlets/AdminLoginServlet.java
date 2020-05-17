package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.dao.AdminLoginDao;


public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname2 = request.getParameter("uname2");
		String password3 = request.getParameter("password3");

		AdminLoginDao dao = new AdminLoginDao();

		if (dao.check(uname2, password3)) {
			response.sendRedirect("Welcome.jsp");
		}
		else {
			response.sendRedirect("SignIn.jsp");
		}
	}


}
