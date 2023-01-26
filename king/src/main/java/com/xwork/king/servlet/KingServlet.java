package com.xwork.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("Created.... " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in KingServlet.....");
		String name = req.getParameter("Name");
		String region = req.getParameter("Region");
		String noOfQueen = req.getParameter("NoOfQueen");
		String dateOfBirth = req.getParameter("DateOfBirth");
		String dateOfDeath = req.getParameter("DateOfDeath");

		System.out.println(name + "\n" + region + "\n" + noOfQueen + "\n" + dateOfBirth + "\n" + dateOfDeath);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<span>");
		writer.print("<h1>");
		writer.print("King Name " + name + " Sent Successfuly");
		writer.print("</h1>");
		writer.print("</span>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
