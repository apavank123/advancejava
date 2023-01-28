package com.xwork.details.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")

public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init congif...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running LocationServlet on uring doGet method");

		String name1 = req.getParameter("LocationName");
		String email1 = req.getParameter("LocationEmail");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name1);
		System.out.println(email1);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name1.length() > 3) {
			writer.print("<span style='colour:green;'>");
			writer.print("Login Sucessfully " + name1);
		} else {
			writer.print("<span style='colour:red;'>");
			writer.print("name should be greateer than 3 charaters");
		}
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
