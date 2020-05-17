
package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrlogin.dao.HrLoginDao;


public class HrLoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname1 = request.getParameter("uname1");
		String password2 = request.getParameter("password2");

		HrLoginDao hrdao = new HrLoginDao();

		try {
			if (hrdao.check(uname1, password2)) {
				response.sendRedirect("Welcome.jsp");
			} else {
				response.sendRedirect("SignIn.jsp");
			}
		} catch (Exception ex) {
			ex.printStackTrace();

	}


	}
}


