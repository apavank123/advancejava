package com.xwork.pavan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5, urlPatterns = "/temple")
public class TempleServlet extends HttpServlet {

	public TempleServlet() {
		System.out.println("Created " + getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created succesfully");
	}
}
