package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.LoginDao;


public class loginservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		LoginDao dao = new LoginDao();

		if (dao.check(uname, password)) {
			response.sendRedirect("ResumeUpload.jsp");
		}
		else {
			response.sendRedirect("SignIn.jsp");
		}
	}


}
