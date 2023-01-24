package com.xwork.pavan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deepu", loadOnStartup = 10)
public class PumaServlet extends HttpServlet {

	public PumaServlet() {
		System.out.println("Created..... " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init of PumaServlet");

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get from PumaServlet");
		String data = "Puma shoes super";
		PrintWriter writter = resp.getWriter();
		writter.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from PumaServlet");
		String data0 = "Car race,then !! Curd rice!!,egg rice,happy";
		PrintWriter writer = resp.getWriter();
		writer.print(data0);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PumaServlet...dodeletex....on web page.....");
		String data1 = "Deepu Always use puma brands ";
		PrintWriter writer = resp.getWriter();
		writer.print(data1);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PumaServlet...doPut....on web page.....");
		String data2 = "Car race,then !! Curd rice!!,egg rice,happy";
		PrintWriter writer = resp.getWriter();
		writer.print(data2);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PumaServlet...doHead....on web page.....");
		String data3 = "Deepu Always use puma brands ";
		PrintWriter writer = resp.getWriter();
		writer.print(data3);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PumaServlet...doOptions....on web page.....");
		String data4 = "Deepu Always use puma brands ";
		PrintWriter writer = resp.getWriter();
		writer.print(data4);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PumaServlet..doTrace....on web page.....");
		String data5 = "Deepu Always use puma brands ";
		PrintWriter writer = resp.getWriter();
		writer.print(data5);
		resp.setContentType("text/plain");
	}

}
