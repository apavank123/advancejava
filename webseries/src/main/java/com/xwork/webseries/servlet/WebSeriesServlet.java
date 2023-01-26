package com.xwork.webseries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webseries")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Created..... " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in WebSeriesServlet.....");
		String name = req.getParameter("webseriesName");
		String language = req.getParameter("Languages");
		String noOfEpisodes = req.getParameter("NoOfEpisodes");
		String oTTPLatForm = req.getParameter("OTTPLatForm");
		String budget = req.getParameter("Budget");

		System.out.println(name + "\n" + language + "\n" + noOfEpisodes + "\n" + oTTPLatForm + "\n" + budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<span>");
		writer.print("<h1>");
		writer.print("WebSeries Name " + name + " Sent Successfuly");
		writer.print("</h1>");
		writer.print("</span>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}
