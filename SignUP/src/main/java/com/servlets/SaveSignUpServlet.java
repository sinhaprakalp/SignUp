package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Details;
import com.helper.FactoryProvider;

public class SaveSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SaveSignUpServlet() {
        super();

    }




	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// firstname,username,password
			String fname = request.getParameter("firstname");
			String uname = request.getParameter("username");
			String password = request.getParameter("password");

			Details details = new Details(fname, uname, password);
			// System.out.println(details.getId() + ": " + details.getFname());
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			s.save(details);
			tx.commit();
			s.close();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Registration is successfully done</h1>");
		} catch (Exception e) {
			e.printStackTrace();
	}

}
}