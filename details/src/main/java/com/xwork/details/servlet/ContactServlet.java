package com.xwork.details.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init congif...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running ContactServlet on uring doGet method");

		String name = req.getParameter("contactName");
		String email = req.getParameter("contactEmail");
		String mobile = req.getParameter("contactMobile");
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 3) {
			writer.print("<span style='colour:green;'>");
			writer.print("Login Sucessfully " + name);
		} else {
			writer.print("<span style='colour:red;'>");
			writer.print("name should be greather than 3 charaters");
		}

		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}

}
