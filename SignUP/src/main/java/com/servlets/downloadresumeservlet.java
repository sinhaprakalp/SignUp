package com.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class downloadresumeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String file = "filesResume.doc";
		String path = "C:\\Users\\SANKALP\\eclipse-workspace\\prakalp\\programsjava\\SignUP\\";
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + file + "\"");

		FileInputStream fileInputStream = new FileInputStream(path + file);

		int i;
		while ((i = fileInputStream.read()) != -1) {
			out.write(i);
		}
		fileInputStream.close();
		out.close();

	}




}